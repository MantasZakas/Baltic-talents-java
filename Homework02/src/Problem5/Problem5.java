package Problem5;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			System.out.print("Enter a: ");
			double a = in.nextInt();
			System.out.print("Enter b: ");
			double b = in.nextInt();
			System.out.print("Enter c: ");
			double c = in.nextInt();
		in.close();

		String output = "Equation has no real roots";
		double d = Math.pow(b, 2) - 4 * a * c;
		if (d >= 0) {
			double x1 = (- b - Math.sqrt(d)) / (2 * a);
			double x2 = (- b + Math.sqrt(d)) / (2 * a);
			output = "Roots are: " + x1 + " and " + x2;
		}
		System.out.print(output);

	}

}
