import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BusRoutes {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int buses;
		final int firstTime;
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			buses = Integer.parseInt(st.nextToken());
			firstTime = Integer.parseInt(st.nextToken());
			int[] busRouteArrival = new int[buses];
			int[] interval = new int[buses];
			for (int i = 0; i < buses; i++) {
				StringTokenizer st1 = new StringTokenizer(br.readLine());
				busRouteArrival[i] = Integer.parseInt(st1.nextToken());
				interval[i] = Integer.parseInt(st1.nextToken());
			}

			Solver sol = new Solver();
			sol.solve(buses, firstTime, busRouteArrival, interval);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int buses, int first, int[] arrivals, int[] intervals) {	
		int min = 0;
		int minIndex = 0;

		for (int i = 0; i < buses; i++) {
			int temp1 = arrivals[i];
			if (arrivals[i] < first) {
				int temp = intervals[i];
				while (temp1 < first) {
					temp1 += temp;
				}
			}

			if (i == 0) {
				min = temp1 - first;
				minIndex = 1;
			}

			int temp2 = temp1 - first;
			if (temp2 < min) {
				min = temp2;
				minIndex = i + 1;
			}

			if (min == 0) {
				break;
			}

		}

		System.out.println(minIndex);

		
	}

}