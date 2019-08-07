package lectureProblem2;

public class TwoItems<T, K> {
	
	public T first;
	public K second;
	
	public String toString() {
		return first + " " + second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public K getSecond() {
		return second;
	}

	public void setSecond(K second) {
		this.second = second;
	}
	
	
}
