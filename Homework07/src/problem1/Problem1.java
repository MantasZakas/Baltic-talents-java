package problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		try {
			Scanner scList = null;
			try {
				scList = new Scanner(new File("data/list.txt"));
			} catch (FileNotFoundException e) {
				System.out.println("list.txt not found");
				System.exit(0);
			}
			double totalSalary = 0;
			boolean filesAreBroken = false;
			while (scList.hasNext()) {
				String name = "data/" + scList.next() + ".txt";
				Scanner scName = null;
				try {
					scName = new Scanner(new File(name));
					try {
						for (int i = 0; i < 3; i++) {
							String tmp = scName.nextLine();
						}
						totalSalary += scName.nextDouble();
						scName.close();
					} catch (Exception e) {
						System.out.println("Problem reading " + name);
						filesAreBroken = true;
					}
				} catch (FileNotFoundException e) {
					System.out.println(name + " not found");
					filesAreBroken = true;
				}
			}
			scList.close();
			if (filesAreBroken) System.exit(0);
			
			Scanner sc = new Scanner(System.in);
			boolean continueLoop = true;
			while (continueLoop) {
				System.out.print("Enter name: ");
				String name = sc.next();
				Scanner scFile = null;
				try {
					scFile = new Scanner(new File("data/" + name + ".txt"));
				} catch (Exception e) {
					System.out.println("Name not found");
					continue;
				}
				System.out.println();
				while (scFile.hasNext()) {
					String fileLine = scFile.nextLine();
					System.out.println(fileLine);
				}
				scFile.close();
				while (true) {
					System.out.println();
					System.out.print("Do you wish to continue (yes/no): ");
					String answer = sc.next();
					if (answer.contentEquals("yes")) {
						break;
					}
					if (answer.contentEquals("no")) {
						continueLoop = false;
						break;
					}
					System.out.println("Invalid answer");
				}
			}
			sc.close();
			
			System.out.println();
			System.out.println("Total salary is: " + totalSalary);
		} catch (Exception e) {
			System.out.println("Unknown error occured.");
		}

	}

}
