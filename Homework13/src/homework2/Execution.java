package homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execution {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		List<String> words = new ArrayList<>();
		Scanner sc = new Scanner(new File("text.txt"));
		while (sc.hasNext()) {
			words.add(sc.next().replaceAll("[^a-zA-Z ]", ""));
		}
		for (int i = words.size() - 1; i >= 0; i--) {
			System.out.print(words.get(i) + " ");
		}
		System.out.println();
		List<String> specialEnding = new ArrayList<String>();
		for (String word: words) {
			if (word.endsWith("as")) specialEnding.add(word);
		}
		System.out.println(specialEnding);
	}
	
}
