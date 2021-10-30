import java.util.ArrayList;
import static java.lang.System.*;

/*
	LAB 4 (CREATING A STACK)
*/

public class IntStackRunner
{
	public static void main ( String[] args )	//creates a test case (works)
	{
		IntStack test = new IntStack();
		test.push(5);
		test.push(7);
		test.push(9);
		System.out.println(test);
		System.out.println(test.isEmpty());
		System.out.println(test.pop());
		System.out.println(test.peek());
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.isEmpty());
		System.out.println(test);

		//expand the test cases to test the class more thoroughly

	}
}