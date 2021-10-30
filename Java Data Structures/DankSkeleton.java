import java.lang.*;

/*	
	LAB 1 FOR INTERFACES
*/

public class DankSkeleton implements Monster {
	private int size;
	private String name;

	//constructor method
	public DankSkeleton(int s, String n) {
		size = s;
		name = n;
	}

	//getter methods
	public int getHowBig() {
		return size;
	}

	public String getName() {
		return name;
	}

	//comparing two monsters
	//since the interface has 'Monster' in the parameter, then the object must be of type 'Monster'
	public boolean isBigger(Monster other) {
		if (size > other.getHowBig())
			return true;
		return false;
	}

	public boolean isSmaller(Monster other) {
		if (size < other.getHowBig()) 
			return true;
		return false;
	}

	public boolean namesTheSame(Monster other) {
		if (name.equals(other.getName()))
			return true;
		return false;
	}

	//tostring method of dankskeleton
	public String toString() {
		return "" + name + " " + size;
	}


}
