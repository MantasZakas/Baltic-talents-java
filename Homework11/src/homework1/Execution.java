package homework1;

import java.awt.Dimension;
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

import homework1.ContactBook.Contact;

public class Execution {

	static ContactBook contactBook = new ContactBook();
	static int readLoopCounter = 0;
	static Integer selectecContact = null;

	/**
	 * Write contacts to file
	 * @throws IOException
	 */
	public static void writeContactBookToFile() throws IOException {
		FileOutputStream fos = new FileOutputStream(new File("contactBook.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(contactBook);
		oos.close();
		fos.close();
	}

	/**
	 * Read contacts from file
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void readContactBookFromFile() throws IOException {
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("contactBook.txt"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			contactBook = (ContactBook) ois.readObject();
			ois.close();
		} catch (Exception e) {
			readLoopCounter++;
			if (readLoopCounter > 3) { // stop the loop from being infinite
				System.out.println("Can't read or crate recipeBook.txt");
				System.exit(0);
			}
			writeContactBookToFile(); // if file is not found or unreadable, create a new one
			readContactBookFromFile();
			readLoopCounter = 0;
		}
	}

	/**
	 * Display contacts in the table
	 * 
	 * @param contactBook
	 * @param contactListModel
	 */
	public static void displayContacts(ContactBook contactBook, DefaultTableModel contactListModel) {
		try {
			contactListModel.setRowCount(0); // clear the table
			for (int i = 0; i < contactBook.contactBook.length; i++) {
				contactListModel.addRow(Contact.generateContactArray(contactBook.contactBook[i]));
			}
			;
		} catch (Exception e) {
			// do nothing and leave an empty table
		}
	}

	public static void main(String[] args) throws IOException {

		// TODO Generate a sample contact book for testing purposes
//		ContactBook sampleContactBook = new ContactBook();
//		sampleContactBook.addContact(new Contact("John", "Smith", "john.smith@email.com", "001", "Stay awesome"));
//		sampleContactBook.addContact(new Contact("Mary", "Grey", "mary.grey@email.com", "002", "Nothing to see here"));
//		FileOutputStream fos;
//		try {
//			fos = new FileOutputStream(new File("contactBook.txt"));
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(sampleContactBook);
//			oos.close();
//			fos.close();
//		} catch (Exception e) {
//			// do nothing
//		}

		readContactBookFromFile();

		// create window
		JFrame f = new JFrame("Recipies");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp = new JPanel();
		f.add(jp);

		// create recipe table
		DefaultTableModel contactListModel = new DefaultTableModel();
		JTable contactListTable = new JTable(contactListModel);
		JScrollPane scrollPane = new JScrollPane(contactListTable);
		contactListTable.setFillsViewportHeight(true);
		contactListModel.addColumn("Name");
		contactListModel.addColumn("Surname");
		contactListModel.addColumn("Email");
		contactListModel.addColumn("Phone");
		contactListModel.addColumn("Note");
		displayContacts(contactBook, contactListModel);
		scrollPane.setPreferredSize(new Dimension(900, 300));
		contactListTable.setPreferredSize(new Dimension(900, 250));
		jp.add(scrollPane);

		// create buttons and inputs for new stuff
		JPanel jpLabels = new JPanel();
		jpLabels.setLayout(new BoxLayout(jpLabels, BoxLayout.PAGE_AXIS));
		jp.add(jpLabels);
		LabelAndInput name = new LabelAndInput("Name");
		jpLabels.add(name.jp);
		LabelAndInput surname = new LabelAndInput("Surname");
		jpLabels.add(surname.jp);
		LabelAndInput email = new LabelAndInput("Email");
		jpLabels.add(email.jp);
		LabelAndInput phone = new LabelAndInput("Phone");
		jpLabels.add(phone.jp);
		LabelAndInput note = new LabelAndInput("Note");
		jpLabels.add(note.jp);

		JPanel jpButtons = new JPanel();
		jpLabels.add(jpButtons);
		JButton save = new JButton("Save new contact");
		jpButtons.add(save);
		JButton delete = new JButton("Delete selected contact");
		jpButtons.add(delete);

		// create event listener for the save button
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contactListModel.setRowCount(0); // clear the table
				try {
					selectecContact = null; //remove selection for deleting the contact
					// get data from text fields
					String newName = name.textField.getText();
					String newSurname = surname.textField.getText();
					String newEmail = email.textField.getText();
					String newPhone = phone.textField.getText();
					String newNote = note.textField.getText();
					if (newName.equals("") || newSurname.equals("") || newEmail.equals("") || newPhone.equals("") || newNote.equals("")) 
						throw new Exception(); //don't do anything if fields are not filled
					// clear text fields
					name.textField.setText("");
					surname.textField.setText("");
					email.textField.setText("");
					phone.textField.setText("");
					note.textField.setText("");
					// update the contact book
					Contact newContact = new Contact(newName, newSurname, newEmail, newPhone, newNote);
					contactBook.addContact(newContact);
				} catch (Exception f) {
					// do nothing if text fields are not filled properly
				}
				displayContacts(contactBook, contactListModel); // save changes in file
				try {
					writeContactBookToFile();
				} catch (IOException e1) {
					System.out.println("Can't save changes");
				}
			}
		});

		// create event listener for the contact table
		contactListTable.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				selectecContact = contactListTable.getSelectedRow(); // save the selected contact in a global variable
			}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});

		// create event listener for the delete button
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (selectecContact != null) {
						contactBook.deleteContact(selectecContact);
						displayContacts(contactBook, contactListModel);
						selectecContact = null;
					}
				} catch (Exception g) {
					// do nothing
				}
			}
		});

		// display window
		f.setSize(1000, 800);
		f.setVisible(true);

	}
}
