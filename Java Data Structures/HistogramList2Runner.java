import static java.lang.System.*;

/*
	LAB 5 FOR LINKED LISTS
*/

public class HistogramList2Runner
{
	public static void main(String[] args)
	{
		HistoList2 test = new HistoList2();
		String testString = "ABCDEFABCDEFFEDCBAAAAABBBBBCCCDAAAAAAAEEFFF";
		for(char c : testString.toCharArray())
		{
			test.add(c);
		}
		System.out.println(test);


		//add more test cases
		test = new HistoList2();
		String testCase2 = "11 22 33 44 55 66 33 44 22 11 11 11 11 22 11 11 11";
		String[] temp1 = testCase2.split("\\s+");
		for(String n : temp1) {
			test.add(Integer.parseInt(n));
		}
		System.out.println(test);

		test = new HistoList2();
		String testCase3 = "1.1 2.2 3.3 4.4 5.5 6.6 3.3 4.4 2.2 1.1 1.1 1.1 1.1 2.2 1.1";
		temp1 = testCase3.split("\\s+");
		for(String n : temp1) 
			test.add(Double.parseDouble(n));
		System.out.println(test);

		
		
		//demonstrate bad data check
		test = new HistoList2();
		test.add("dog");
		test.add(33);
		test.add(3.4);
		System.out.println(test);
	}
}