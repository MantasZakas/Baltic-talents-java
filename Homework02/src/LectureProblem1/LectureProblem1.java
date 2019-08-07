package LectureProblem1;

import java.util.Scanner;

public class LectureProblem1 {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
		System.out.print("Enter box ammount: ");
		int n = in.nextInt();
		System.out.print("Enter truck capacity: ");
		int m = in.nextInt();
	in.close();
	
	int trips = n / m;
	if (n % m != 0) trips++;
	
	System.out.print("Trips needed: " + trips);

	}

}
