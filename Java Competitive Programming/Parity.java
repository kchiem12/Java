import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Parity {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int cases;
		try {
				cases = Integer.parseInt(br.readLine());
				Solver sol = new Solver();
				for (int i = 0; i < cases; i++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					int n = Integer.parseInt(st.nextToken());
					int k = Integer.parseInt(st.nextToken());
					sol.solve(n, k);
				}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int n, int k) {	


		if (n == 2 && k == 1) {
			System.out.println("YES");
			System.out.println(2);
		}
		else if (k > n || n - 1 == k) {
			System.out.println("NO");
		}
		else if (k == n){
			System.out.println("YES");
			for (int i = 0; i < k; i++) {
				if (i == k - 1) {
					System.out.println(1);
				}
				else {
					System.out.print(1 + " ");
				}
			}
		}
		else if ((k - 1) * 2 >= n) {
			int temp1 = n;
			int something = temp1 - (k - 1);
			if (something % 2 == 1) {
				System.out.println("YES");
				for (int j = 0; j < k; j++) {
					if (j == k - 1) {
						System.out.println(something);
					}
					else {
						System.out.print(1 + " ");
					}
				}
			}
			else {
				System.out.println("NO");
			}
		}
		else {
			int temp2 = n;
			int though = temp2 - ((k - 1) * 2);
			if (though % 2 == 0) {
				System.out.println("YES");
				for (int u = 0; u < k; u++) {
					if (u == k - 1) {
						System.out.println(though);
					}
					else {
						System.out.print(2 + " ");
					}
				}
			}
			else {
			int temp1 = n;
			int something = temp1 - (k - 1);
			if (something % 2 == 1) {
				System.out.println("YES");
				for (int j = 0; j < k; j++) {
					if (j == k - 1) {
						System.out.println(something);
					}
					else {
						System.out.print(1 + " ");
					}
				}
			}
			else {
				System.out.println("NO");
			}
			}
		}
		
	}

}