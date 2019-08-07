package problem4;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ammount of houses: ");
		int n = in.nextInt();
		int[] houses = new int[n];
		System.out.print("Enter the number of inhabitants in each house: ");
		for (int i = 0; i < n; i++) houses[i] = in.nextInt();
		in.close();
		int leftHouses = 0;
		int leftInhabitants = 0;
		int rightHouses = 0;
		int rightInhabitants = 0;
		//house numbers are 1 more than index numbers, i.e. right side houses have odd indexes
		for (int i = 0; i < houses.length; i++) {
			if (i % 2 == 0) {
				leftHouses++;
				leftInhabitants += houses[i];
			} else {
				rightHouses++;
				rightInhabitants += houses[i];
			}
		}
		System.out.println("Total number of inhabitants in the street: " + (leftInhabitants + rightInhabitants));
		System.out.println("Total number of inhabitants on the left side: " + (leftInhabitants));
		System.out.println("Total number of inhabitants on the right side: " + (rightInhabitants));
		System.out.println("Average number of inhabitants on the left side: " + 
				Math.round((double) leftInhabitants / leftHouses));
		System.out.println("Average number of inhabitants on the right side: " + 
				Math.round((double) rightInhabitants / rightHouses));

	}

}
