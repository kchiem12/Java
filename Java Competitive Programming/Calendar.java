import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Calendar {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int days;
		final int months;
		try {
			days = Integer.parseInt(br.readLine());
			months = Integer.parseInt(br.readLine());
			int[] numDays = new int[months];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < months; i++) {
				numDays[i] = Integer.parseInt(st.nextToken());
			}
			Solver sol = new Solver();
			sol.solve(days, months, numDays);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int days, int months, int[] numDays) {	
		int count = 0;
		int dayCount = 1;
		for (int i = 0; i < months; i++) {
			if (dayCount > 1) {
				int temp = days - dayCount + 1;
				count += temp;
				dayCount = 1;

			}

			dayCount += numDays[i];

		}

		System.out.println(count);

		
	}

}