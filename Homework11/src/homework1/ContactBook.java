package homework1;

import java.io.Serializable;
import java.util.Arrays;

public class ContactBook implements Serializable{

	private static final long serialVersionUID = 1L;
	public Contact[] contactBook = null;
	
	/**
	 * Add a new contact to the contact book
	 * @param contact
	 */
	public void addContact (Contact contact) {
		int length = 0;
		if (this.contactBook == null) this.contactBook = new Contact[0];
		else length = this.contactBook.length;
		this.contactBook = Arrays.copyOf(this.contactBook, length + 1);
		this.contactBook[length] = contact;
	}
	
	/**
	 * Delete a specified contact form the contact book
	 * @param contactNo
	 */
	public void deleteContact (int contactNo) {
		if (contactNo <= this.contactBook.length) {
			this.contactBook[contactNo] = null;
			ContactBook tmp = new ContactBook();
			for (int i = 0; i < this.contactBook.length; i++) {
				if (this.contactBook[i] != null) tmp.addContact(this.contactBook[i]);
			}
			this.contactBook = tmp.contactBook;
		}
	}
	
	public static class Contact implements Serializable{
		
		private static final long serialVersionUID = 1L;
		public String name;
		public String surname;
		public String email;
		public String phone;
		public String note;
		
		/**
		 * @param name
		 * @param surname
		 * @param email
		 * @param phone
		 * @param note
		 */
		public Contact(String name, String surname, String email, String phone, String note) {
			this.name = name;
			this.surname = surname;
			this.email = email;
			this.phone = phone;
			this.note = note;
		}
		
		/**
		 * Turn a contact into an array to display in a table
		 * @param name
		 * @param surname
		 * @param email
		 * @param phone
		 * @param note
		 */
		public static String[] generateContactArray (Contact contact) {
			String[] contactArray = {
			contact.name,
			contact.surname,
			contact.email,
			contact.phone,
			contact.note
			};
			return contactArray;
		}
			
	}
	
}
