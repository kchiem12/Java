import java.util.*;

/*
	LAB 3 FOR LIST NODES 

	for some of these methods, the instance variable need to be referenced
	by another variable
	ex. ListNode list = theList, since changing theList directly will change the entire thing
	but changing list will not create any lasting changes, and all the changes that were made
	to list will be saved in theList (since variable is a reference to object)
*/



public class ListFunHouseTwo {
	private ListNode theList;

	public ListFunHouseTwo() {
		theList = new ListNode();
	}

	//adds all elements to front of listnode
	public void add(Comparable data) {
		if(theList.getValue() == null)
			theList.setValue(data);
		else
			theList = new ListNode(data, theList);
	}

	//returns the number of nodes
	public int nodeCount() {
		int count = 0;
		ListNode temp = theList;
		while(temp != null) {
			count++;
			temp = temp.getNext();
		}
		return count;
	}

	//try my original approach to this method later
	//uses the above-mentioned add function to duplicate the front element
	public void doubleFirst() {
		add(theList.getValue());
	}


	//duplicates last element
	//this element uses a reference variable to change the instance theList
	public void doubleLast() { 
		ListNode temp = theList;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(new ListNode(temp.getValue(), null));
	}

	//uses a variable to reference theList
	//similar to method in the first ListFunHouse
	public void skipEveryOther() { 
		ListNode list = theList;
		int count = 0;
		while(list != null && list.getNext() != null) {
			if (count % 2 != 0) {
				list.setNext(list.getNext().getNext());
				list = list.getNext();
			}
			count++;
		}
	}

	//same thing, uses a variable to reference theList and make changes to it
	public void setXthNode(int x, Comparable value) {
		ListNode list = theList;
		for (int i = 0; i < x - 1; i++) {
			list = list.getNext();
		}
		list.setValue(value);
	}

	public void removeNode(Object obj) {
		if (theList.getValue().equals(obj)) {
			theList = theList.getNext();
		}
		else {
			ListNode temp = theList;
			while (temp != null && !(temp.getNext().getValue().equals(obj))) {
				temp = temp.getNext();
			}
			if (temp != null) {
				temp.setNext(temp.getNext().getNext());
			}
		}
	}

	//removes the node at a given position
	public void removeXthNode(int x) {
		if (x == 1)
			theList = theList.getNext();
		else {
		ListNode temp = theList;
		for (int i = 0; i < x - 1; i++) {
			temp = temp.getNext();
			theList = theList.getNext();
		}
		theList.setNext(temp.getNext());
	}
	}


	//tostring stuff
	//uses a variable to reference the instance theList
	public String toString() {
		String s = "";
		ListNode temp = theList;
		while(temp != null) {
			s += temp.getValue() + " ";
			temp = temp.getNext();
		}
		return s;
	}



}