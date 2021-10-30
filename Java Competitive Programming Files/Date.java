import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int x;
		final int y;
		final int steps;
		try {
			String first = br.readLine();
			String[] suh = first.split(" ");
			x = Integer.parseInt(suh[0]);
			y = Integer.parseInt(suh[1]);
			steps = Integer.parseInt(suh[2]);
			Solver sol = new Solver();

			sol.solve(x, y, steps);


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int x, int y, int stps) {	
		int minSteps = Math.abs(x) + Math.abs(y);

		if ((minSteps - stps) % 2 == 0 && minSteps <= stps)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}

}