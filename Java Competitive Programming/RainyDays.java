import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RainyDays {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int daysOfSummer;
		final int daysBefore;
		final int daysAfter;
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			daysOfSummer = Integer.parseInt(st.nextToken());
			daysBefore = Integer.parseInt(st.nextToken());
			daysAfter = Integer.parseInt(st.nextToken());
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int[] days = new int[st1.countTokens()];
			int n = 0;
			while (st1.hasMoreTokens())
			{
				days[n] = Integer.parseInt(st1.nextToken());
				n++;
			}


			Solver sol = new Solver();
			sol.solve(daysOfSummer, daysBefore, daysAfter, days);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int summer, int before, int after, int[] days) {	

		int min = 0;
		boolean worth = true;
		for (int i = 0; i < summer; i++)
		{
			if (i - before < 0 || i + after >= summer)
			{
				int temp = i - 1;
				while (temp >= 0 && temp >= i - before)
				{
					if (days[i] > days[temp])
					{
						worth = false;
						break;
					}
					temp--;
				}
				if (worth)
				{
					int temp2 = i + 1;
					while (temp2 < summer && temp2 <= i + after)
					{
						if (days[i] > days[temp2])
						{
							worth = false;
							break;
						}
						temp2++;
					}

				}

				if (worth)
				{
					min = i;
					break;
				}
			}
			else
			{
				int temp = i - 1;
				while (temp >= i - before)
				{
					if (days[i] > days[temp])
					{
						worth = false;
						break;
					}
					temp--;
				}
				if (worth)
				{
					int temp2 = i + 1;
					while (temp2 <= i + after)
					{
						if (days[i] > days[temp2])
						{
							worth = false;
							break;
						}
						temp2++;
					}

				}

				if (worth)
				{
					min = i;
					break;
				}
			}
			

			worth = true;
		}

		System.out.println(min + 1);
		
	}

}