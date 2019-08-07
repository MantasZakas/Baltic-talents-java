package problem2;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ammount of students: ");
		int n = in.nextInt();
		int[] grades = new int[n];
		System.out.print("Enter grades: ");
		for (int i = 0; i < n; i++) grades[i] = in.nextInt();
		in.close();
		Arrays.sort(grades);
		double average = 0;
		for (int grade : grades) average += grade;
		average /= grades.length;
		System.out.println(average);
		System.out.println("The best grade is: " + grades[grades.length - 1]);
		System.out.println("The worst grade is: " + grades[0]);
		System.out.println("The average grade is: " + Math.round(average));



	}

}
