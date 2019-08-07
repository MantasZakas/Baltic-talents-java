package homework1;

import java.io.Serializable;
import java.util.Arrays;

public class Dish implements Serializable{

	/**
	 * Serialization
	 */
	private static final long serialVersionUID = 1L;
	String name;
	Ingredient[] ingredients = null;
	
	/**
	 * @param name
	 */
	public Dish(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return name;
	}
	
	/**
	 * Add new ingredient to ingredients array
	 * @param name
	 * @param fat
	 * @param protein
	 * @param carbohydrates
	 * @param amount
	 */
	public void addIngredient(String name, Double fat, Double protein, Double carbohydrates, Double amount) {
		int length = 0;
		if (ingredients == null) ingredients = new Ingredient[0];
		else length = ingredients.length;
		ingredients = Arrays.copyOf(ingredients, length + 1);
		ingredients[length] = new Ingredient(name, fat, protein, carbohydrates, amount);
	}
	
	/**
	 * 
	 * @return sum of fat in all ingredients
	 */
	public double totalFat() {
		double totalFat = 0.0;
		for(Ingredient ingredient: ingredients) {
			totalFat += ingredient.fat;
		}
		return totalFat;
	}
	
	/**
	 * 
	 * @return sum of protein in all ingredients
	 */
	public double totalProtein() {
		double totalProtein = 0.0;
		for(Ingredient ingredient: ingredients) {
			totalProtein += ingredient.protein;
		}
		return totalProtein;
	}
	
	/**
	 * 
	 * @return sum of carbohydrates in all ingredients
	 */
	public double totalCarbohydrates() {
		double totalCarbohydrates = 0.0;
		for(Ingredient ingredient: ingredients) {
			totalCarbohydrates += ingredient.carbohydrates;
		}
		return totalCarbohydrates;
	}

	public class Ingredient implements Serializable{
		/**
		 * Serialization
		 */
		private static final long serialVersionUID = 1L;
		
		String name;
		Double fat;
		Double protein;
		Double carbohydrates;
		Double amount;
		
		/**
		 * @param name
		 * @param fat
		 * @param protein
		 * @param carbohydrates
		 * @param amount
		 */
		private Ingredient (String name, Double fat, Double protein, Double carbohydrates, Double amount) {
			this.name = name;
			this.fat = fat;
			this.protein = protein;
			this.carbohydrates = carbohydrates;
			this.amount = amount;
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
		 * @return the fat
		 */
		public Double getFat() {
			return fat;
		}

		/**
		 * @param fat the fat to set
		 */
		public void setFat(Double fat) {
			this.fat = fat;
		}

		/**
		 * @return the protein
		 */
		public Double getProtein() {
			return protein;
		}

		/**
		 * @param protein the protein to set
		 */
		public void setProtein(Double protein) {
			this.protein = protein;
		}

		/**
		 * @return the carbohydrates
		 */
		public Double getCarbohydrates() {
			return carbohydrates;
		}

		/**
		 * @param carbohydrates the carbohydrates to set
		 */
		public void setCarbohydrates(Double carbohydrates) {
			this.carbohydrates = carbohydrates;
		}

		/**
		 * @return the amount
		 */
		public Double getAmount() {
			return amount;
		}

		/**
		 * @param amount the amount to set
		 */
		public void setAmount(Double amount) {
			this.amount = amount;
		}

		@Override
		public String toString() {
			return "Ingredient [name=" + name + "]";
		}

	}
	
}
