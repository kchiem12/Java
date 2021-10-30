import java.util.*;

/*
	LAB 1 FOR HASH TABLES
*/

@SuppressWarnings("unchecked")
public class HashTable {
	private LinkedList[] table;


	//constructor (creates an array of linked lists)
	public HashTable() {
		table = new LinkedList[10];
		for (int i = 0; i < 10; i++) {
			table[i] = new LinkedList();
		}
	}


	//adds the value to the appropriate bucket
	public void add(Object ob) {
		Number temp = new Number((int)ob);
		int i = temp.hashCode();

		//if statement is used to prevent duplicates
		if (table[i].contains(ob) == false) {
		table[i].add(ob);
		}
	}


	//creates a string of all values in the hash table
	public String toString() {
		String out = "HASHTABLE\n";
		int cnt = 0;
		for (LinkedList lst : table) {
			out += "bucket " + cnt + ": ";

			//this for-each loop is to extract each individual value in the bucket
			for (Object ob : lst) {
				out += ob + " ";
			}

			out += "\n";
			cnt++;
		}

		return out;
	}
}