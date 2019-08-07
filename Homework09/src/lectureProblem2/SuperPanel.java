package lectureProblem2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SuperPanel extends JPanel{

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRect(10, 10, 100, 100);
		g.setColor(Color.blue);
		g.drawLine(0, 300, 800, 300);
		for (int x = 0; x < 800; x++) {
			int y = this.y(x);
			y += 300;
			g.drawOval(x, y, 1, 1);
		}
	}
	
	public Integer y(int x) {
		return (int) (Math.sin( (double) x / 20) * 200);
	}
	
}
