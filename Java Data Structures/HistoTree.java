import java.util.*;

/*

	LAB 3 FOR BINARY TREES

*/

@SuppressWarnings("unchecked")
public class HistoTree {
	private HistoNodeTre root;

	public HistoTree() {
		root = null;
	}

	public void addData(Comparable d) {
		root = addData(d, root);

		/* alternate addData method with search()
		if (search(d) == null) {
			addData(d);
		}
		else {
			HistoNodeTre temp = search(d);
			temp.setDataCount(temp.getDataCount() + 1);
		}
		*/
	}

	private HistoNodeTre addData(Comparable d, HistoNodeTre tree) {
		if (tree == null) {
			return new HistoNodeTre(d, 1, null, null);
		}
		//if using the search() method, then the below else if block is not needed
		 else if (tree.getData() == d) {
			tree.setDataCount(tree.getDataCount()+1);
		} else {
			int test = tree.getData().compareTo(d);
			if (test > 0)
				tree.setLeft(addData(d, tree.getLeft()));
			else
				tree.setRight(addData(d, tree.getRight()));
		}
		return tree;

	}

	public HistoNodeTre search(Comparable d) {
		return search(d, root);
	}

	//maybe use the search method in the add method above
	private HistoNodeTre search(Comparable d, HistoNodeTre tree) {
		if (tree == null) {
			return new HistoNodeTre(d, 1, null, null);
		} else if (tree.getData() == d) {
			return tree;
		}
		if (tree.getData().compareTo(d) > 0) {
			return search(d, tree.getLeft());
		} else {
			return search(d, tree.getRight());
		}

	}

	public String toString() {
		return toString(root).trim();
	}


	//perform in-order travesal for toString
	private String toString(HistoNodeTre tree) {
		if (tree == null) {
			return "";
		}
		return toString(tree.getLeft()) + String.valueOf(tree.getData()) + " - " + String.valueOf(tree.getDataCount()) + "      " + toString(tree.getRight());
	}



}