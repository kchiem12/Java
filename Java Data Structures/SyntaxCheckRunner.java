import java.util.*;
import static java.lang.System.*;

/*
	LAB 2 FOR STACKS
*/

public class SyntaxCheckRunner {
	public static void main(String args[]) {

		//implements syntaxchecker.java
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		while (!input.equals("exit")) {

		SyntaxChecker sol = new SyntaxChecker(input);

		if (sol.checkExpression() == true)
			System.out.println(sol + " is correct.\n\n");
		else
			System.out.println(sol + " is incorrect.\n\n");

		input = in.nextLine();
	}
}
}