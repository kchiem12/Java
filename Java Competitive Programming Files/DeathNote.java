import java.io.*;
import java.util.*;

public class DeathNote {

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
		int n = in.nextInt();
		int m = in.nextInt();
		int count = 0;
		int page = 0;
		for (int i = 0; i < n; i++) {
			count = count + in.nextInt();
			if (i < n-1) {
			if (count / m >= 1) {
				page += count / m;
				count = count - ((count / m) * m);
			}
			System.out.print(page + " ");
			page = 0;
		} else {
			if (count / m >= 1) {
				page += count / m;
				count = count - ((count / m) * m);
			}
			System.out.println(page);
		}
		}

	}


}
