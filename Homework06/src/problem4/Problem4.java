package problem4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner sc = new Scanner(new File("problem3data.txt"));
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int [][] table = new int [rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		//arrange columns in ascending order
		for (int i = 0; i < columns; i++) {
			int [] temp = new int [rows];
			for (int j = 0; j < rows; j++) { //store a column in a separate array
				temp[j] = table[j][i];
			}
			Arrays.sort(temp); //sort it in order
			for (int j = 0; j < rows; j++) { //put the column back
				table[j][i] = temp[j];
			}
		}
		
		for (int [] row: table) {
			for (int number: row) {
				System.out.print(number + " ");
			}
			System.out.println();
		}

	}

}
