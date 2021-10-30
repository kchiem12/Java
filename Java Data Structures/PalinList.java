import java.util.*;

/*
		LAB 1 FOR QUEUES
*/	

public class PalinList {
	private Queue<String> queue;
	private Stack<String> stack;
	private String[] arr;		//used for tostring method

	public PalinList() {
		queue = new LinkedList<String>();
		stack = new Stack<String>();
		setList("");
	}

	public PalinList(String list) {
		queue = new LinkedList<String>();
		stack = new Stack<String>();
		setList(list); 
	}

	public void setList(String list) {
		arr = list.split("\\s");			//places stuff in both data structures
		for (int i = 0; i < arr.length; i++) {
			queue.add(arr[i]);
			stack.add(arr[i]);
		}
	}

	public boolean isPalin() {
		while(!queue.isEmpty()) {
			if (!queue.remove().equals(stack.pop())) { //compares the two strings
				return false;
			}
		}
		return true;
	}

	public String toString() {
		if (isPalin())
			return Arrays.toString(arr) + " is a palinlist.";
		return Arrays.toString(arr) + " is not a palinlist.";
	}

}