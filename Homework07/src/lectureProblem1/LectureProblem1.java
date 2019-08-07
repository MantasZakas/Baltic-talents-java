package lectureProblem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LectureProblem1 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(new File("file.txt"));
			System.out.print("Enter 2 numbers: ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int result = x / y;
			System.out.println("Result is: " + result);
			sc.close();
		} catch (ArithmeticException e) {
			System.out.println("Division is not possioble");
		} catch (InputMismatchException e) {
			System.out.println("Invalid numbers");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
//			System.out.println(e.getLocalizedMessage());
//			System.out.println(e.getStackTrace()[0]);
		} catch (Exception e) {
			System.out.println("unknown error");
		}

	}

}
