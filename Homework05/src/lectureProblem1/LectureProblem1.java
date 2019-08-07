package lectureProblem1;

import java.util.Scanner;

public class LectureProblem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers ending with -1 ");
		int[] numbers = new int[10];
		int a = in.nextInt();
		while(a != -1) {
			numbers[a]++;
			a = in.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
