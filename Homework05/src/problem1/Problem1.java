package problem1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ammount of cicles: ");
		int n = in.nextInt();
		double[] circles = new double[n];
		System.out.print("Enter circles: ");
		for (int i = 0; i < n; i++) circles[i] = in.nextDouble();
		in.close();
		Arrays.sort(circles);
		n--;
		int i = 1;
		while (n > 0 && circles[n] == (circles[n - 1])) {
			i++;
			n--;
		}
		System.out.println("the biggest circle has a radius of " + circles[circles.length - 1] + " and it repeats " + i + " times");
	}

}
