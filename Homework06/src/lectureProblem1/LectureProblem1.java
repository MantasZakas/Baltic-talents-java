package lectureProblem1;

import java.util.Scanner;

public class LectureProblem1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int [][] arr = new int [5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int [] sums = new int[5];
		for (int i = 0; i < 5; i++) {
			int sum = 0;
			for (int j = 0; j < 5; j++) {
				sum += arr[i][j];
			}
			sums[i] = sum;
			System.out.print(sum + " ");
		}
		
		sc.close();
	}

}
