package problem3;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter initial salary: ");
		double a = in.nextDouble();
		System.out.print("Enter raise: ");
		double x = in.nextDouble();
		System.out.print("Enter number of months: ");
		int n = in.nextInt();
		System.out.print("Enter final salary: ");
		double b = in.nextDouble();
		in.close();
		System.out.println("Salary after a year is: " + (a + x * 12));
		System.out.println("Salary after " + n + " months is: " + (a + x * n));
		System.out.println("Salary will double after " + (int) Math.ceil(a / x) + " months");
		System.out.println("Salary will be at least " + b + " in " + (int) Math.ceil((b - a) / n) + " months");
		while (true) {
			//this loop does nothing
			break;
		}
	}
}
