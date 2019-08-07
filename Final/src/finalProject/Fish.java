package finalProject;

/**
 * Class to represent fish
 * @author Mantas
 *
 */
public class Fish extends Animal{

	/**
	 * Number of fins of the fish
	 */
	public int finNumber;
	
	/**
	 * Constructor method for the Fish class
	 * @param name
	 * @param type
	 */
	public Fish(String name) {
		super(name, "Žuvis");
	}

	/**
	 * @return the finNumber
	 */
	public int getFinNumber() {
		return finNumber;
	}

	/**
	 * @param finNumber the finNumber to set
	 */
	public void setFinNumber(int finNumber) {
		this.finNumber = finNumber;
	}

	@Override
	public String toString() {
		return type + ". Vardas: " + name + ", Pelekų kiekis: " + finNumber;
	}
	
}
