import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latin {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int cases;
		final String word;
		try {
			cases = Integer.parseInt(br.readLine());
			word = br.readLine();
			Solver sol = new Solver();
			sol.solve(cases, word);
			


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int len, String words) {

		String[] arr = new String[len];
		for (int i = 0; i < len - 1; i++)
		{
			arr[i] = words.substring(i, i + 2);
		}

		int currIndex = 0;
		int theCount = 0;
		for (int k = 0; k < len - 1; k++)
		{
			int count = 0;
			for (int j = k + 1; j < len; j++)
			{
				if (arr[k].equals(arr[j]))
				{
					count++;
				}
			}
			if (count > theCount)
			{
				theCount = count;
				currIndex = k;
			}
		}

		System.out.println(arr[currIndex]);

		
	}

}