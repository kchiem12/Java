/*
	Lab 1 tester
*/

import java.util.*;

public class StackTester {

	public static void main(String args[]) {
		StackTest bruh = new StackTest();		//creates object from other file
		Scanner in = new Scanner(System.in);	//creates scanner (for input)
		String input = in.nextLine();

		Scanner theIn = new Scanner(input);		//creates another scanner to read input

		Stack<String> stuff = new Stack<String>();

		while (theIn.hasNext()) {  					//puts all inputs into a stack
			stuff.push(theIn.next());
		}


		bruh.sol(stuff);     					//implements function from stacktest.java

		in.close();
		theIn.close();


	}

}