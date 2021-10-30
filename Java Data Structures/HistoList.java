import java.util.*;
import static java.lang.System.*;

/*
	LAB 4 FOR LINKED LISTS
*/

public class HistoList {
	private HistoNode front;


	//constructor
	public HistoList() { 
		front = null;
	}

	
	//method for adding characters to list
	//should've used the methods created below to create the addLetter() method
	public void addLetter(char let) {

		
		//this if is used for adding the first element to the list
		if (front == null) {
			front = new HistoNode(let, 1, front);
		}
		else {
		HistoNode temp = front;	//create a temporary reference to the instance variable
		boolean isThere = false; //used to check if the character is already in list
		while(temp != null) {
			if (temp.getLetter() == let) { //if character is already in lis
				isThere = true;
				break;
			}
			temp = temp.getNext(); //iterates through the linked list
		}

		//depending on whether or not character is in list, it will either increase
		//count or add a new node to front
		if (isThere) {
			temp.setLetterCount(temp.getLetterCount() + 1);
		}
		else {
			front = new HistoNode(let, 1, front);
		}
	}
		
		
	}


	//used to get index of a character in list
	public int indexOf(char let) {
		HistoNode temp = front;
		int index = 0;
		while(temp != null) {
			if (temp.getLetter() == let) {
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
	private HistoNode nodeAt(int spot) {
		HistoNode temp = front;
		while(spot != 0) {
			temp = temp.getNext();
			spot = spot - 1;
		}
		return temp;	//returns the node at a given index
	}


	//toString method for linked list
	public String toString() {
		
		HistoNode temp = front;
		String out = "";
		while(temp != null) {
			out += temp.getLetter() + " - " + temp.getLetterCount() + "\t";
			temp = temp.getNext();
		}
		return out;
		
	}
}
