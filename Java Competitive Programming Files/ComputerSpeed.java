import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputerSpeed {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int cases;
		final int participants;
		try {
			String first = br.readLine();
			String[] firstLine = first.split(" ");
			cases = Integer.parseInt(firstLine[0]);
			participants = Integer.parseInt(firstLine[1]);
			String speed = br.readLine();
			String[] computers = speed.split(" ");
			Solver sol = new Solver();
			sol.solve(cases, participants, computers);
			


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int numComp, int part, String[] spd) {
		
		for (int i = 1; i < numComp; i++)
		{
			int currNum = Integer.parseInt(spd[i]);
			int currIndex = i - 1;
			while (currIndex >= 0 && Integer.parseInt(spd[currIndex]) < currNum)
			{
				spd[currIndex + 1] = spd[currIndex];
				currIndex--;
			}
			spd[currIndex + 1] = String.valueOf(currNum);
		}
		
		System.out.println(spd[part - 1]);
	}

}