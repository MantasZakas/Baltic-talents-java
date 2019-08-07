package homework1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Execution{
	
	static RecipeBook recipeBook = new RecipeBook();
	static int readLoopCounter = 0;
	
	/**
	 * Generate an array for the dish table
	 * @param recipeBook
	 * @param dishNo
	 * @return
	 */
	public static Object[] generateDishLine(RecipeBook recipeBook, int dishNo) {
		Object[] dishLine = new Object[]{
				recipeBook.recipeBook[dishNo],
				recipeBook.recipeBook[dishNo].totalFat(),
				recipeBook.recipeBook[dishNo].totalProtein(),
				recipeBook.recipeBook[dishNo].totalCarbohydrates()
				};
		return dishLine;
	}
	
	/**
	 * Generate an array for the ingredient table
	 * @param recipeBook
	 * @param dishNo
	 * @param ingredientNo
	 * @return
	 */
	public static Object[] generateIngredientLine(RecipeBook recipeBook, int dishNo, int ingredientNo) {
		Object[] ingredientLine = new Object[]{
				recipeBook.recipeBook[dishNo].ingredients[ingredientNo].name,
				recipeBook.recipeBook[dishNo].ingredients[ingredientNo].fat,
				recipeBook.recipeBook[dishNo].ingredients[ingredientNo].protein,
				recipeBook.recipeBook[dishNo].ingredients[ingredientNo].carbohydrates,
				recipeBook.recipeBook[dishNo].ingredients[ingredientNo].amount,
				};
		return ingredientLine;
	}
	
	public static void displayRecipes(RecipeBook recipeBook, DefaultTableModel recipeListModel) {
		try {
			recipeListModel.setRowCount(0);
			for (int i = 0; i < recipeBook.recipeBook.length; i++) {
				recipeListModel.addRow(generateDishLine(recipeBook, i));
			};
		} catch (Exception e) {
			// do nothing and leave an empty table
		} 
	}
	
	/**
	 * Read recipes from file
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void readRecipeBookFromFile () throws IOException {
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("recipeBook.txt"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			recipeBook = (RecipeBook) ois.readObject();
			ois.close();				
		} catch (Exception e) {
			readLoopCounter++;
			if (readLoopCounter > 3) { //stop the loop from being infinite
				System.out.println("Can't read or crate recipeBook.txt");
				System.exit(0);
			}
			writeRecipeBookToFile(); //if file is not found or unreadable, create a new one
			readRecipeBookFromFile();
			readLoopCounter = 0;
		}
		
	}
	
	/**
	 * Write recipes to file
	 * @throws IOException
	 */
	public static void writeRecipeBookToFile () throws IOException {
		FileOutputStream fos = new FileOutputStream(new File("recipeBook.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(recipeBook);
		oos.close();
		fos.close();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		//TODO for testing purposes generate a sample recipe book
//		RecipeBook recipeBookUpload = new RecipeBook();	
//		Dish dish1 = new Dish("stew");
//		dish1.addIngredient("potato", 1.0, 2.0, 3.0, 4.0);
//		dish1.addIngredient("carrot", 0.1, 0.2, 0.3, 0.4);
//		dish1.addIngredient("turnip", 0.0, 0.0, 0.0, 0.0);
//		Dish dish2 = new Dish("salad");
//		dish2.addIngredient("cheese", 1.0, 2.0, 3.0, 4.0);
//		dish2.addIngredient("lettuce", 0.1, 0.2, 0.3, 0.4);
//		recipeBookUpload.addDish(dish1);
//		recipeBookUpload.addDish(dish2);
//		FileOutputStream fos = new FileOutputStream(new File("recipeBook.txt"));
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(recipeBookUpload);
//		oos.close();
//		fos.close();	
		
		readRecipeBookFromFile();
		
		//create window
		JFrame f = new JFrame("Recipies");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp = new JPanel();		
		f.add(jp);
		
		//create recipe table
		DefaultTableModel recipeListModel = new DefaultTableModel();
		JTable recipeListTable = new JTable(recipeListModel);
		JScrollPane scrollPane1 = new JScrollPane(recipeListTable);
		recipeListTable.setFillsViewportHeight(true);	
		recipeListModel.addColumn("Dish");
		recipeListModel.addColumn("Fat");
		recipeListModel.addColumn("Protein");
		recipeListModel.addColumn("Carbs");
		displayRecipes(recipeBook, recipeListModel);
		jp.add(scrollPane1);
		
		
		//create ingredient table
		DefaultTableModel indredientListModel = new DefaultTableModel();
		JTable ingredientListTable = new JTable(indredientListModel);
		JScrollPane scrollPane2 = new JScrollPane(ingredientListTable);
		ingredientListTable.setFillsViewportHeight(true);	
		indredientListModel.addColumn("Ingredient");
		indredientListModel.addColumn("Fat");
		indredientListModel.addColumn("Protein");
		indredientListModel.addColumn("Carbs");
		indredientListModel.addColumn("Amount");
		jp.add(scrollPane2);
		
		//create a button and inputs for new stuff
		JPanel jpBottom = new JPanel();
		jpBottom.setLayout(new BoxLayout(jpBottom, BoxLayout.PAGE_AXIS));
		jp.add(jpBottom);
		LabelAndInput recipe = new LabelAndInput("Recipe");
		jpBottom.add(recipe.jp);
		LabelAndInput name = new LabelAndInput("Name");
		jpBottom.add(name.jp);
		LabelAndInput fat = new LabelAndInput("Fat");
		jpBottom.add(fat.jp);
		LabelAndInput protein = new LabelAndInput("Protein");
		jpBottom.add(protein.jp);
		LabelAndInput carbs = new LabelAndInput("Carbs");
		jpBottom.add(carbs.jp);
		LabelAndInput amount = new LabelAndInput("Amount");
		jpBottom.add(amount.jp);
		
		JButton button = new JButton("Add ingredient");
		jpBottom.add(button);
		
		//create event listener for the dish table
		recipeListTable.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				int dishNo = recipeListTable.getSelectedRow();
				indredientListModel.setRowCount(0);
				try {
					for (int i = 0; i < recipeBook.recipeBook[dishNo].ingredients.length; i++) {
						indredientListModel.addRow(generateIngredientLine(recipeBook, dishNo, i));
					};
				} catch (Exception f) {
					// do nothing if dish table is empty
				}
				
			}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
		
		//create event listener for the add ingredient button
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clear both tables
				recipeListModel.setRowCount(0);
				indredientListModel.setRowCount(0);
				//get data for text fields
				try {
					String selectedName = recipe.textField.getText();
					String selectedIngredient = name.textField.getText();
					Double selectedFat = Double.parseDouble(fat.textField.getText());
					Double selectedProtein = Double.parseDouble(protein.textField.getText());
					Double selectedCarbohydrates = Double.parseDouble(carbs.textField.getText());
					Double selectedAmount = Double.parseDouble(amount.textField.getText());
					//update recipe book
					Dish selectedDish = recipeBook.getDishByName(selectedName);
					selectedDish.name = recipe.textField.getText();
					selectedDish.addIngredient(selectedIngredient, selectedFat, selectedProtein, selectedCarbohydrates, selectedAmount);
				} catch (Exception x) {
					// do nothing if text fields are not filled properly
				}
				displayRecipes(recipeBook, recipeListModel); //save changes in file
				try {
					writeRecipeBookToFile();
				} catch (IOException e1) {
					System.out.println("Can't save changes");
				}

			}
		});
		
		//display window
		f.setSize(1000, 800);
		f.setVisible(true);
		
	}

}
