package problem3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("problem3data.txt"));
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		int [][] table = new int [size2][size1];
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				table[j][size1 - 1 -i] = sc.nextInt();
			}
		}
		sc.close();
		
		for (int [] row: table) {
			for (int number: row) {
				System.out.print(number + " ");
			}
			System.out.println();
		}

	}

}
