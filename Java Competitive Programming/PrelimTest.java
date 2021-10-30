public abstract class PrelimTest {
		public String getName();
}

public abstract class Stuff extend PrelimTest{
	private String name;
	public PrelimTest (String n) {
		name = n;
	}
}