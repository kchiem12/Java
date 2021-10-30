import java.io.*;
import java.util.*;

public class SeqNim {

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader () {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	public static void main(String[] args) {
		FastReader in = new FastReader();
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int[] piles = new int[n];
			int ones = 0;
			int winner = 0;
			for (int s = 0; s < n; s++) {
				piles[s] = in.nextInt();
				if (piles[s] == 1) {
					ones++;
				}
				 else if (s > 0 && piles[s - 1] == 1 && piles[s] != 1) {
					if (winner == 0) {
						winner = 1;
					} else {
						winner = 0;
					}
				}
				
			}
			if (ones == 0) {
				System.out.println("First");
			}
			else if (ones == n) {
				if (ones % 2 == 0) {
					System.out.println("Second");
				} else {
					System.out.println("First");
				}
			}
			 else if (winner == 0) {
				System.out.println("First");
			} else {
				System.out.println("Second");
			}

		}



	}
}