package lectureProblem1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LectureProblem1 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Name");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp = new JPanel();
		JTextField x = new JTextField(10);
		JTextField y = new JTextField(10);
		JButton calculate = new JButton("calculate");
		JLabel answer = new JLabel();
		
		jp.add(x);
		jp.add(y);
		jp.add(calculate);
		jp.add(answer);
		f.add(jp);
		
		f.setSize(300, 200);
		f.setVisible(true);
		
		calculate.addActionListener( (e) ->
			answer.setText("" +(Double.parseDouble(x.getText()) + Double.parseDouble(y.getText())))
		);
		
	}
	
}
