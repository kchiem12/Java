import java.util.*;

/*
		Worksheet called StackIsEmpty
*/

public class StackIsEmpty {
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<Integer>(); 

		s.push(88);
		s.push(23);
		s.push(77);
		s.push(22);
		s.push(11);

		while(s.isEmpty() == false) {
			System.out.println(s.pop());
		}
	}
}