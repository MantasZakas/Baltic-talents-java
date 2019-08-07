package Problem5;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
		System.out.println("Enter the edges of a triangle: ");
		System.out.print("Edge 1: ");
		double a = in.nextDouble();
		System.out.print("Edge 2: ");
		double b = in.nextDouble();
		System.out.print("Edge 3: ");
		double c = in.nextDouble();
	in.close();
	
	double p = (a + b + c) / 2;
	double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
	if (area > 0) {
		System.out.print("Area is: " + area);
	} else {
		System.out.print("This is not a triangle");
	}
	
	}

}
