package LectureProblem3;

import java.util.Scanner;

public class lectureproblem3 {
	
	public static double superMultiply (double x, double y) {
		if (y == 0) return 0;
		if (y == 1) return x;
		return (x + superMultiply(x, y - 1));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x: ");
		double x = in.nextDouble();
		System.out.print("Enter y: ");
		double y = in.nextDouble();
		in.close();
		System.out.print(superMultiply(x, y));
	}

}
