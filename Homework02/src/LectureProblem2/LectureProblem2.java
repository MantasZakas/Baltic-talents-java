package LectureProblem2;

import java.util.Scanner;

public class LectureProblem2 {

	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
		System.out.print("Enter day number: ");
		int dayNo = in.nextInt();
	in.close();
	
	String dayName = "Unknown";
	switch (dayNo % 7) {
		case 0:
			dayName = "Monday";
			break;
		case 1:
			dayName = "Tuesday";
			break;
		case 2:
			dayName = "Wednesday";
			break;
		case 3:
			dayName = "Thursday";
			break;
		case 4:
			dayName = "Friday";
			break;
		case 5:
			dayName = "Saturday";
			break;
		case 6:
			dayName = "Sunday";
			break;
	}
	
	System.out.print("The day is: " + dayName);
	
	}

}
