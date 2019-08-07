package problem1;

public class Line {
	
	/**
	 * Point p1
	 */
	private Point p1;
	
	/**
	 * Point p2
	 */
	private Point p2;
	
	/**
	 * Construct the line using 2 points
	 * @param p1
	 * @param p2
	 */
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	/**
	 * Get the p1 value
	 * @return p1
	 */
	public Point getP1() {
		return p1;
	}
	
	/**
	 * Set the p1 point
	 * @param p1
	 */
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	
	/**
	 * Get the p2 value
	 * @return p2
	 */
	public Point getP2() {
		return p2;
	}
	
	/**
	 * Set the p1 point
	 * @param p2
	 */
	public void setP2(Point p2) {
		this.p2 = p2;
	}

	/**
	 * Return the line coordinates as a string
	 */
	public String toString() {
		return "{ " + p1 + "; " + p2 + " }";
	}
	
	/**
	 * Return the length of the line
	 * @return
	 */
	public double length() {
		return this.p1.distanceFromPoint(this.p2);
	}
	
	
}
