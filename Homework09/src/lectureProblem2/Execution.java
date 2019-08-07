package lectureProblem2;

import javax.swing.*;

public class Execution {

	public static void main(String[] args) {
		JFrame f = new JFrame("Lango pavadinimas");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new SuperPanel();
		f.add(panel);
		
		f.setSize(800,600);
		f.setVisible(true);

	}

}
