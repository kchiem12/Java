import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoyOrGirl {

	

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
		
		int count = 0;
		for (int i = 0; i < input.length(); i++)
		{
			String chara = input.substring(i, i + 1);
			int dup = 0;
			for (int k = i - 1; k >= 0; k--)
			{
				if (chara.equals(input.substring(k, k + 1)))
				{
					dup++;
				}
			}
			if (dup == 0)
			{
				count++; 
			}
		}

		if (count % 2 == 0)
		{
			System.out.println("CHAT WITH HER!");
		}
		else
		{
		System.out.println("IGNORE HIM!");
	}
	}

}