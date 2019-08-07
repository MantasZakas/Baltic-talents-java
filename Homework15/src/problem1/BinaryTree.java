package problem1;

public class BinaryTree<T> {

	Item<T> root = null;

	/**
	 * Add a new item to the tree root
	 * @param data
	 * @param root
	 * @return
	 */
	public Item<T> add(T data, Item<T> root) {
		if (root == null)
			return new Item<T>(data);
//		   if (root.data > data) {
		if (root.compareTo(data) == 1) {
			root.left = add(data, root.left);
		} else {
			root.right = add(data, root.right);
		}
		return root;
	}

	/**
	 * Add a new item to the tree
	 * @param data
	 */
	public void add(T data) {
		this.root = this.add(data, this.root);
	}

	/**
	 * Print the tree from a specified root
	 * @param root
	 */
	public void print(Item<T> root) {
		if (root != null) {
			print(root.right);
			System.out.print(root.data + " ");
			print(root.left);
		}
	}

	/**
	 * Print the whole tree
	 */
	public void print() {
		this.print(root);
	}
	
	/**
	 * Remove a specified item from the tree
	 * @param item
	 */
	public void remove(T item) {
		
	}
	
	/**
	 * Return the total number of items in the tree
	 * @return
	 */
	public int total() {
		int[] total = {0}; //Substitute a global variable
		total(root, total);
		return total[0];
	}
	
	/**
	 * Recursive function to be called by total() only
	 * @param root
	 * @param total
	 */
	private void total(Item<T> root, int[] total) {
		if (root != null) {
			total(root.right, total);
			total(root.left, total);
			total[0] ++;
		}
	}
	
	public class Item<T> implements Comparable<T> {

		public T data;
		public Item<T> left = null;
		public Item<T> right = null;

		/**
		 * construct a new item
		 * 
		 * @param data
		 */
		public Item(T data) {
			this.data = data;
		}

		/**
		 * @return the data
		 */
		public T getData() {
			return data;
		}
		
		/**
		 * @param data the data to set
		 */
		public void setData(T data) {
			this.data = data;
		}

		@Override
		public int compareTo(T o) {
			try {
				if ((double) this.data > (double) o)
					return 1;
				if ((double) this.data < (double) o)
					return -1;
			} catch (Exception e) {
				try {
					if ((int) this.data > (int) o)
						return 1;
					if ((int) this.data < (int) o)
						return -1;
				} catch (Exception e2) {
					try {
						int stringAnswer = ((String) this.data).compareTo((String) o);
						if (stringAnswer > 0) stringAnswer = 1;
						if (stringAnswer < 0) stringAnswer = - 1;
						return stringAnswer;
					} catch (Exception e3) {
						System.out.println("Sorry");
					}
				}
			}
			return 0;
		}
		
	}

}
