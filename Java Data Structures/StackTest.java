/*
	Lab 1 (INCLUDE SCANNER HERE INSTEAD)
*/

import java.util.*;

public class StackTest {
	public void sol(Stack<String> s) {

		System.out.println(s);

		System.out.println("Popping all elements from stack:");

		while (!s.isEmpty()) {			//loops through all elements(top to bottom)
			System.out.print(s.pop() + " ");
		}
		System.out.println();

	}
}