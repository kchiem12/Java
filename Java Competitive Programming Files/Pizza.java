import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Pizza {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final BigInteger cases;
		try {
			cases = new BigInteger(br.readLine());
			Solver sol = new Solver();

			sol.solve(cases);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(BigInteger input) {	
		BigInteger one = new BigInteger("1");
		BigInteger people = input.add(one);
		BigInteger zero = new BigInteger("0");
		BigInteger two = new BigInteger("2");
		if (people.compareTo(one) == 0)
		{
			System.out.println(0);
		}
		else if (people.remainder(two).compareTo(zero) == 0)
		{
			System.out.println(people.divide(two));
		}
		else
		{
			System.out.println(people);
		}
		
	}

}