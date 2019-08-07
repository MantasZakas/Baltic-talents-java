package LectureProblem1;

import java.util.Scanner;

public class lectureProblem1 {
	
	public static double area(double r) {
		return Math.PI * r * r;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double r = in.nextDouble();
		in.close();
		System.out.println("Area is: " + area(r));

	}

}
