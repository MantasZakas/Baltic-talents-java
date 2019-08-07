package finalProject;

/**
 * Class to represent hamsters
 * @author Mantas
 *
 */
public class Hamster extends Animal{
	
	/**
	 * The length of the hamsters tail
	 */
	public int tailLength;
	
	/**
	 * The colour of the hamster
	 */
	public String colour;

	/**
	 * Constructor method for the Hamster class
	 * @param name
	 * @param type
	 */
	public Hamster(String name) {
		super(name, "Žiurkėnas");
	}

	/**
	 * @return the tailLength
	 */
	public int getTailLength() {
		return tailLength;
	}

	/**
	 * @param tailLength the tailLength to set
	 */
	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return type + ". Vardas: " + name + ", Uodegos ilgis: " + tailLength + ", Spalva: " + colour;
	}
	
}
