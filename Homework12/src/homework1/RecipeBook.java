package homework1;

import java.io.Serializable;
import java.util.Arrays;

public class RecipeBook implements Serializable{

	/**
	 * Serialisation
	 */
	private static final long serialVersionUID = 1L;
	
	public Dish[] recipeBook = null;
	
	public void addDish(Dish dish) {
		int length = 0;
		if (recipeBook == null) recipeBook = new Dish[0];
		else length = recipeBook.length;
		recipeBook = Arrays.copyOf(recipeBook, length + 1);
		recipeBook[length] = dish;
	}
	
	public Dish getDishByName(String name) {
		for (Dish dish: recipeBook) {
			if (name.equals(dish.name)) {
				return dish;
			}
		}
		addDish(new Dish(name));
		return recipeBook[recipeBook.length - 1]; //return the last element, that was just added
	}

	@Override
	public String toString() {
		return Arrays.toString(recipeBook);
	}
	
	
	
}
