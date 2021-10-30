import java.util.*;

class LinearSearch {
	int linearSearch (int[] stuff, int value) {   //pretty straight forward; does not require sorted list
		for (int i = 0; i < stuff.length; i++) {
			if (stuff[i] == value)
				return i;

		}

		return -1;
	}

	void randomGenerated (int[] stuff) {  //creates random array
		for (int i = 0; i < stuff.length; i++) {
			int val = (int)(Math.random()*100 + 1);
			stuff[i] = val;
		}
	}

	public static void main(String args[]) {
		LinearSearch ob = new LinearSearch();
		int[] stuff = new int[100];
		ob.randomGenerated(stuff);
		int val = (int)(Math.random()*100 + 1);

		int index = ob.linearSearch(stuff, val);
		System.out.println(index);
	}
}