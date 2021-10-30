import java.util.*;

/*
	LAB 3 FOR STACKS
*/

public class PostFixRunner {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);		//takes in input
		PostFix pf = new PostFix(in.nextLine());	//constructs a new postfix obj

		pf.solve();									//solver method
		System.out.println(pf);						//utilizes the tostring of object
	}
}