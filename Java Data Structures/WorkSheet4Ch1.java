/*
	From Chapter 1 Worksheet 4

	Implementing binary search recurively
*/
class WorkSheet4Ch1 { 
	int binarySearch(int[] stuff, int item, int bot, int top) { //works best for sorted list
		if (bot <= top) {
			int mid = bot + (top - bot) / 2;
			if (stuff[mid] == item)
				return mid;							//checks if element is item
			else if (stuff[mid] > item) 
				return binarySearch(stuff, item, bot, mid - 1); //goes through top half
			else 
				return binarySearch(stuff, item, mid + 1, top); //goes through bottom half
		}
		return -1;
		}

	public static void main(String args[]) {
		WorkSheet4Ch1 ob = new WorkSheet4Ch1();

		int[] stuff = {1, 4, 8, 10, 12, 155, 765};
		int spot = ob.binarySearch(stuff, 155, 0, stuff.length - 1); //testing search
		System.out.println(spot);
	}
	}
