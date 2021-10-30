import java.util.*;

/*
	LAB 1 (WORDS) FOR HASHTABLES
*/

public class HashTableRunner1 {

	public static void main(String[] args) {
		HashTable1 bruh = new HashTable1();
		//adds all these words into linked list array
		//each sorted into different buckets according to hashcode
		bruh.add("one");
		bruh.add("two");
		bruh.add("dog");
		bruh.add("cat");
		bruh.add("chicken");
		bruh.add("pig");
		bruh.add("owl");
		bruh.add("jump");
		bruh.add("run");
		bruh.add("hop");
		bruh.add("shortcut");
		bruh.add("ferret");
		bruh.add("goat");
		bruh.add("hootowl");
		bruh.add("owl");
		bruh.add("go");
		bruh.add("alligator");
		bruh.add("onimonapia");
		bruh.add("food");
		bruh.add("a");

		System.out.println(bruh);

	}
}