package LectureProblem2;

public class LectureProblem2 {
	
	public static void main(String[] args) {
	
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				String output = "*";
				if (j == 4 || j == 5 || i == 4 || i == 5 || i == j || i == 9 - j) output = "0";
				System.out.print(output);
				output = "*";
				if (i == j) break;
			}
			System.out.println();
			
		}

	}

}