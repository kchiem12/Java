import java.util.*; 

/*   O(n^2)   */

class SelectionSort { //requires two loops
	void selectionSort (int[] stuff) {
		for (int i = 0; i < stuff.length; i++) {
			int min = i; //sets initial minimum

			for (int j = i + 1; j < stuff.length; j++) { //checks for new min
				if (stuff[j] < stuff[min])
					min = j;

			}

			if (min != i) { //swaps after the other for loop finishes iterating through
				int temp = stuff[min];
				stuff[min] = stuff[i];
				stuff[i] = temp;
			}
		}
	}

	void randomGenerated (int[] stuff) {  //creates random array
		for (int i = 0; i < stuff.length; i++) {
			int val = (int)(Math.random()*100 + 1);
			stuff[i] = val;
		}
	}

	public static void main(String args[]) {
		SelectionSort ob = new SelectionSort();

		int[] stuff = new int[100];
		ob.randomGenerated(stuff);
		ob.selectionSort(stuff);
		for (int i = 0; i < stuff.length; i++) {
			System.out.println(stuff[i]);
		}
	}
}