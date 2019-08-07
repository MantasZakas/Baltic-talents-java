package homework1;

public class Execution {

	public static void main(String[] args) {

			Tree tree = new Tree();
			tree.add(5);
			tree.add(8);
			tree.add(9);
			tree.add(4);
			tree.add(0);
			tree.add(5);
			tree.add(7);
			tree.print();
			System.out.println();
			System.out.println(tree.total());;
			tree.remove(5);
			tree.print();
			
			
	}

}
