import java.util.*;

/*
	LAB 3 FOR QUEUES
*/

public class IntQueue {
	private ArrayList<Integer> listOfInts;	//instance arraylist variable

	public IntQueue() {
		listOfInts = new ArrayList<Integer>(); //constructor
	}

	public void add(int item) {				   //adds item to list
		listOfInts.add(item);
	}

	public int remove() {					   //removes from front of list
		return listOfInts.remove(0);
	}

	public boolean isEmpty() {				   //checks if empty
		return listOfInts.isEmpty();
	}

	public int peek() {						   //gets the front element
		return listOfInts.get(0);
	}

	public String toString() {
		return ""+listOfInts;
	}
}