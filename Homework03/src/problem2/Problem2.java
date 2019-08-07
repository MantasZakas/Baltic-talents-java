package problem2;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int m = in.nextInt();
		System.out.print("Enter another number: ");
		int n = in.nextInt();
		in.close();
		int lcd = 1;
		for (int i = 2; i < Math.min(m, n) + 1; i++)
			if (m % i == 0 && n % i == 0)
				lcd = i;
		System.out.print("Lowest common denominator is: " + lcd);
	}
}
