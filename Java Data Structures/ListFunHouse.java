import java.util.*;

public class ListFunHouse {

	//prints out all the elements in list
	public static void print(ListNode list) {
		while (list != null) {
			System.out.print(list.getValue() + " ");
			list = list.getNext();
		}
		System.out.println();
	} 

	//returns the number of nodes in list
	public static int nodeCount(ListNode list) {
		int count = 0;
		while (list != null) {
			count++;
			list = list.getNext();
		}
		return count;
	}

	//duplicates the first node
	//need to use setNext() instead of just the = operator since java is 
	//not pass by reference??
	public static void doubleFirst(ListNode list) {
		list.setNext(new ListNode(list.getValue(), list.getNext()));
	}

	//duplicates the last node
	public static void doubleLast(ListNode list) {
		while (list.getNext() != null) {
			list = list.getNext();
		}
		list.setNext(new ListNode(list.getValue(), null));
	}

	//removes every other node
	public static void skipEveryOther(ListNode list) {
		int count = 0;
		//employs use of two listnodes
		ListNode curr = list;
		ListNode temp = list;
		while (curr != null) {
			if (count % 2 == 1) {	//if count is odd, then replace the next value of temp
				temp.setNext(curr.getNext());
				temp = temp.getNext();
			}
			curr = curr.getNext(); //always iterate through current
			count++;
			//if count is even, then count moves up and the current node of temp does not change
		}
		list = temp;
	}

	//sets the value of some node x
	public static void setXthNode(ListNode list, int x, Comparable value) {
		for (int i = 0; i < x; i++) {	//traverse to the specified node
			list = list.getNext();
		}
		list.setValue(value);
	}


	//removes node at specified position
	public static void removeXthNode(ListNode list, int x) {
		if (x == 0) {				//for when removing the first node
			list = list.getNext();
		}
		else {
			//use two nodes. one node is ahead of the other by one
			//when code gets to specified node number, temp's next gets overwritten the following node
			ListNode temp = list;
			ListNode curr = list;
			curr = curr.getNext();
			for (int i = 1; i < x; i++) {
				curr = curr.getNext();
				temp = temp.getNext();
			}
			temp.setNext(curr.getNext());
			list = temp;		//not sure if this works??
		}

	}

}