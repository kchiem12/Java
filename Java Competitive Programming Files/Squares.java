import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Squares {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int cases;
		try {
			cases = Integer.parseInt(br.readLine().trim());
			Solver sol = new Solver();

			for (int i = 0; i < cases; i++)
			{
				String s = br.readLine();
				String[] suh = s.split(" ");
			sol.solve(Integer.parseInt(suh[0]), Integer.parseInt(suh[1]));
		}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int side1, int side2) {	
		int ans = 0;
		if (side1 > side2)
		{
			double temp = side2 * 2;
			if (temp < side1)
			{
				ans = (int)Math.pow(temp + (side1 - temp), 2);
			}
			else
			{
				ans = (int)Math.pow(temp, 2);
			}
		}
		else if (side2 > side1)
		{
			double temp = side1 * 2;
			if (temp < side2)
			{
				ans = (int)Math.pow(temp + (side2 - temp), 2);
			}
			else
			{
				ans = (int)Math.pow(temp, 2);
			}
		}
		else
		{
			ans = (int)Math.pow((double)side1 * 2, 2);
		}

		System.out.println(ans);
		
	}

}