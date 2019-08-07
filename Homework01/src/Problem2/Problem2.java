package Problem2;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			System.out.print("Enter number of books: ");
			double books = in.nextInt();
			System.out.print("Enter number of people: ");
			double people = in.nextInt();
		in.close();

		System.out.print("Average books read: "+ Math.round(books / people));
	}

}
