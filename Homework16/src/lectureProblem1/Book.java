package lectureProblem1;

public class Book {

	String name;
	Integer pages;
	
	/**
	 * @param name
	 * @param pages
	 */
	public Book(String name, Integer pages) {
		super();
		this.name = name;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return name + " " + pages;
	}
	
	
}
