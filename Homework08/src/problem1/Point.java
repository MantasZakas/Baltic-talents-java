package problem1;

public class Point {
	
	/**
	 * Coordinate x
	 */
	private Double x;
	
	/**
	 * Coordinate y
	 */
	private Double y;
	
	/**
	 * Construct Point object
	 * @param x
	 * @param y
	 */
	public Point(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Get the x coordinate value
	 * @return x
	 */
	public Double getX() {
		return x;
	}
	
	/**
	 * Set the x coordinate
	 * @param x
	 */
	public void setX(Double x) {
		this.x = x;
	}
	
	/**
	 * Get the y coordinate value
	 * @return y
	 */
	public Double getY() {
		return y;
	}
	
	/**
	 * Set the y coordinate
	 * @param y
	 */
	public void setY(Double y) {
		this.y = y;
	}
	
	/**
	 * Return the point coordinates as a string
	 */
	public String toString() {
		return "[" + x + "; " + y + "]";
	}

	/**
	 * Return the distance from the origin to the point
	 * @return
	 */
	public double distanceFromOrigin() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}
	
	/**
	 * Translate point coordinates by provided amounts
	 * @param dx
	 * @param dy
	 */
	public void translate(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	
	/**
	 * Return the distance from a specified point to this point
	 * @param p Point
	 * @return
	 */
	public double distanceFromPoint(Point p) {
		return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
	}
	
	/**
	 * Set both coordinates
	 * @param x
	 * @param y
	 */
	public void setlocation(double x, double y) {
		this.x = x;
		this.y = y;
	}

}
