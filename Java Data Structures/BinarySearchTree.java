import java.util.*;
import static java.lang.System.*;

/*
	LAB 1 FOR BINARY TREES
*/

public class BinarySearchTree { //do extend <? super> thing up here on class line
	private TreeNode root;

	public BinarySearchTree() {
		root = null;
	}


	//method adds a node to binary tree
	//works!!!
	public void add(Comparable value) {
		root = add(value, root);
	}

	@SuppressWarnings("unchecked")
	private TreeNode add(Comparable val, TreeNode tree) {
		if (tree == null)
			tree = new TreeNode(val);

		Comparable treeValue = tree.getValue();
		int drTest = val.compareTo(treeValue);

		if (drTest < 0) {
			tree.setLeft(add(val, tree.getLeft()));
		}
		else if (drTest > 0) {
			tree.setRight(add(val, tree.getRight()));
		}

		return tree;
	}

	//works!!
	public void inOrder() {
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree) {
		if (tree != null) {
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());	
		}
	}

	//below methods are all the 'order' methods

	//works!!
	public void preOrder() {
		preOrder(root);
		System.out.println("\n\n");
	}

	private void preOrder(TreeNode tree) {
		if (tree != null) {
		System.out.print(tree.getValue() + " ");
		preOrder(tree.getLeft());
		preOrder(tree.getRight());
	}
	}


	//works!!
	public void postOrder() {
		postOrder(root);
		System.out.println("\n\n");
	}

	private void postOrder(TreeNode tree) {
		if (tree != null) {
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
		}
	}


	//works!!!!!
	public void revOrder() {
		revOrder(root);
		System.out.println("\n\n");
	}

	private void revOrder(TreeNode tree) {
		if (tree != null) {
			revOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
			revOrder(tree.getLeft());
		}
	}

//above methods are all the 'orders'



	//works!!!
	public int getNumLevels() {
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree) {
		if (tree == null) {
			return 0;
		} 
		//the conditional is used if one side of the tree has more levels than the other
		//ensures that the right number of trees are being counted
		else if (getNumLevels(tree.getLeft()) > getNumLevels(tree.getRight())) {
			return 1+getNumLevels(tree.getLeft());
		}
		else {
			return 1+getNumLevels(tree.getRight());
		}

	}



	//works!!!!
	public int getNumLeaves() {
		return getNumLeaves(root);
	}

	private int getNumLeaves(TreeNode tree) { //a leaf is a node where it has no left or right child
		if (tree == null) {
			return 0;
		}
		int cnt = getNumLeaves(tree.getLeft());
		if (tree.getLeft() == null && tree.getRight() == null) {
			cnt++;
		}

		cnt = cnt + getNumLeaves(tree.getRight());
		return cnt;
	}



	//works!!!!
	public int getWidth() { //better word would be 'getDiameter'
		return getWidth(root);
	}

	private int getWidth(TreeNode tree) {
		int countLeft = getNumLevels(tree.getLeft());
		int countRight = getNumLevels(tree.getRight());
		return countLeft + countRight + 1;
	}


	//works!!
	public int getHeight() { //path from root to farthest leaf
		return getHeight(root);
	}

	private int getHeight(TreeNode tree) {
		return (int)Math.max((double)getNumLevels(tree.getLeft()), (double)getNumLevels(tree.getRight()));
	}



	//works!!!
	public int getNumNodes() {
		return getNumNodes(root);
	}

	private int getNumNodes(TreeNode tree) {
		if (tree == null) {
			return 0;
		}
		int count = 1 + getNumNodes(tree.getLeft());
		count = count + getNumNodes(tree.getRight());
		return count;
	}



	//toString method (works!!!!)
	public String toString() {
		return toString(root);
	}

	private String toString(TreeNode tree) {
		if (tree == null) {
			return "";
		}
		String bruh = String.valueOf(toString(tree.getLeft())) + String.valueOf(tree.getValue()) + " ";
		bruh += String.valueOf(toString(tree.getRight()));
		return bruh;
	}




	//isFull method
	//works!!!!
	public boolean isFull() {
		return isFull(root);
	}

	private boolean isFull(TreeNode tree) { //instead of using recursion, maybe use a loop

		boolean ans = true;

		//the nested if statement calls recursively
		if ((tree.getLeft() != null && tree.getRight() != null)) {
			if (isFull(tree.getLeft()) == false || isFull(tree.getRight()) == false)
				ans = false;
		}

		//base case (checks the leaves that either have no child or ones that have only one)
		//dictates whether or not ans will be true or false
		if (tree.getLeft() == null && tree.getRight() == null)
			return true;
		else if (tree.getLeft() == null || tree.getRight() == null)
			return false;

		return ans;

	}


	public int getSmallest() {
		return getSmallest(root);
	}

	private int getSmallest(TreeNode t) {
		if (t.getLeft() == null)
			return (int)t.getValue();
		return getSmallest(t.getLeft());
	}

	public int getLargest() {
		return getLargest(root);
	}

	private int getLargest(TreeNode t) {
		if (t.getRight() == null)
			return (int)t.getValue();
		return getLargest(t.getRight());
	}


}