package homework1;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Execution {

	public static void main(String[] args) {

		//create a sample phone book
		Map<String, LinkedList<String>> phonebook = new HashMap<String, LinkedList<String>>();
		phonebook.put("Smith", new LinkedList<String>());
		phonebook.put("Doe", new LinkedList<String>());
		phonebook.get("Smith").add("001");
		phonebook.get("Smith").add("002");
		phonebook.get("Doe").add("003");	
		
		//create a window
		JFrame f = new JFrame("Phone bool");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp = new JPanel();
		f.add(jp);
		JPanel jpInner = new JPanel();
		jpInner.setLayout(new BoxLayout(jpInner, BoxLayout.PAGE_AXIS));
		jp.add(jpInner);
		
		//create a table to display phone numbers		
		DefaultTableModel phoneListModel = new DefaultTableModel();
		JTable phoneListTable = new JTable(phoneListModel);
		JScrollPane scrollPane1 = new JScrollPane(phoneListTable);
		phoneListTable.setFillsViewportHeight(true);
		phoneListModel.addColumn("Number");
		jpInner.add(scrollPane1);
		jpInner.add(new JLabel("\n"));
		
		//create a drop down selector for surnames
		JComboBox<String> surnameChooser = new JComboBox<String>();
		for (String surname: phonebook.keySet()) {//add initial surnames
			surnameChooser.addItem(surname);
		}
		surnameChooser.setSelectedIndex(-1);//nothing selected by default	
		surnameChooser.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {			
				phoneListModel.setRowCount(0);//clear the table
				for (String phoneNumber: phonebook.get(surnameChooser.getSelectedItem())) {
					String[] newRow = {phoneNumber};
					phoneListModel.addRow(newRow);		
				}
			}
		});
		
		jpInner.add(surnameChooser);
		jpInner.add(new JLabel("\n"));
		
		//create the new surname input and button
		ButtonAndInput newSurname = new ButtonAndInput("Add surname");
		jpInner.add(newSurname.jp);	
		newSurname.button.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				String surname = newSurname.textField.getText();
				if (surname.equals("") || phonebook.containsKey(surname)) return;//check if a new surname is entered
				phonebook.put(surname, new LinkedList<String>());
				surnameChooser.addItem(surname);
				newSurname.textField.setText("");//clear the input field
			}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
		
		//create the add button input and button
		ButtonAndInput newNumber = new ButtonAndInput("Add number");
		jpInner.add(newNumber.jp);	
		newNumber.button.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				String number = newNumber.textField.getText();
				if (number.equals("")) return;//ignore an empty input
				phonebook.get(surnameChooser.getSelectedItem()).add(number);
				String[] newRow = {number};
				phoneListModel.addRow(newRow);
				newNumber.textField.setText("");//clear the input field
			}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
		
		//Display the window
		f.setSize(800, 800);
		f.setVisible(true);
		
	}

}
