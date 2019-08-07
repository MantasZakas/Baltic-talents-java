package LectureProblem3;

import java.util.Scanner;

public class LectureProblem3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers, end with 0: ");
		int i = 0;
		int j = - 1;
		int sum = 0;
		do {
			sum += i;
			i = in.nextInt();
			j++;
		} while (i != 0);
		System.out.println("The sum is: " + sum + "; the average is: " + (double) sum / j);
	}

}
