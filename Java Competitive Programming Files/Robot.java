import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Robot {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int cases;
		try {
			cases = Integer.parseInt(br.readLine().trim());

			Solver sol = new Solver();
			sol.solve(br.readLine().trim().replaceAll("\\s", ""), br.readLine().trim().replaceAll("\\s", ""), cases);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(String input, String input1, int len) {	
		int[][] scores = new int[2][len];
		int greater = 0;
		int firstOne = 0;
		int secondOne = 0;
		int ans;
		for (int i = 0; i < len; i++)
		{
			scores[0][i] = Integer.parseInt(input.substring(i, i+1));
			scores[1][i] = Integer.parseInt(input1.substring(i, i+1));
		}

		for (int k = 0; k < len; k++)
		{
			if (scores[0][k] > scores[1][k])
			{
				greater++;
			}
			if (scores[0][k] == 1)
			{
				firstOne++;
			}
			if (scores[1][k] == 1)
			{
				secondOne++;
			}

		}
		firstOne -= greater;

		if (firstOne < secondOne || greater > 0)
		{
			if (greater > 0)
			{
					ans = ((secondOne - firstOne) / greater) + 1;
			}
			else
			{
				ans = -1;
			}

		}
		else if (firstOne > secondOne)
		{
			ans = 1;
		}
		else
		{
			ans = -1;
		}

		System.out.println(ans);
	}

}