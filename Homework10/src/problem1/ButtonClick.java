package problem1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButtonClick extends Taxes implements ActionListener{
	
	JTextField sallaryPreTax = null;
	JTextField taxExemptIncome = null;
	double[] taxes = null;
	
	/**
	 * Get values from input fields
	 * @param number
	 */
	public ButtonClick(JTextField sallaryPreTax, JTextField taxExemptIncome) {
		this.sallaryPreTax = sallaryPreTax;
		this.taxExemptIncome = taxExemptIncome;
	}
	
	/**
	 * Generate labels for all taxes
	 * @return tag string
	 */
	private String generateTagString() {
		String tagString = "<html><br>"
				+ "Priskaiciuotas atlyginimas ant popieriaus:&nbsp<br>"
				+ "Pritaikytas NPD:&nbsp<br>"
				+ "Pajamu mokestis " + taxToPercentString(0) + ":&nbsp<br>"
				+ "Sveikatos draudimas " + taxToPercentString(1) + ":&nbsp<br>"
				+ "Pensiju ir soc. draudimas" + taxToPercentString(2) + ":&nbsp<br>"
				+ "Ismokamas atlyginimas i rankas:&nbsp<br>"
				+ "Darbdavio sumokami mokesciai&nbsp<br>"
				+ "Sodra" + taxToPercentString(3) + ":&nbsp<br>"
				+ "Imokos i garantini fonda" + taxToPercentString(4) + ":&nbsp<br>"
				+ "Imoka i ilgalaikio darbo ismoku fonda" + taxToPercentString(5) + ":&nbsp<br>"
				+ "Visa darbo vietos kaina:&nbsp<br>"
				+ "</html>";
		return tagString;
	}
	
	/**
	 * Generate tax amounts
	 * @param spt salary prior tax
	 * @param tei tax exempt income
	 * @return
	 */
	private String generateOutputString(double spt, double tei) {
		String tagString = "<html><br>"
				+ roundUp(spt) + "<br>"
				+ roundUp(tei) + "<br>"
				+ taxes[0] + "<br>"
				+ taxes[1] + "<br>"
				+ taxes[2] + "<br>"
				+ roundUp(spt - taxes[0] - taxes[1] - taxes[2]) + "<br>"
				+ "<br>"
				+ taxes[3] + "<br>"
				+ taxes[4] + "<br>"
				+ taxes[5] + "<br>"
				+ roundUp(taxes[3] + taxes[4] + taxes[5] + spt) + "<br>"
				+ "</html>";
		return tagString;
	}
	
	private double calculateTei(double spt, double teiRate) {
		double tei = 0.0;
		if (spt <= 400) {
			tei = teiRate;
		}
		if (spt > 400 && spt < 1160) {
			tei = teiRate - 0.5 * (spt - 400);
		}
		return tei;
	}
	
	/**
	 * Display results
	 */
	public void actionPerformed(ActionEvent e) {
		double spt = Double.parseDouble(sallaryPreTax.getText());
		double teiRate = Double.parseDouble(taxExemptIncome.getText());
		double tei = calculateTei(spt, teiRate);
		taxes = calculateTaxes(spt, tei);
		Execution.tag.setText(generateTagString());
		Execution.output.setText(generateOutputString(spt, tei));
	}

}
