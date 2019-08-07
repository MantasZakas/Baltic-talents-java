package lectureProblem1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButtonPressed implements ActionListener{
	
	JTextField weight = null;
	JTextField height = null;
	

	/**
	 * @param number
	 */
	public ButtonPressed(JTextField weight, JTextField height) {
		super();
		this.weight = weight;
		this.height = height;
	}



	public void actionPerformed(ActionEvent e) {
		System.out.println("Someone pressed the button");
		double w = Double.parseDouble(weight.getText());
		double h = Double.parseDouble(height.getText());
		h /= 100;
		Swing1.answer.setText("Your BMI: " + w / (h * h));
		
	}

}
