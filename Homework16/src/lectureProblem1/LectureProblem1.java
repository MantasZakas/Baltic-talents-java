package lectureProblem1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LectureProblem1 {
	
	public static void getBooks(Map<Author, ArrayList<Book>> bookshop, String name, String surname) {
		Author author = new Author(name, surname);
		System.out.println(author + ": " + bookshop.get(author));
	}

	public static void main(String[] args) {
		
		Map<Author, ArrayList<Book>> bookshop = new HashMap<Author, ArrayList<Book>>();
		
		bookshop.put(new Author("John", "Smith"), new ArrayList<Book>());
		bookshop.put(new Author("Mary", "Black"), new ArrayList<Book>());
		
		bookshop.get(new Author("John", "Smith")).add(new Book("Untitled", 100));
		bookshop.get(new Author("John", "Smith")).add(new Book("Random", 200));
		bookshop.get(new Author("Mary", "Black")).add(new Book("Boring", 300));
		
		getBooks(bookshop, "John", "Smith");
		getBooks(bookshop, "Mary", "Black");

	}

}
