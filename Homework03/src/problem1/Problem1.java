package problem1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int m = in.nextInt();
		System.out.print("Enter another number: ");
		int n = in.nextInt();
		in.close();
		int lcm = Math.min(m, n);
		while (lcm % m != 0 || lcm % n != 0)
			lcm++;
		System.out.print("Least common multiple is: " + lcm);
	}
}
