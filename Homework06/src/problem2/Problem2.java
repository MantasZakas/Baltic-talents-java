package problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("problem2data.txt"));
		int size = sc.nextInt();
		int [][] table = new int [size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				table[i][j] = sc.nextInt();
				if (i == j || j == size - 1 - i) table[i][j] = 0;
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
