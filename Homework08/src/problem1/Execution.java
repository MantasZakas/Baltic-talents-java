package problem1;

public class Execution {

	public static void main(String[] args) {
		Point p = new Point(3.0, 4.0);
		System.out.println(p);
		System.out.println(p.distanceFromOrigin());
		p.translate(2.5, 3.5);
		System.out.println(p);
		Point k = new Point(6.5, 8.5);
		System.out.println(p.distanceFromPoint(k));
		k.setlocation(1.0, 1.0);
		System.out.println(k);
		p.setlocation(-1.0, -1.0);
		Line l = new Line(p, k);
		System.out.println(l);
		System.out.println(l.length());

	}

}
