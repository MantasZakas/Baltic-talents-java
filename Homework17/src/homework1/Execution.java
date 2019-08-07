package homework1;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Execution {
	
	static Integer totalScore = 0;
	final static Integer timeLimit = 15;

	public static void main(String[] args) {

		JFrame f = new JFrame("Game");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jpMain = new JPanel();
		jpMain.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		f.add(jpMain);
		
		JPanel jpProblem = new JPanel();
		jpMain.add(jpProblem, gbc);
		JLabel problemLabel = new JLabel("problem");
		jpProblem.add(problemLabel);
		JTextField answer = new JTextField(5);
		jpProblem.add(answer);
		
		JButton submit = new JButton("Check answer");
		jpMain.add(submit, gbc);
		f.getRootPane().setDefaultButton(submit);
		gbc.gridx++;
		
		JPanel jpTime = new JPanel();
		JLabel timeLabel = new JLabel("Time left: ");
		jpTime.add(timeLabel);
		JLabel time = new JLabel("" + timeLimit);
		time.setMinimumSize(new Dimension(20, 20));
		time.setPreferredSize(new Dimension(20, 20));
		time.setMaximumSize(new Dimension(20, 20));
		jpTime.add(time);
		jpMain.add(jpTime, gbc);
				
		JPanel jpScore = new JPanel();
		jpMain.add(jpScore, gbc);
		JLabel scoreLabel = new JLabel("Score: ");
		jpScore.add(scoreLabel);
		JLabel score = new JLabel("" + totalScore);
		score.setMinimumSize(new Dimension(20, 20));
		score.setPreferredSize(new Dimension(20, 20));
		score.setMaximumSize(new Dimension(20, 20));
		jpScore.add(score);
		
		Problem problem = new Problem(problemLabel, answer);
		Timer timer = new Timer(time, submit, timeLimit);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (problem.checkAnswer()) {
					timer.timeLimit = timeLimit;
					time.setText("" + timeLimit);
					answer.setText("");
					answer.requestFocus();
					totalScore ++;
					problem.generateProblem();
					score.setText("" + totalScore);					
				} else {
					timeLabel.setText("Game over");
					timer.timeLimit = 1;
					time.setText("");
					submit.setEnabled(false);
					answer.setEnabled(false);
				}
			}
		});
		timer.start();
		
		f.setSize(400, 150);
		f.setVisible(true);

	}

}
