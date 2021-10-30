@SuppressWarnings("unchecked")
public class ThingCount1 implements Comparable {

	private int count;
	private Object thing;

	public ThingCount1() {
		count = 0;
		thing = null;
	}

	public ThingCount1(Object thang, int cnt) {
		thing = thang;
		count = cnt;
	}

	public void setThing(Object thng) {
		thing = thng;
	}

	public void setCount(int cnt) {
		count = cnt;
	}

	public Object getThing() {
		return thing;
	}

	public int getCount() {
		return count;
	}

	public boolean equals(Object ob) {
		ThingCount1 temp = (ThingCount1)ob;
		if (((Comparable)getThing()).equals(temp.getThing()))
			return true;
		return false;
	}

	public int compareTo(Object ob) {
		ThingCount1 temp = (ThingCount1)ob;
		if (ob != null) {
			return ((Comparable)getThing()).compareTo(temp.getThing());
		}
		return -1;
	}

	public String toString() {
		return "" + String.valueOf(thing) + " - " + count;
	}



}