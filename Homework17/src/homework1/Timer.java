package homework1;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Timer extends Thread{
	
	private JLabel time;
	private JButton button;
	Integer timeLimit;

	/**
	 * @param timer
	 */
	public Timer(JLabel time, JButton button, Integer timeLimit) {
		this.time = time;
		this.button = button;
		this.timeLimit = timeLimit;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				if (timeLimit == 1) {
					button.doClick();//check the current input
					if (button.isEnabled()) button.doClick();//click again to fail if the input was correct		
					break;
				}
				timeLimit--;
				this.time.setText("" + timeLimit);
			} catch (InterruptedException e) {
				//Do nothing
			}
		}
	}
	
}
