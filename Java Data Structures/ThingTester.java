public class ThingTester {

	public static void main(String args[]) {
	ThingCount1 one = new ThingCount1();
	ThingCount1 two = new ThingCount1('A',5);
		
	System.out.println(one);
	System.out.println(two);
		
	ThingCount1 three = new ThingCount1("hello", 7);
	System.out.println(three);
		
	System.out.println(three.getCount());
	three.setCount(22);
	three.setThing(54.12);
	System.out.println(three);		
		
	System.out.println(three.equals(two));
	two.setCount(22);
	two.setThing(54.12);		
	System.out.println(two.equals(three));	
		
	System.out.println(three.compareTo(two));
	two.setCount(11);
	two.setThing(14.12);		
	System.out.println(two.compareTo(three));	
	System.out.println(three.compareTo(two));	
}
}