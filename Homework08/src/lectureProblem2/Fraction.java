package lectureProblem2;

import java.time.Year;
import java.util.Scanner;

public class Fraction {
	private int whole;
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		reduce();
	}
	public Fraction(int whole, int numerator, int denominator) {
		this.whole = whole;
		this.numerator = numerator;
		this.denominator = denominator;
		reduce();
	}
	public int getWhole() {
		return whole;
	}
	public void setWhole(int whole) {
		this.whole = whole;
	}
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	public String toString() {
		reduce();
		if (this.whole != 0) {
			return whole + " " + numerator + "/" + denominator;
		} else {
			return numerator + "/" + denominator;
		}
	}
	/**
	 * Add a whole number to a fraction
	 * @param whole whole number
	 */
	public void add(int whole) {
		this.whole += whole;
	}
	public void add(int numerator, int denominator) {
		int commonDenominator = denominator * this.denominator;
		this.numerator = this.numerator * denominator + numerator * this.denominator;
		this.denominator = commonDenominator;
		this.reduce();
	}
	public void add(Fraction x) {
		this.add(x.getWhole());
		this.add(x.getNumerator(), x.getNumerator());
	}
	private void reduce() {
		int lcd = 1;
		for (int i = 2; i < Math.min(this.numerator, this.denominator) + 1; i++)
			if (this.numerator % i == 0 && this.denominator % i == 0)
				lcd = i;
		this.numerator /= lcd;
		this.denominator /= lcd;
	}
	public Double toDouble() {
		return this.whole + (double) this.numerator / this.denominator;
	}


}
