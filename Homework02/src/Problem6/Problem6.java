package Problem6;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			System.out.print("Enter a year: ");
			int year = in.nextInt();
		in.close();

		if (year < 0 ) {
			System.out.print("invalid year");
			return;
		}
		String output = "Not a leap year";
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) output = "Leap year";
		System.out.print(output);

	}

}