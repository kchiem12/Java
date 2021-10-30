import java.util.*;
import static java.lang.System.*;

/*
	LAB 3 FOR LIST NODES
*/

public class ListFunHouseRunnerTwo
{
	public static void main ( String[] args )
	{
		ListFunHouseTwo funHouse = new ListFunHouseTwo(); 
		
		funHouse.add("go");
		funHouse.add("on");
		funHouse.add("at");
		funHouse.add("34");
		funHouse.add("2.1");
		funHouse.add("-a-2-1");
		funHouse.add("up");		       		
		funHouse.add("over");
			 			
		System.out.println("Original list values\n");	
		System.out.println(funHouse);
		System.out.println("\n");
		

		System.out.println("num nodes = " + funHouse.nodeCount());

		System.out.println("\nList values after calling nodeCount\n");	
		System.out.println(funHouse);
		System.out.println();		

		funHouse.doubleLast();		
		System.out.println("\nList values after calling doubleLast\n");							
		System.out.println(funHouse);
		System.out.println();				


		funHouse.doubleFirst();		
		System.out.println("\nList values after calling doubleFirst\n");							
		System.out.println(funHouse);
		System.out.println();	

		funHouse.removeNode("at");
		System.out.println("\nList values after calling removeNode(\"at\")\n");
		System.out.println(funHouse);
		System.out.println();
				
		
		funHouse.removeXthNode(3);		
		System.out.println("\nList values after calling removeXthNode(3)\n");					
		System.out.println(funHouse);
		System.out.println();			
		
		
		funHouse.setXthNode(2,"one");		
		System.out.println("\nList values after calling setXthNode(2,one)\n");										
		System.out.println(funHouse);
		System.out.println();	

		funHouse.skipEveryOther();
		System.out.println("\nList Values after calling skipEveryOther()\n");
		System.out.println(funHouse);
		System.out.println();	

	}
}