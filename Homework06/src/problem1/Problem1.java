package problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) throws FileNotFoundException  {
		Scanner sc = new Scanner(new File("problem1data.txt"));
		int number = sc.nextInt();
		int [][] weeks = new int [number][7];
		for (int [] week: weeks) {
			for (int i = 0; i < 7; i++) {
				week[i] = sc.nextInt();
			}
		}
		sc.close();
		
		for (int i = 0; i < weeks.length; i++) {
			double average = 0;
			for (int j = 0; j < 7; j++) {
				average += weeks[i][j];
			}
			average /= 7;
			System.out.println("average temperature for week " + i + " is: " + average);
		}
	}

}
