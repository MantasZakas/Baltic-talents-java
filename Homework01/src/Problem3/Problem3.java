package Problem3;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			System.out.println("Enter coordinates:");
			System.out.print("x1: ");
			double x1 = in.nextDouble();
			System.out.print("y1: ");
			double y1 = in.nextDouble();
			System.out.print("x2: ");
			double x2 = in.nextDouble();
			System.out.print("y2: ");
			double y2 = in.nextDouble();
		in.close();
		
		double width = Math.abs(x1 - x2);
		double height = Math.abs(y1 - y2);
		System.out.print("Rectangle area is: " + width * height + "; perimeter is: " + (2 * height + 2 * width));
	}

}
