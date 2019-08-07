package problem1;

import java.util.Scanner;

public class Problem1 {

	/**
	 * calculate the area of a rectangle
	 * 
	 * @param a {double} side a
	 * @param b {double} side b
	 * @return {double}
	 */
	public static double area(double a, double b) {
		return a * b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = in.nextDouble();
		System.out.print("Enter b: ");
		double b = in.nextDouble();
		in.close();
		System.out.println("Area is: " + area(a, b));

	}

}
