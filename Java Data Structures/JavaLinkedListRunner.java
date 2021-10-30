import java.util.*;

/*
	LAB 1 FOR LINKEDLISTS
*/

public class JavaLinkedListRunner {

	public static void main(String[] args) {	

		//three test cases
		JavaLinkedList test = new JavaLinkedList(new int[]{4,5,6,7,8,9,10,11,12,13});
		System.out.println("SUM:: " + test.getSum() + 
						   "\nAVERAGE:: " + test.getAvg() +
						   "\nSMALLEST:: " + test.getSmallest() +
						   "\nLARGEST :: " + test.getLargest());

		test = new JavaLinkedList(new int[]{24,75,86,37,82,94,111,82,43});
		System.out.println("SUM:: " + test.getSum() + 
						   "\nAVERAGE:: " + test.getAvg() +
						   "\nSMALLEST:: " + test.getSmallest() +
						   "\nLARGEST :: " + test.getLargest());

		test = new JavaLinkedList(new int[]{0,4,5,2,1,4,6});
		System.out.println("SUM:: " + test.getSum() + 
						   "\nAVERAGE:: " + test.getAvg() +
						   "\nSMALLEST:: " + test.getSmallest() +
						   "\nLARGEST :: " + test.getLargest());
	}
}