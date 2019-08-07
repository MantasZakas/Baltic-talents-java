package LectureProblem1;

import java.util.Scanner;

public class LectureProblem1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int number = in.nextInt();
		in.close();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "\t * " + number + " = \t" + i * number);
		}

	}

}
