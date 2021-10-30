import java.util.*;
import java.lang.*;

class InsertionSort {
	void insertionSort(int[] stuff) {
		for (int i = 1; i < stuff.length; i++) { //loops through all elements
			int val = stuff[i]; //takes a current value
			int j = i; 
			while (j > 0 && val < stuff[j-1]) { //loops backwards if the elements under is less
				stuff[j] = stuff[j-1]; //makes swap (like moving elements up)
				j--;
			}
			stuff[j] = val; //swaps at the very end
		}
	}

	void randomGenerated (int[] stuff) {  //creates random array
		for (int i = 0; i < stuff.length; i++) {
			int val = (int)(Math.random()*100 + 1);
			stuff[i] = val;
		}
	}

	public static void main(String args[]) {
		InsertionSort ob = new InsertionSort();

		int[] stuff = new int[100];
		ob.randomGenerated(stuff);
		ob.insertionSort(stuff);
		for (int i = 0; i < stuff.length; i++) {
			System.out.println(stuff[i]);
		}
	}
}