import java.lang.*;
import java.util.*;

/*
	LAB 1 FOR INTERFACES
*/

public class MonsterRunner {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in); //used for obtaining input

		//query for name and size of first monster
		System.out.print("Enter first monster's name : ");
		String firstName = in.nextLine();
		System.out.print("Enter first monster's size : ");
		int firstSize = Integer.parseInt(in.nextLine());  //for some odd reason in.nextInt() does not work

		//to obtain input for the creation of second monster
		System.out.print("Enter second monster's name : ");
		String secondName = in.nextLine();
		System.out.print("Enter second monster's size : ");
		int secondSize = Integer.parseInt(in.nextLine());

		//construction of the two objects
		DankSkeleton first = new DankSkeleton(firstSize, firstName);
		DankSkeleton second = new DankSkeleton(secondSize, secondName);



		//prints out statements about the two monsters and comparing them
		System.out.println("\n\nMonster 1 - " + first);
		System.out.println("Monster 2 - " + second +"\n\n");

		if (first.isBigger(second))
			System.out.println("Monster one is bigger than Monster two");
		else if (first.isSmaller(second))
			System.out.println("Monster one is smaller than Monster two");
		else
			System.out.println("Monster one is the same size as Monster two");

		if (first.namesTheSame(second)) 
			System.out.println("Monster one has same name as Monster two");
		else
			System.out.println("Monster one does not have same name as Monster two");

		in.close();

	}
}