package Problem3;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			System.out.print("Enter hours: ");
			int h = in.nextInt();
			System.out.print("Enter minutes: ");
			int m = in.nextInt();
			System.out.print("Enter seconds: ");
			int s = in.nextInt();
		in.close();

		if (h > 23 || m > 59 || s > 59) {
			System.out.print("Invalid time");
			return;
		}
		s++;
		if (s == 60) {
			s = 0;
			m++;
			if (m == 60) {
				m = 0;
				h++;
				if (h == 24) {
					h = 0;
				}
			}
		}
		System.out.print("Time after 1 s is: " + h + " h, " + m + " min, " + s + " sec.");
		
	}

}
