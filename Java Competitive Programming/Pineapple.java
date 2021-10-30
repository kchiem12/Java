import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pineapple {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int start;
		final int interval;
		final int time;
		try {
			String ferda = br.readLine();
			String [] stuff = ferda.split(" ");
			start = Integer.parseInt(stuff[0]);
			interval = Integer.parseInt(stuff[1]);
			time = Integer.parseInt(stuff[2]);
			Solver sol = new Solver();
			sol.solve(start, interval, time);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int strt, int inter, int tme) {	
		int mult = 1;
		int temp = strt;
		
		while (temp < tme)
		{
			temp = strt + (mult * inter) + 1;
			mult ++;
		}
		if (temp == tme)
		{
			System.out.println("YES");
		}
		else if ((temp - 1) == tme)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}

}