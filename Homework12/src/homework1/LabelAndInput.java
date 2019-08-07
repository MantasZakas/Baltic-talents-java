package homework1;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LabelAndInput {

	JPanel jp = new JPanel();
	JLabel label;
	JTextField textField;
	/**
	 * @param button
	 * @param textField
	 */
	public LabelAndInput(String label) {
		super();
		this.label = new JLabel(label);
		this.label.setPreferredSize(new Dimension(70, 10));
		this.textField = new JTextField(25);
		jp.add(this.label);
		jp.add(this.textField);
	}
	
}
