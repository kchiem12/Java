import java.util.*;
import static java.lang.System.*;

/*
	LAB 5 FOR LINKED LISTS
*/

public class HistoList2 {
	private ListNode front;


	//constructor
	public HistoList2() { 
		front = null;
	}


	//method for adding characters to list
	//should've used the methods created below to create the addLetter() method
	public void add(Object obj) {

		int ind = indexOf(obj);
		if (ind == -1) {
			front = new ListNode(new ThingCount(obj, 1), front);
		}
		else {
			ListNode temp = nodeAt(ind);
			ThingCount temp1 = (ThingCount)temp.getValue();
			temp1.setCount(temp1.getCount() + 1);
		}
		
	}


	//used to get index of a character in list
	public int indexOf(Object obj) {
		ListNode temp = front;
		int index = 0;
		while(temp != null) {
			ThingCount temp1 = (ThingCount)temp.getValue();
			if (temp1.compareTo(new ThingCount(obj, 0)) == 0) {
				break;
			}
			temp = temp.getNext();
			index++;
		}

		//returns -1 if character is not found
		if (temp == null) {
			return -1;
		}
		return index;
	}

	//private method can only be used inside HistoList class only
	//all the more reason to use this function in the addLetter() method
	private ListNode nodeAt(int spot) {
		ListNode temp = front;
		while(spot != 0) {
			temp = temp.getNext();
			spot--;
		}
		return temp;	//returns the node at a given index
	}


	//toString method for linked list
	public String toString() {
		
		ListNode temp = front;
		String out = "";
		while(temp != null) {
			ThingCount temp1 = (ThingCount)temp.getValue();
			out += temp1.getThing() + " - " + temp1.getCount() + "\t";
			temp = temp.getNext();
		}
		return out;
		
	}

}
