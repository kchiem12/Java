import java.util.*;

class BinarySearch { //array must be sorted first!!
	int binarySearch(int[] stuff, int l, int h, int value) {

		if (l <= h) {      //important conditional; if the parameters does not work then return -1
		int mid = l + (h - l) / 2;
		if (stuff[mid] == value) {  //first check if middle is the correct value
			return mid;
		}
		else {
			if (stuff[mid] > value) {
				return binarySearch(stuff, l, mid - 1, value); //go to smaller subset
			}
			return binarySearch(stuff, mid + 1, h, value); //go to larger subset
		}
	}
		return -1; //if cannot find the value
	}

	void randomGenerated (int[] stuff) {  //creates random array
		for (int i = 0; i < stuff.length; i++) {
			int val = (int)(Math.random()*100 + 1);
			stuff[i] = val;
		}
	}


	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int[] stuff = new int[100];
		ob.randomGenerated(stuff);
		Arrays.sort(stuff);
		int val = (int)(Math.random()*100 + 1);

		int index = ob.binarySearch(stuff, 0, stuff.length, val);
		System.out.println("The value is: " + val + ". Does the array have it?");
		if (index >= 0)
			System.out.println(stuff[index]);
		else
			System.out.println("RIP");
	}
}