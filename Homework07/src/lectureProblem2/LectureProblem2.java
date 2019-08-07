package lectureProblem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectureProblem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scFile = null;
		while (scFile == null) {
			System.out.print("Enter filename: ");
			try {
				String file = sc.next();
				scFile = new Scanner(new File(file)); 
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
			}
			while (scFile.hasNext()) {
				System.out.println(scFile.nextLine());
			}
		}
		scFile.close();

		sc.close();
	}

}
