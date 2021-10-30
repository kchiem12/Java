import java.util.*;

/*
	LAB 1 FOR LINKED LISTS
*/

public class JavaLinkedList {

	private LinkedList<Integer> list;

	public JavaLinkedList() {
		list = new LinkedList<Integer>();	//constructor
	}

	public JavaLinkedList(int[] nums) {
		list = new LinkedList<Integer>();	//constructor
		for (int num : nums) {
			list.add(num);
		}
	}

	public double getSum() {				//computes sum
		double total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		return total;
	}

	public double getAvg() {				//computes average
		return getSum() / list.size();
	}

	public int getLargest() {				//outputs largest value in list
		int largest = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > largest)
				largest = list.get(i);
		}
		return largest;
	}

	public int getSmallest() {				//outputs smallest value of list
		int smallest = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) < smallest)
				smallest = list.get(i);
		}
		return smallest;
	}

	public String toString() {
		return ""+list;
	}
}