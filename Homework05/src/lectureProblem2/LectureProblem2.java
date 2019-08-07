package lectureProblem2;

import java.util.Scanner;

public class LectureProblem2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ammount or numbers: ");
		int i = in.nextInt();
		int[] numbers = new int[i];
		System.out.print("Enter numbers: ");
		while (i > 0) {
			i--;
			numbers[i] = in.nextInt();
		}
		in.close();

	}

}
