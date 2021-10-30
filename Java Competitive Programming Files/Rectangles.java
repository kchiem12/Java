import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rectangles {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int a;
		final int b;
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int a1 = Integer.parseInt(st1.nextToken());
			int b1 = Integer.parseInt(st1.nextToken());
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int a2 = Integer.parseInt(st2.nextToken());
			int b2 = Integer.parseInt(st2.nextToken());
			Solver sol = new Solver();

			sol.solve(a, b, a1, b1, a2, b2);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int a, int b, int a1, int b1, int a2, int b2) {	
		int min1 = Math.min(a1, b1);
		int min2 = Math.min(a2, b2);
		int min = Math.min(a, b);
		int max1 = Math.max(a1, b1);
		int max2 = Math.max(a2, b2);
		int max = Math.max(a, b);

		if ((min1 + min2) <= min) {
			if (max1 > max || max2 > max) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
		else if ((max1 + max2) <= max && (min1 <= min && min2 <= min)) {
			System.out.println("YES");
		}
		else if (max1 <= min && min2 <= min && min1 + max2 <= max) {
			System.out.println("YES");
		}
		else if (max2 <= min && min1 <= min && min2 + max1 <= max) {
			System.out.println("YES");
		}
		else if ((max1 <= min && max2 <= min) && min1 + min2 <= max) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}

}