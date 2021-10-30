import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Burls {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int cases;
		try {
			cases = Integer.parseInt(br.readLine().trim());
			Solver sol = new Solver();
			for (int i = 0; i < cases; i++)
			{
				sol.solve(Integer.parseInt(br.readLine()));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int input) {	
		int amount = input;
		int ans = 0;
		while (amount >= 10)
		{
				int temp1 = amount % 10;
				int temp2 = amount - temp1;
				ans += temp2;
				amount = (temp2 / 10) + temp1;
		}
		if (amount > 0)
		{
			ans += amount;
		}
		System.out.println(ans);
		
	}

}