import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int cases;
		try {
			cases = Integer.parseInt(br.readLine().trim());

			Solver sol = new Solver();
			sol.solve(cases);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int input) {	
		if ((input - 2) % 2 == 0 && input > 2)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}

}