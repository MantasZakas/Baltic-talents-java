package problem5;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double r = in.nextDouble();
		System.out.print("Enter ammount: ");
		int n = in.nextInt();
		in.close();
		double area = 0;
		for ( ; n > 0; n--) {
			area += Math.PI * Math.pow(r, 2);
			r *= 2;
		}
		System.out.print("Total area is " + area);
	}

}
