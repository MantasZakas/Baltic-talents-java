package Problem4;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			System.out.print("Enter a three digit number: ");
			int number = in.nextInt();
		in.close();
		
		if (number < 100 || number > 999) {
			System.out.print("Invalid number");
			return;
		}
		int digit1 = number % 10;
		int digit2 = number / 10 % 10;
		int digit3 = number /100;
		String output = "Not an Armstrong number";
		if (number == Math.pow(digit1, 3) + Math.pow(digit2, 3) + Math.pow(digit3, 3))
			output = "Armstrong number";
		System.out.print(output);

	}

}
