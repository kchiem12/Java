import java.util.*;

/*
	LAB 1 (WORDS) FOR HASHTABLES
*/

@SuppressWarnings("unchecked") //because of 'generic' types
public class HashTable1 {

	private LinkedList[] table;


	//constructor (creates linked list array)
	public HashTable1() {
		table = new LinkedList[10];
		for (int i = 0; i < 10; i++) {
			table[i] = new LinkedList();
		}
	}


	//adds words based on hashcode
	public void add(Object obj) {
		Word stuff = new Word((String)obj);
		int i = stuff.hashCode();

		//prevents duplicates in same bucket
		if (table[i].contains(obj) == false)
			table[i].add(obj);
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