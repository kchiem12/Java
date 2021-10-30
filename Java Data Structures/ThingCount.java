import java.util.*;
import java.lang.*;

/*
	LAB 5 FOR LINKED LISTS
*/

public class ThingCount implements Comparable{

	private int count;
	private Object thing;

	public ThingCount() { //constructor
		count = 0;
		thing = null;
	}

	public ThingCount(Object thang, int cnt) { //constructor with parameters
		count = cnt;
		thing = thang;
	}

	public int getCount() { //gets the count of an element
		return count;
	}

	public void setCount(int cnt) { //sets the count of an element
		count = cnt;
	}


	//sets the type of object in the given index
	public void setThing(Object obj) {
		thing = obj;
	}

	//accesses the object
	public Object getThing() {
		return thing;
	}


	//strange how we have to use equals() inside of the equals() method
	public boolean equals(Object obj) {
		ThingCount something = (ThingCount) obj;
		if (getThing().equals(something.getThing()) && getCount() == something.getCount())
			return true;
		return false;
	}

	//runtimeexception is used to catch if objects are not of the same type
	public int compareTo(Object obj) {
		
		ThingCount other = (ThingCount) obj;
		if (!other.getThing().getClass().equals(getThing().getClass()))
			throw new RuntimeException("both objects are not same type");
		if (!(other.getThing() instanceof Comparable) && getThing() instanceof Comparable) 
			throw new RuntimeException("object does not extend comparable class");


		return ((Comparable)getThing()).compareTo(other.getThing());
	}
	

	public String toString() {
		return "" + getThing() + " - " + getCount();
	}


}