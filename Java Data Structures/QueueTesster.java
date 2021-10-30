import java.util.*;

class QueueTesster {
	public static void main(String args[]) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		queue.add(11);
		queue.add(10);
		queue.add(7);

		System.out.println(queue);
	}
}