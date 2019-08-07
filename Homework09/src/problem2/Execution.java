package problem2;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Execution {

	public static JPanel chooseGraph() {
		JPanel graph = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose graph: ");
		System.out.println("0 - y=x");
		System.out.println("1 - y=1/x");
		System.out.println("2 - y=|x|");
		System.out.println("3 - y=x^2");
		System.out.println("4 - y=x^3");
		System.out.println("5 - y=sin(x)");
		System.out.println("6 - y=cos(x)*x");
		
		try {
			switch (sc.nextInt()) {
			case 0:
				graph = new DrawGraphics();
				break;
			case 1:
				graph = new OneOverX();
				break;
			case 2:
				graph = new AbsoluteX();
				break;
			case 3:
				graph = new SquaredX();
				break;
			case 4:
				graph = new CubedX();
				break;
			case 5:
				graph = new SinX();
				break;
			case 6:
				graph = new CosXTimesX();
				break;
			default:
				sc.close();
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Invalid selection");
			System.exit(0);
		}
		sc.close();
		return graph;
	}

	public static void main(String[] args) {
		JFrame f = new JFrame("Graph");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel graph = chooseGraph();
		f.add(graph);
		f.setSize((800 + 15), (300 + 40));
		f.setVisible(true);

	}

}
