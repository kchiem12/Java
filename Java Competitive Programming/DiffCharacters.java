import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DiffCharacters {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final String word;
		final int diff;
		try {
		word = br.readLine();
		diff = Integer.parseInt(br.readLine());
		Solver sol = new Solver();
		sol.solve(word, diff);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(String word, int diff) {	
		int diffChar = 0;
		int sameChar = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (word.substring(i, i + 1).equals(word.substring(j, j + 1))) {
					diffChar--;
					sameChar++;
					break;
				}
			}
			diffChar++;
		}

		if (diffChar > diff) {
			System.out.println(0);
		}
		else if (diffChar + sameChar >= diff && diffChar <= diff) {
			System.out.println(diff - diffChar);
		}
		else if (diff < diffChar + sameChar) {
			System.out.println(Math.abs(diff - diffChar));
		}
		else {
			System.out.println("impossible");
		}

		
	}

}