import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leaves {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int cases;
		try {
			cases = Integer.parseInt(br.readLine());
			Solver sol = new Solver();
			String[] leaves = new String[cases];
			for (int i = 0; i < cases; i++)
			{
				leaves[i] = br.readLine();
			}
			sol.solve(leaves);


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(String[] input) {
		int count = 0;
		for (int i = 0; i < input.length; i++)
		{
			count++;
			for (int k = i - 1; k >= 0; k--)
			{
				if (input[k].equals(input[i]))
				{
					count--;
					break;
				}
			}
		}
		System.out.println(count);
		
	}

}