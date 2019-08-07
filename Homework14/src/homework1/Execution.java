package homework1;

public class Execution {

	public static void main(String[] args) {

			Stack<Integer> s = new Stack<>();
			s.push(5);
			s.push(15);
			s.push(35);
			s.push(65);
			s.push(95);
			System.out.println(s);
			System.out.println(s.pop().data);
			s.push(0);
			System.out.println(s);
			s.remove(1);
			System.out.println(s);
			s.add(2, 7);
			System.out.println(s);
	}

}
