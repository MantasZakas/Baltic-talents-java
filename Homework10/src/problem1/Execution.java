package problem1;

import java.awt.GridLayout;

import javax.swing.*;

public class Execution {
	
	public static JLabel tag;
	public static JLabel output;

	public static void main(String[] args) {
		JFrame f = new JFrame("Alga");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jpOut = new JPanel();
		f.add(jpOut);
		
		JPanel jp = new JPanel(new GridLayout(4, 2));
		jpOut.add(jp);
		
		JPanel jpResult = new JPanel(new GridLayout(1, 2));
		jpOut.add(jpResult);
		//-----------
		jp.add(new JLabel(""));
		jp.add(new JLabel(""));
		
		jp.add(new JLabel("Atlyginimas ant popieriaus: "));
		JTextField sallaryPreTax = new JTextField(25);
		jp.add(sallaryPreTax);
		
		jp.add(new JLabel("NPD: "));
		JTextField taxExemptIncome = new JTextField("380", 25);
		jp.add(taxExemptIncome);
		
		JButton button = new JButton("Skaiciouti");
		jp.add(button);
		button.addActionListener(new ButtonClick(sallaryPreTax, taxExemptIncome));
		jp.add(new JLabel(""));
		
		tag = new JLabel("");
		jpResult.add(tag);
		output = new JLabel("");
		jpResult.add(output);

		//-----------
		f.setSize(550, 400);
		f.setVisible(true);

	}

}
