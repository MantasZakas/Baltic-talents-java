package lectureProblem1;

public class Execution {

	public static void main(String[] args) {
		
		Item p1 = new Item("Apple", 0.60);
//		p1.name = "Apple";
//		p1.setPrice(0.60);
		p1.weight = 1.0;
		
		Item p2 = new Item("Pear", 1.20, 1.0);
//		p2.name = "Pear";
//		p2.setPrice(1.20);
//		p2.weight = 1.0;
		
		System.out.println("item p1 - " + p1);
		System.out.println("item p2 - " + p2.toString());

		System.out.println(p2.price(3.0));
		System.out.println(p2.priceVAT(3.0));
		System.out.println(p1.price(3.0));

	}

}
