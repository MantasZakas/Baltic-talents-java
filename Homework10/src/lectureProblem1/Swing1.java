package lectureProblem1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing1 {
	
	public static JLabel answer;

	public static void main(String[] args) {
		JFrame f = new JFrame("Graph");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jpOut = new JPanel();
		f.add(jpOut);
		
		JPanel jp = new JPanel(new GridLayout(3, 2));
		jpOut.add(jp);
		//-----------
		jp.add(new JLabel("Weight: "));
		JTextField weight = new JTextField(15);
		jp.add(weight);
		
		jp.add(new JLabel("Height: "));
		JTextField height = new JTextField(15);
		jp.add(height);
		
		answer = new JLabel("The answer will be here");
		jp.add(answer);
		
		JButton button1 = new JButton("Do not press");
		button1.addActionListener(new ButtonPressed(weight, height));
		jp.add(button1);
		//-----------
		f.setSize(800, 600);
		f.setVisible(true);

	}

}
