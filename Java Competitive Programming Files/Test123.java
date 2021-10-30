import java.lang.*;

class Test123 {

	public static void main(String[] args) {

		System.out.println(myRandInt(10, 20));

	}


	static int myRandInt(int startInt, int endInt) {

		return (int)(Math.random() * (double)endInt) + startInt;


	}
}

