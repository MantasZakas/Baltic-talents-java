package problem1;

public class Execution {

	public static void main(String[] args) {
		
		BinaryTree<Double> tree = new BinaryTree<>();
		tree.add(7.0);
		tree.add(8.0);
		tree.add(14.0);
		tree.add(3.0);
		tree.add(2.0);
		tree.add(9.0);
		tree.add(5.0);
		System.out.println(tree.total());
		tree.print();
		
		
		System.out.println();
		
		BinaryTree<Integer> tree2 = new BinaryTree<>();
		tree2.add(7);
		tree2.add(8);
		tree2.add(14);
		tree2.add(3);
		tree2.add(2);
		tree2.add(9);
		tree2.add(5);
		tree2.add(20);
		tree2.print();
		
		System.out.println();
		
		BinaryTree<String> tree3 = new BinaryTree<>();
		tree3.add("GG");
		tree3.add("CC");
		tree3.add("YY");
		tree3.add("AA");
		tree3.add("XX");
		tree3.add("ZZ");
		tree3.add("TT");
		tree3.add("RR");
		tree3.print();
		
	}

}
