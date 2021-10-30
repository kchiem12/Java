import java.util.*;

class Stacks {
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<Integer>();

		s.push(88);
		s.push(23);
		s.push(11);

		System.out.println(s);
		s.pop();
		s.pop();

		System.out.println(s);
	}
}