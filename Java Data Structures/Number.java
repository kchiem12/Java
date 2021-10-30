public class Number {
	private int value;

	public Number(int val) {
		value = val;
	}

	public int getValue() {
		return value;
	}

	public boolean equals(Object ob) {
		if (ob.equals(value))
			return true;
		return false;
	}

	public int hashCode() {
		return value%10;
	}

	public String toString() {
		return "" + value;
	}
}