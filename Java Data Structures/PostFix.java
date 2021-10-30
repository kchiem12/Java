import java.util.*;

/*
	LAB 3 FOR STACKs
*/


public class PostFix {
	private Stack<Double> stack;
	private String expression;

	public PostFix() { 				//constructor
		stack = new Stack<Double>();
		expression = "";
	}

	public PostFix(String exp) {	//better constructor
		stack = new Stack<Double>();
		expression = exp;
	}

	public void setExpression(String exp) {	//mutator method (sets the expression)
		expression = exp;
	}

	public double calc(double one, double two, char op) {	//does calculations
		switch (op) {		//swtich statement is like fancier if-else statement
			case '+' :
				return one + two;
			case '-' :
				return one - two;
			case '*':
				return one * two;
			default :
				return one / two;
		}
	}

	public void solve() {
		Scanner in = new Scanner(expression);	//creates new scanner to analyze expression

		while (in.hasNext()) {
			if (in.hasNextInt()) {				//if number, push it into stack
				stack.push((double)in.nextInt());
			}
			else {
				double temp2 = stack.pop();		//its bottom number 'op' top number
				double temp1 = stack.pop();		//avoids a division error (ex 9 3 /)
				stack.push(calc(temp1, temp2, in.next().charAt(0)));
			}
		}
	}

	public String toString() {					//to string!!
		return expression + " = " + stack.pop();
	}
}