import java.util.*;

/*
		LAB 4 (CREATING A STACK)
*/

public class IntStack {
	private ArrayList<Integer> listOfInts;

	public IntStack() {
		listOfInts = new ArrayList<Integer>();
	}

	public void push(int item) {		//pseudo-push method for stack
		listOfInts.add(item);
	}

	public int pop() {
		return listOfInts.remove(listOfInts.size() - 1);
	}

	public boolean isEmpty() {
		if (listOfInts.isEmpty())
			return true;
		else 
			return false;
	}

	public int peek() {
		return listOfInts.get(listOfInts.size() - 1);
	}

	public String toString() {			//converts arraylist to an array before calling tostring
		return Arrays.toString(listOfInts.toArray()) + "";
	}
}