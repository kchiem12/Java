import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewRound {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int cases;
		final int length;
		try {
			String first = br.readLine();
			String[] stuff = first.split(" ");
			cases = Integer.parseInt(stuff[0]);
			length = Integer.parseInt(stuff[1]);
			String tests = br.readLine();
			Solver sol = new Solver();
			sol.solve(cases, length, tests);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int len, int para, String tests) {	
		String[] testCases = tests.split(" ");
		int ans = 0;

		for (int k = 0; k < len; k++)
		{
			if (Integer.parseInt(testCases[k]) >= Integer.parseInt(testCases[para - 1]) && Integer.parseInt(testCases[k]) > 0)
			{
				ans ++;
			}
		}
		System.out.println(ans);
		
	}

}