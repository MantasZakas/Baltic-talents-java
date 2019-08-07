package LectureProblem2;

import java.util.Scanner;

public class lectureProblem2 {

	/**
	 * returns a number rounded to a specified precision
	 * 
	 * @param {double} number
	 * @param {integer} magnitude
	 * @return {double}
	 */
	public static double round (double number, int precision) {
		double ratio = Math.pow(10, precision);
		return Math.round(number * ratio) / ratio;
	}
	
	/**
	 * returns a number rounded to a 2 digit precision
	 * 
	 * @param {double} number
	 * @return {double}
	 */
	public static double round (double number) {
		return round(number, 2);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		double number = in.nextDouble();
		System.out.print("Enter precision: ");
		int precision = in.nextInt();
		in.close();
		System.out.println(round(number, precision));
		System.out.println(round(number));
	}
}
