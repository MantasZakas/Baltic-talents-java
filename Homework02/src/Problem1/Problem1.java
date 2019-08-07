package Problem1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			System.out.print("Enter side a: ");
			int a = in.nextInt();
			System.out.print("Enter side b: ");
			int b = in.nextInt();
			System.out.print("Enter side c: ");
			int c = in.nextInt();
			System.out.print("Enter side d: ");
			int d = in.nextInt();
			in.close();
	
			String answer = "Not a rectange";
			if ((a == b && c == d) ||
					(a == c && b == d) ||
					(a == d && b == c)) answer = "Rectangle";
	
			System.out.print(answer);

	}

}
