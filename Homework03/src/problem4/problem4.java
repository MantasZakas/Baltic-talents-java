package problem4;

public class problem4 {

	public static void main(String[] args) {
		for (int digit1 = 1; digit1 <= 9; digit1++) {
			for (int digit2 = 1; digit2 <= 9; digit2++) {
				if (digit1 * 2 == digit2 && digit1 * 10 + digit2 == digit2 * 10 + digit1 - 36) {
					System.out.print(digit1 * 10 + digit2);
					break;
				}
			}
		}
	}
	
}
