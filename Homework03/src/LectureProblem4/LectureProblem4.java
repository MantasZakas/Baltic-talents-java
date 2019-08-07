package LectureProblem4;

import javax.annotation.processing.RoundEnvironment;

public class LectureProblem4 {

	public static void main(String[] args) {
		final double convertion = 2.54;
		System.out.println ("in\tcm\t |cm\tin");
		for (int i = 1; i <= 10; i++) {
			System.out.println (i + "\t" + i * convertion + "\t |" + i + "\t" + Math.round(i / convertion * 100) / 100.0);
		}
	}

}
