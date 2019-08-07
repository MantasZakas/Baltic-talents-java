package problem3;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ammount of numbers: ");
		int n = in.nextInt();
		int[] numbers = new int[n];
		System.out.print("Enter numbers: ");
		for (int i = 0; i < n; i++) numbers[i] = in.nextInt();
		in.close();
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = temp;
		}
		for (int number : numbers) {
			System.out.print(number + " ");
		}

	}

}
