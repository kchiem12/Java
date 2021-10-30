import java.util.*;
import java.lang.*;

/*
	LAB 1 FOR BINARY TREES
*/

public class BSTreeRunner <T extends Comparable<? super T>> {

	public static void main(String args[]) {
		BinarySearchTree test1 = new BinarySearchTree();
		test1.add(90);
		test1.add(80);
		test1.add(100);
		test1.add(70);
		test1.add(85);
		test1.add(98);
		test1.add(120);

		System.out.println(test1 + "\n");
		test1.inOrder();
		test1.preOrder();
		test1.postOrder();
		test1.revOrder();
		System.out.println(String.format("The number of levels is %o\n\n", test1.getNumLevels()));

		System.out.println(String.format("The number of leaves is %o\n\n", test1.getNumLeaves()));

		System.out.println(String.format("The width is %o\n\n", test1.getWidth()));

		System.out.println(String.format("The height is %o\n\n", test1.getHeight()));

		System.out.println(String.format("The number of nodes is %o\n\n", test1.getNumNodes()));

		System.out.println(String.format("Is the tree full: %b\n\n", test1.isFull()));

		System.out.println("The smallest value is: " + test1.getSmallest() + "\n\n");

		System.out.println("The largest value is: " + test1.getLargest() + "\n\n");



		}

}