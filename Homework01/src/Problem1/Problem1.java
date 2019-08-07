package Problem1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
			System.out.print("Enter length: ");
			int length=in.nextInt();
			System.out.print("Enter width: ");
			int width=in.nextInt();
			System.out.print("Enter price: ");
			double price=in.nextInt();
		in.close();
		
		int area=length*width;
		double finalPrice=area*price*1.05;
		System.out.println("Area: "+area);
		System.out.println("Total price: "+finalPrice);
		
	}
	
}
