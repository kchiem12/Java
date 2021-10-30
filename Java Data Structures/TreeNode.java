import java.util.*;

public class TreeNode {
	private Comparable treeNodeValue;
	private TreeNode treeNodeLeft;
	private TreeNode treeNodeRight;

	public TreeNode() {
		treeNodeValue = null;
		treeNodeLeft = null;
		treeNodeRight = null;
	}

	public TreeNode (Comparable value) {
		treeNodeValue = value;
		treeNodeLeft = null;
		treeNodeRight = null;
	}

	public TreeNode (Comparable value, TreeNode lft, TreeNode rt) {
		treeNodeValue = value;
		treeNodeLeft = lft;
		treeNodeRight = rt;
	}

	public Comparable getValue() {
		return treeNodeValue;
	}

	public TreeNode getLeft() {
		return treeNodeLeft;
	}

	public TreeNode getRight() {
		return treeNodeRight;
	}

	public void setValue(Comparable value) {
		treeNodeValue = value;
	} 

	public void setLeft (TreeNode lt) {
		treeNodeLeft = lt;
	}

	public void setRight (TreeNode rt) {
		treeNodeRight = rt;
	}
}