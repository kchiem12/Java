import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subtraction {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int cases;
		final int subtract;
		try {
			String firstLine = br.readLine();
			String[] first = firstLine.split(" ");
			cases = Integer.parseInt(first[0]);
			subtract = Integer.parseInt(first[1]);
			Solver sol = new Solver();
			sol.solve(cases, subtract);
			


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int num, int sub) {
		int theNum = num;

		for (int i = 0; i < sub; i++)
		{
			if (theNum == 1)
			{
				break;
			}
			if (theNum % 10 != 0)
			{
				theNum--;
			}
			else
			{
				theNum /= 10;
			}
		}
		System.out.println(theNum);
		
	}

}