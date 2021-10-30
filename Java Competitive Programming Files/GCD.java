import java.io.*;
import java.util.*;

public class GCD {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
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
		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();
		int turn = 0;

		int temp1 = a;
		int temp2 = b;

		while (n > 0) {


			if (n == 0) {
					break;
			}

			if (turn == 0) {
				if (n % temp1 != 0 || a % temp1 != 0) {
					temp1--;
				} 
				else {
					n = n - temp1;
					temp1 = a;
					turn = 1;
				}
			}
			else {
				if (n % temp2 != 0 || b % temp2 != 0) {
					temp2--;
				} 
				else {
					n = n - temp2;
					temp2 = b;
					turn = 0;
				}
			}
		}
		if (turn == 0){ 
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		}
	}




