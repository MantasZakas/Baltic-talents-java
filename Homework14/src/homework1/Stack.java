package homework1;

public class Stack<T> {

	Item<T> p = null;

	/**
	 * Add a new entry to the beginning of the stack
	 * @param data
	 */
	public void push(T data) {
		Item<T> newItem = new Item<T>(data);
		if (p == null)
			p = newItem;
		else {
			newItem.next = p;
			p = newItem;
		}
	}

	/**
	 * remove and return an entry from the beginning of the stack
	 * @return
	 */
	public Item<T> pop() {
		if (p == null)
			return null;
		Item<T> tmp = p;
		p = p.next;
		return tmp;
	}

	/**
	 * remove a specified entry from the stack by its index
	 * @param index
	 */
	public void remove(int index) {
		if (index == 0) {
			p = p.next;
			return;
		} else {
			Item<T> item = p;
			for (int i = 0; i < index - 1; i++) {
				if (item == null) return;
				item = item.next;
			}
			item.next = item.next.next;
		}
	}
	
	/**
	 * add a new entry to the stack at the specified index
	 * @param index
	 * @param data
	 */
	public void add(int index, T data) {
		Item<T> newItem = new Item<T>(data);
		Item<T> tmp = p;
		if (index == 0) {
			newItem.next = p;
			p = newItem;
			return;
		}
		for (int i = 0; i < index - 1; i++) {
			if (tmp.next == null) return;
			tmp = tmp.next;
		}
		newItem.next = tmp.next;
		tmp.next = newItem;
	}

	/**
	 * return the stack values as a string
	 */
	public String toString() {
		String output = "";
		Item<T> tmp = p;
		while (tmp != null) {
			output += tmp.data + " ";
			tmp = tmp.next;
		}
		return output;
	}

	public class Item<T> {

		public T data;
		public Item<T> next = null;

		/**
		 * construct a new item
		 * @param data
		 */
		public Item(T data) {
			this.data = data;
		}

	}

}
