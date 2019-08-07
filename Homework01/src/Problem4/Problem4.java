package Problem4;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			System.out.print("Enter start hour: ");
			int h1 = in.nextInt();
			System.out.print("Enter start minute: ");
			int m1 = in.nextInt();
			System.out.print("Enter end hour: ");
			int h2 = in.nextInt();
			System.out.print("Enter end minute: ");
			int m2 = in.nextInt();
		in.close();
		
		int h = h2 - h1;
		if (h < 0) {
			h += 24;
		}
		int m = m2 - m1;
		if (m < 0) {
			m += 60;
			h--;
		}
		System.out.print("Total duration was " + h + " h " + m + " min.");
	}

}
