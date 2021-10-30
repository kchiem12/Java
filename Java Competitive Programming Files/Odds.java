import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Odds {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int cases;
		try {
			cases = Integer.parseInt(br.readLine());
			Solver sol = new Solver();

			for (int i = 0; i < cases; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int length = Integer.parseInt(st.nextToken());
			int choose = Integer.parseInt(st.nextToken());
			int[] arr = new int[length];
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for (int j = 0; j < length; j++) {
				arr[j] = Integer.parseInt(st1.nextToken());
			}
			sol.solve(length, choose, arr);
		}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int len, int choose, int[] arr) {	

		int evens = 0;
		int odds = 0;
		boolean ans = false;
		for (int i = 0; i < len; i++) {
			if (arr[i] % 2 == 0) {
				evens++;
			}
			else {
				odds++;
			}
		}

		if ((evens + odds) == choose) {
			if (odds % 2 != 0) {
				ans = true;
			}
		}
		else if ((evens + odds) > choose) {
			if (odds >= choose) {
				if (choose % 2 != 0) {
					ans = true;
				}
				else if (odds - 1 > 0 && evens > 0) {
					ans = true;
				}
			}
			else if (odds > 0) {
				ans = true;
			}
		}

		if (ans == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

}
}