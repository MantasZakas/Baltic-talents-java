package problem2;

import java.util.Scanner;

public class Problem2 {
	
	/**
	 * Check if a given year is a leap year.
	 * 
	 * @param year {integer}
	 * @return {boolean}
	 */
	public static boolean isItALeapYear (int year) {
		boolean answer = false;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) answer = true;
		return answer;
	}
	
	/**
	 * Calculate the number of days since the beginning of a given year to the beginning of a given month
	 * 
	 * @param year {integer}
	 * @param month {integer}
	 * @return {integer}
	 */
	public static int daysByMonth (int year, int month) {
		int totalDays = 0;
		for (int i = 1; i <= month; i++) {
			switch (i) {
			case 1: //January (no months are over)
				break;
			case 2: //February (January is over)
			case 4: //April (March is over)
			case 6: //June (May is over)
			case 8: //August (July is over)
			case 9: //September (August is over)
			case 11: //November (October is over)
				totalDays += 31;
				break;
			case 3: //March (February is over)
				totalDays += 28;
				if (isItALeapYear(year)) totalDays++;
				break;
			case 5: //May (April is over)
			case 7: //July (June is over)
			case 10: //October (September is over)
			case 12: //December (November is over)
				totalDays += 30;
				break;
			}
		}
		
		return totalDays;
	}
	
	/**
	 * Return the amount of days between two given dates
	 * 
	 * @param y1 {integer}
	 * @param m1 {integer}
	 * @param d1 {integer}
	 * @param y2 {integer}
	 * @param m2 {integer}
	 * @param d2 {integer}
	 * @return {integer}
	 */
	public static int dayDifference (int y1, int m1, int d1, int y2, int m2, int d2) {
		int totalDays = 0;
		int year = y1;
		//calculate the day difference from year variables
		for (int totalYears = y2 - y1; totalYears > 0; totalYears--) {
			totalDays += 365;
			if (isItALeapYear(year)) totalDays++;
			year++;
		}
		//add the day difference from month variables
		totalDays += daysByMonth (y2, m2) - daysByMonth (y1, m1);
		//add the day difference from month variables
		totalDays += d2 - d1;
		if (totalDays < 0) totalDays = 0;
		return totalDays;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first date (year, month, day): \t");
		int y1 = in.nextInt();
		int m1 = in.nextInt();
		int d1 = in.nextInt();
		System.out.print("Enter second date (year, month, day): \t");
		int y2 = in.nextInt();
		int m2 = in.nextInt();
		int d2 = in.nextInt();
		in.close();
		System.out.print("number of days between the dates is: \t" + dayDifference (y1, m1, d1, y2, m2, d2));
	}

}
