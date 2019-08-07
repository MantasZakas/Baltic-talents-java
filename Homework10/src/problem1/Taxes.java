package problem1;

public class Taxes {

	final double[] taxRates = {
			0.15, //income tax
			0.06, //health insurance
			0.03, //social security
			0.3048, //social security for employer
			0.002, //guarantee fund for employer
			0.005 //long term fund for employer
	};

	/**
	 * Generate tax rate as a percentage string
	 * @param i tax rates array position
	 * @return tax in percentage form
	 */
	public String taxToPercentString (int i) {
		return (taxRates[i] * 100 + "%");
	}
	
	/**
	 * Round up a money amount
	 * @param number to be rounded to 2 digits after the comma
	 * @return number rounded to 2 digits after the comma
	 */
	public double roundUp(double number) {
		return ((double) Math.round(number * 100)) / 100;
	}
	 
	/**
	 * Generate an array with tax amounts
	 * @param spt salary prior taxes
	 * @param tei tax exempt income
	 * @return tax array
	 */
	public double[] calculateTaxes(double spt, double tei) {
		double[] taxes = {
				roundUp((spt - tei) * taxRates[0]),
				roundUp(spt * taxRates[1]),
				roundUp(spt * taxRates[2]),
				roundUp(spt * taxRates[3]),
				roundUp(spt * taxRates[4]),
				roundUp(spt * taxRates[5]),
		};
		return taxes;
	}
	
}
