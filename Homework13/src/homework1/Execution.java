package homework1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execution {

	public static void main(String[] args) throws FileNotFoundException {

		List<Double> numbers = new ArrayList<>();
		Scanner sc = new Scanner(new File("data.txt"));
		while (sc.hasNext()) {
			numbers.add(sc.nextDouble());
		}
		sc.close();
		Double sum = 0.0;
		Double min = numbers.get(0);
		Double max = numbers.get(0);
		for (double number: numbers) {
			sum += number;
			if (min > number) min = number;
			if (max < number) max = number; 
		}
		System.out.println("Smallest number is " + min);
		System.out.println("Largest number is " + max);
		System.out.println("Average is " + sum / numbers.size());
				
	}

}
