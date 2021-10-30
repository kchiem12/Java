import java.io.*;
import java.util.*;

public class TheToys {

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
		long numberToys = in.nextLong();
		long num = in.nextLong();

		if (numberToys + (numberToys - 1) < num) {
			System.out.println(0);
		} else if (numberToys == num && numberToys % 2 != 0) {
			System.out.println(numberToys / 2);
		} else if (numberToys == num && numberToys % 2 == 0) {
			System.out.println((numberToys / 2) - 1);
		} else if (num > numberToys) {
			long start = num - numberToys;
			long end = numberToys - start + 1;
			System.out.println(end / 2);
		} else {
			if (num % 2 == 0) {
				System.out.println((num / 2) - 1);
			} else {
				System.out.println(num / 2);
			}
		}


	}


}
