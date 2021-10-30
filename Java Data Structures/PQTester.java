import java.util.*;

/*
	LAB 2 FOR QUEUES
*/

public class PQTester {
	private PriorityQueue<String> pQueue;

	public PQTester() {
		pQueue = new PriorityQueue<String>();	//constructor
	}

	public PQTester(String list) {
		pQueue = new PriorityQueue<String>();	//constructor
		setPQ(list);

	}

	public void setPQ(String list) {			//populates priority queue
		String[] temp = list.split("\\s");
		for (int i = 0; i < temp.length; i++) {
			pQueue.add(temp[i]);
		}
	}

	public String getMin() {					//dequeues
		return pQueue.peek();
	}

	public String getNaturalOrder() {			//enqueues through all queues
		String natOrder = "";
		while(!pQueue.isEmpty()) {
			natOrder += pQueue.remove() + " ";
		}
		return natOrder;
	}

	public String toString() {					//toString stuff!
		String toStr = "";
		for (String s : pQueue) 
			toStr += s + " ";
		return toStr;
	}
}