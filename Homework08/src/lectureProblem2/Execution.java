package lectureProblem2;

public class Execution {

	public static void main(String[] args) {
		
		Fraction x = new Fraction(1, 1, 2);
		Fraction y = new Fraction(2, 3);
		x.add(10);
		y.add(1, 3);
//		x.add(y);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x.toDouble());

	}

}
