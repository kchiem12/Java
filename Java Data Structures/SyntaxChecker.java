import java.util.*;
import static java.lang.System.*;

/*
	LAB 2 FOR STACKS
*/

public class SyntaxChecker {
	private String exp;
	private Stack<Character> symbols;

	public SyntaxChecker(String s) {		//constructor
		exp = s;
		symbols = new Stack<Character>();
	}

	public boolean checkExpression() {		//checks the input
		char temp = 0;
		for (int i = 0; i < exp.length(); i++) {

			if (exp.charAt(i) == '(' || exp.charAt(i) == '{' ||		//if opening symbol, add to stack
				exp.charAt(i) == '[' || exp.charAt(i) == '<') {
				symbols.push(exp.charAt(i));
				continue;
			}


			//rest of if statements checks the closing symbols
			//then checks if it is on stack (top of stack must match closing symbol)
			//stack must also not be empty

			if (exp.charAt(i) == ')') {
				if (!symbols.isEmpty() && symbols.pop() == '(') 
					continue;
				else
					return false;
			}
			else if (exp.charAt(i) == '}') {
				if (!symbols.isEmpty() && symbols.pop() == '{') 
					continue;
				else
					return false;
			}
			else if (exp.charAt(i) == ']') {
				if (!symbols.isEmpty() && symbols.pop() == '[') 
					continue;
				else
					return false;
			}
			else if (exp.charAt(i) == '>') {
				if (!symbols.isEmpty() && symbols.pop() == '<') 
					continue;
				else
					return false;
			}
			
		}

		//stack must be empty at the end of the for loop
		//if not, then that means there are more opening symbols than closing symbols
		if (symbols.isEmpty())
			return true;
		else
			return false;
	}

	public String toString() {
		return exp;
	}
}