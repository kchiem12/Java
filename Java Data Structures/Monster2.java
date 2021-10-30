import static java.lang.System.*;

public class Monster2 implements Comparable {

	private int myWeight;
	private int myHeight;
	private int myAge;

	public Monster2() {
		myWeight = 0;
		myHeight = 0;
		myAge = 0;
	}

	public Monster2(int ht) {
		myWeight = 0;
		myHeight = ht;
		myAge = 0;
	}

	public Monster2(int ht, int wt) {
		myWeight = wt;
		myHeight = ht;
	}

	public Monster2(int ht, int wt, int age) {
		myWeight = wt;
		myHeight = ht;
		myAge = age;
	}

	public void setHeight(int ht) {
		myHeight = ht;
	}

	public void setWeight(int wt) {
		myWeight = wt;
	}

	public void setAge(int age) {
		myAge = age;
	}

	public int getWeight() {
		return myWeight;
	}

	public int getHeight() {
		return myHeight;
	}

	public int getAge() {
		return myAge;
	}

	public Object clone() {
		return new Monster2(myHeight, myWeight, myAge);
	}

	public boolean equals(Object obj) {
		Monster2 temp = (Monster2)obj;
		if (myWeight != temp.getWeight() || myHeight != temp.getHeight() || myAge != temp.getAge()) 
			return false;
		return true;
	}

	public int compareTo(Object obj) {
		Monster2 temp = (Monster2) obj;
		if (myHeight > temp.getHeight())
			return 1;
		else if (myHeight < temp.getHeight())
			return -1;
		if (myWeight > temp.getWeight())
			return 1;
		else if (myWeight < temp.getWeight())
			return -1;
		if (myAge > temp.getAge())
			return 1;
		else if (myAge < temp.getAge())
			return -1;

		return 0;
	}

	public String toString() {
		return myHeight + " " + myWeight + " " + myAge;
	}




}