import java.util.*;

public class Game {

	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int n;
			n = in.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			Solver sol = new Solver();

			sol.solve(arr, n);

	}

}

class Solver {

	public void solve(int[] arr, int n) {	
		Arrays.sort(arr, 0, n);
		if (n % 2 > 0) {
			System.out.println(arr[n/2]);
		}
		else {
			System.out.println(arr[n/2 - 1]);
		}
		
	}

}