package homework1;

import java.util.LinkedList;

public class Tree {

	Item root = null;

	/**
	 * Add a new item to the tree root
	 * @param data
	 * @param root
	 * @return
	 */
	public Item add(int data, Item root) {
		if (root == null)
			return new Item(data);
		if (root.data > data) {
			root.left = add(data, root.left);
		} 
		if (root.data < data) {
			root.right = add(data, root.right);
		}
		return root;
	}

	/**
	 * Add a new item to the tree
	 * @param data
	 */
	public void add(int data) {
		this.root = this.add(data, this.root);
	}

	/**
	 * Print the tree from a specified root
	 * @param root
	 */
	public void print(Item root) {
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
	 * Find and return the item, its parent and direction with the specified data
	 * @param data
	 * @return
	 */
	private Object[] find(int data) {
		Item parent = null;
		Integer direction = null; //0 for left, 1 for right
		Item item = root;
		while (item.data != data) {
			if (item.data < data) {
				if (item.right != null) {
					parent = item;
					item = item.right;
					direction = 1;
				}
				else return null;
			}
			if (item.data > data) {
				if (item.left != null) {
					parent = item;
					item = item.left;
					direction = 0;
				}
				else return null;
			}
		}
		Object[] output = {parent, direction, item};
		return output;
	}
	
	private void delete(Object[] location) {
		if ((int) location[1] == 0) (((Item) location[0]).left) = null;
		if ((int) location[1] == 1) (((Item) location[0]).right) = null;
	}
	
	/**
	 * Remove a specified item from the tree
	 * @param item
	 */
	public void remove(int data) {
		Object[] location = this.find(data);
		LinkedList<Integer> children = this.gatherChildren((Item) location[2]);
		if (location[0] == null) { //if the given value has no parents, i.e. is the root
			if (children.size() == 0) {//if the root has no children
				this.root = null;
				return;
			}
			this.root = new Item(children.getFirst());
		} else {
			delete(location);
		}
		for (Integer child: children) {
			this.add(child);
		}		
	}
	
//	/**
//	 * Return the total number of items in the tree
//	 * @return
//	 */
//	public int total() {
//		int[] total = {0}; //Substitute a global variable
//		total(root, total);
//		return total[0];
//	}
//	
//	/**
//	 * Recursive function to be called by total() only
//	 * @param root
//	 * @param total
//	 */
//	private void total(Item root, int[] total) {
//		if (root != null) {
//			total(root.right, total);
//			total(root.left, total);
//			total[0] ++;
//		}
//	}
	
	/**
	 * Return the total number of items in the tree
	 * @return
	 */
	public int total() {
		LinkedList<Integer> children = this.gatherChildren(root);
		return children.size() + 1; //+1 because the root is not included in the children array
	}
	
	/**
	 * produce a linked list with values of all the children of a given root
	 * @param root
	 * @return
	 */
	public LinkedList<Integer> gatherChildren(Item root) {
		LinkedList<Integer> children = new LinkedList<>();
		gatherChildren(root, children);
		children.remove((Integer) root.data);
		return children;
	}
	
	/**
	 * Recursive function to be called by gatherChildren() only
	 * @param root
	 * @param children
	 */
	private void gatherChildren(Item root, LinkedList<Integer> children) {
		if (root != null) {
			children.add(root.data);
			gatherChildren(root.right, children);
			gatherChildren(root.left, children);
		}
	}
	
	public class Item {

		public int data;
		public Item left = null;
		public Item right = null;

		/**
		 * construct a new item
		 * @param data
		 */
		public Item(int data) {
			this.data = data;
		}

		/**
		 * @return the data
		 */
		public int getData() {
			return data;
		}
		
		/**
		 * @param data the data to set
		 */
		public void setData(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return this.data + "";
		}
		
	}
	
}
