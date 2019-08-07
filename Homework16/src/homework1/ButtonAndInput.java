package homework1;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ButtonAndInput {
	
	JPanel jp = new JPanel();
	JButton button;
	JTextField textField;
	/**
	 * @param button
	 * @param textField
	 */
	public ButtonAndInput(String buttonLabel) {
		super();
		this.button = new JButton(buttonLabel);
		this.button.setPreferredSize(new Dimension(150, 30));
		this.textField = new JTextField();
		this.textField.setPreferredSize(new Dimension(300, 30));
		jp.add(this.button);
		jp.add(this.textField);
	}

}
