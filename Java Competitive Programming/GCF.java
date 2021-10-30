import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GCF {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int a;
		final int b;
		try {
				StringTokenizer st = new StringTokenizer(br.readLine());
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				Solver sol = new Solver();

				sol.solve(a, b);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int a, int b) {	
		int min = Math.min(a, b);
		long minFact = 1;
		for (int i = 1; i <= min; i++)
		{
			minFact = minFact * i;
		}


		System.out.println(minFact);
	}

}