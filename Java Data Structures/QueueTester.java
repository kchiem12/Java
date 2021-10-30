import java.util.*;

class QueueTester {
	public static void main(String args[]) {
		PriorityQueue<Integer> stuff = new PriorityQueue<Integer>();

		stuff.add(9);
		stuff.add(1);
		stuff.add(11);

		System.out.println(stuff.peek());
		stuff.remove();
		System.out.println(stuff.peek());
	}
}