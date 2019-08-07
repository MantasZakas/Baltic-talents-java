package problem6;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of warehouses: ");
		int warehouses = in.nextInt();
		while (warehouses <= 1) {
			System.out.print("Enter a valid number of warehouses: ");
			warehouses = in.nextInt();
		}
		int [] netWeightChange = new int [warehouses]; //store net weight change at each warehouse
		for (int i = 0; i < warehouses - 1; i++) { //-1 because no shipments can be taken in the last warehouse
			System.out.print("Enter the number of shipments in warehouse " + (i + 1) + ": ");
			int shipments = in.nextInt();
			for (int j = 0; j < shipments; j++ ) {
				System.out.print("Enter the destination of the shipment " + (j + 1) + " of warehouse " + (i + 1) + ": ");
				int destination = in.nextInt() - 1; //-1 because warehouse index is 1 less than warehouse number
				while (destination <= i || destination > warehouses - 1) {
					System.out.print("Enter a valid destination: ");
					destination = in.nextInt() - 1;
				}
				System.out.print("Enter the weight of the shipment " + (j + 1) + " of warehouse " + (i + 1) + ": ");
				int weight = in.nextInt();
				netWeightChange[i] += weight; //weigh is added at the current warehouse
				netWeightChange[destination] -= weight; //weight is lost at the destination warehouse
			}
		}
		in.close();
		int currentWeight = 0;
		int maxWeight = 0;
		for (int warehouseWeightChange: netWeightChange) { //track max weight at each warehouse
			currentWeight += warehouseWeightChange;
			if (currentWeight > maxWeight) maxWeight = currentWeight;
		}
		System.out.print("The minimum weight capacity required is " + maxWeight);
		
	}

}
		
	
		
		
		
		
//		TODO an example of a 3d array
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter the number of warehouses: ");
//		int n = in.nextInt();
//		int[][][] warehouses = new int[n][][];
//		for (int i = 0; i < n; i++) {
//			System.out.print("Enter the number of shipments in warehouse " + (i + 1) + ": ");
//			int s = in.nextInt();
//			warehouses[i] = new int [s][];
//			for (int j = 0; j < s; j++) {
//				warehouses[i][j] = new int[2];
//				System.out.print("Enter the destination of the shipment " + (j + 1) + " of warehouse " + (i + 1) + ": ");
//				warehouses[i][j][0] = in.nextInt();
//				System.out.print("Enter the weight of the shipment " + (j + 1) + " of warehouse " + (i + 1) + ": ");
//				warehouses[i][j][1] = in.nextInt();
//			}
//		}
//		in.close();
//
//		for(int[][] arr2: warehouses) {
//			for(int[] arr3: arr2) {
//				for (int val: arr3) {
//					System.out.print(val);
//				}
//			}
//		}
		
		
