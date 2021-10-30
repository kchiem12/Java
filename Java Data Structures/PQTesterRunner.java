import java.util.*;

/*
	LAB 2 FOR QUEUES
*/

public class PQTesterRunner {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);	//to receive test cases

		String lst = in.nextLine();
		PQTester pQueue = new PQTester(lst);

		System.out.println("toString() - " + pQueue);
		System.out.println("getMin() - " + pQueue.getMin());
		System.out.println("getNaturalOrder() - " + pQueue.getNaturalOrder());
	}
}