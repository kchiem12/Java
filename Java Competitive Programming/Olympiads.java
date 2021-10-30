import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Olympiads {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int numPeople;
		try {

			numPeople = Integer.parseInt(br.readLine());
			int[] arr = new int[numPeople];
			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = 0;
			while (st.hasMoreTokens()){
				arr[n] = (Integer.parseInt(st.nextToken()));
				n++;
			}

			Solver sol = new Solver();
			sol.solve(arr, numPeople);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int[] students, int people) {	
		ArrayList<Integer> ones = new ArrayList<Integer>();
		ArrayList<Integer> twos = new ArrayList<Integer>();
		ArrayList<Integer> threes = new ArrayList<Integer>();



		for (int i = 0; i < people; i++)
		{
			if (students[i] == 1)
			{
				ones.add(i + 1);
			}
			else if (students[i] == 2)
			{
				twos.add(i + 1);
			}
			else
			{
				threes.add(i + 1);
			}
		}

		int min = Math.min(Math.min(ones.size(), twos.size()), threes.size());
		
		if (min == 0)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(min);
			for (int i = 0; i < min; i++)
			{
				System.out.println(ones.get(i) + " " + twos.get(i) + " " + threes.get(i));
			}
		}
		
	}

}