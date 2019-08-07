package problem2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class DrawGraphics extends JPanel{

	/**
	 * Translate the x value to match the origin point
	 * @param x
	 * @return
	 */
	public int translateX(double x) {
		return (int) Math.round(x + 399);
	}
	
	/**
	 * Translate the y value to match the origin point
	 * @param x
	 * @return
	 */
	public int translateY(double y) {
		return (int) Math.round(149 - y);
	}
	
	/**
	 * calculate value for y
	 * @param x
	 * @return
	 */
	public double getValueForY(double x) {
		return x;
	}
	
	/**
	 * Draw the graph and axes
	 */
	public void paintComponent(Graphics g) {
		//draw grid lines
		g.setColor(Color.lightGray);
		for (int x = 0; x < 800; x += 25) 
			g.drawLine(x, 0, x, 300);
		for (int y = 0; y < 300; y += 25)
			g.drawLine(0, y, 800, y);
		//draw axes
		g.setColor(Color.blue);
		g.drawLine(0, 150, 800, 150);
		g.drawLine(400, 0, 400, 300);
		//draw graph
		g.setColor(Color.red);
		double xPrevious = -400.0;
		double yPrevious = this.getValueForY(xPrevious / 25) * 25;
		for (double x = -400.0; x < 400; x++) {
			double y = this.getValueForY(x / 25) * 25; //25 is because a coordinate unit is 25 pixels
			//this if is not to draw discontinuous jumps in the function
			if (!(x - xPrevious > 300 || xPrevious - x > 300 || y - yPrevious > 300 || yPrevious - y > 300))
				g.drawLine(translateX(x), translateY(y), translateX(xPrevious), translateY(yPrevious));
			xPrevious = x;
			yPrevious = y;
		}
	}
	
}
