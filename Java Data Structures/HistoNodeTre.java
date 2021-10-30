
/*

	LAB 3 FOR BINARY TREES

*/


public class HistoNodeTre {
	private Comparable data;
	private int dataCount;
	private HistoNodeTre left;
	private HistoNodeTre right;

	public HistoNodeTre(Comparable d, int cnt, HistoNodeTre lft, HistoNodeTre rt) {
		data = d;
		dataCount = cnt;
		left = lft;
		right = rt;
	}

	public Comparable getData() {
		return data;
	}

	public int getDataCount() {
		return dataCount;
	}

	public HistoNodeTre getLeft() {
		return left;
	}

	public HistoNodeTre getRight() {
		return right;
	}

	public void setData(Comparable d) {
		data = d;
	}

	public void setDataCount(int cnt) {
		dataCount = cnt;
	}

	public void setLeft(HistoNodeTre lft) {
		left = lft;
	}
 
	public void setRight(HistoNodeTre rt) {
		right = rt;
	}

}