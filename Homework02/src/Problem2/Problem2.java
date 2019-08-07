package Problem2;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			System.out.print("Enter year: ");
			int year = in.nextInt();
		in.close();

		String output = "Not an olympic year";
		final int firstOlympicYear = 1896;
		if (year >= firstOlympicYear && year % 4 == 0) 
			output = "Olympic year number:" + (year - firstOlympicYear + 4) / 4;
		System.out.print(output);
	}

}
