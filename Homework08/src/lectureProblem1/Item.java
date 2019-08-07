package lectureProblem1;

public class Item {
	public String name;
	private Double price;
	public Double weight;
	
	public Item () {
	}

	public Item (String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public Item (String name, Double price, double weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	public void setPrice (Double price) {
		if (price > 0) this.price = price;
	}
	
	public double getPrice () {
		return this.price;
	}
	
	public Double price (double ammount) {
		return ammount * this.price;
	}
	
	private Double priceVAT () {
		return this.price * 1.21;
	}
	
	public Double priceVAT (double ammount) {
		return ammount * priceVAT();
	}

	public String toString () {
		return this.name + "; " + this.price + " EUR; " + this.weight + " kg.";
	}
}
