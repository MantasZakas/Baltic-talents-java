package homework1;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Problem {

	private JLabel problemLabel;
	private JTextField answer;
	private Integer x;
	private Integer y;
	private Integer z;

	/**
	 * @param problem
	 * @param answer
	 */
	public Problem(JLabel problem, JTextField answer) {
		this.problemLabel = problem;
		this.answer = answer;
		generateProblem();
	}

	/**
	 * Generate a new problem
	 */
	public void generateProblem() {
		x = (int) (Math.random() * 9) + 1; //numbers 1 to 9
		y = (int) (Math.random() * 9) + 1;
		String sign = "";
		switch ((int) (Math.random() * 4)) {
		case 0:
			z = x + y;
			sign = "+";
			break;
		case 1:
			if (y > x) {//avoid negative answers
				z = x;
				x = y;
				y = z;
			}
			z = x - y;
			sign = "-";
			break;
		case 2:
			z = x * y;
			sign = "*";
			break;
		case 3:
			z = x;
			x = z * y;
			sign = "/";
			break;
		default:
			break;
		}
		problemLabel.setText(x + sign + y);
	}

	/**
	 * Return if the answer is correct
	 * @return
	 */
	public boolean checkAnswer() {
		try {
			return Integer.parseInt(answer.getText()) == z;
		} catch (Exception e) {// a non number input
			return false;
		}
	}

}
