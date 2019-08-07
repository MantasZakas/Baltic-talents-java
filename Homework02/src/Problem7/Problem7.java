package Problem7;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			System.out.print("Enter a year: ");
			int year = in.nextInt();
		in.close();

		if (year < 0 ) {
			System.out.print("invalid year");
			return;
		}
		String color = "";
		switch (year % 10) {
		case 0:
		case 1:
			color = "White";
			break;
		case 2:
		case 3:
			color = "Black";
			break;
		case 4:
		case 5:
			color = "Green";
			break;
		case 6:
		case 7:
			color = "Red";
			break;
		case 8:
		case 9:
			color = "Yellow";
			break;
		}
		System.out.print(color);

	}

}
