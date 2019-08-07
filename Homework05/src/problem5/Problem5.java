package problem5;

import java.util.Scanner;

public class Problem5 {
	
	/**
	 * checks if a given number is prime in a not very optimal way
	 * 
	 * @param number {integer}
	 * @return {boolean}
	 */
	public static boolean isItPrime(int number) {
		boolean prime = false;
		for (int i = 2; i <= number; i++) { //start at 2, because 1 and 0 are not primes
			if (number == i) prime = true;
			if (number % i == 0) break;
			
		}
		return prime;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ammount of numbers: ");
		int n = in.nextInt();
		int[] numbers = new int[n];
		System.out.print("Enter numbers: ");
		for (int i = 0; i < n; i++) numbers[i] = in.nextInt();
		in.close();
		String primeString = "Prime numbers are: ";
		String compositeString = "Composite numbers are: ";
		for (int number : numbers) {
			if (isItPrime(number)) primeString += number + " ";
			else compositeString += number + " ";
		}
		System.out.println(primeString);
		System.out.println(compositeString);
	}

}
