import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyYear {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final String cases;
		try {
			cases = br.readLine();
			Solver sol = new Solver();
			sol.solve(cases);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(String input) {
		int theIn = Integer.parseInt(input);	
		if (theIn < 10)
		{
			System.out.println(1);
		}
		else
		{
		int len = input.length();
		int pwr = (int)Math.pow(10, len - 1);
		int temp1 = theIn % pwr;
		int temp2 = theIn - temp1;
		int temp3 = temp2 + pwr;
		int ans = temp3 - theIn;
		System.out.println(ans);

	}
		
	}

}