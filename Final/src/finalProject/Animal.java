package finalProject;

/**
 * Abstract parent class for animals
 * @author Mantas
 *
 */
public abstract class Animal implements Comparable<Animal>{
	
	/**
	 * Name of the animal
	 */
	public String name;
	
	/**
	 * Type of the animal
	 */
	public String type;
	
	/**
	 * Constructor method for the Animal class
	 * @param name
	 * @param type
	 */
	public Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int compareTo(Animal o) {
		if (this.type.contentEquals(o.type)) return this.name.compareTo(o.name);
		return this.type.compareTo(o.type);
	}
	
	
	
}
