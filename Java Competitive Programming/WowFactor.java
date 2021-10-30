import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WowFactor {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final String input;
		try {
				input = br.readLine();
				Solver sol = new Solver();
				sol.solve(input);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(String in) {	
		int ans = 0;
		int theO = 0;
		ArrayList<Integer> indexes = new ArrayList<Integer>();

		for (int i = 0; i < in.length(); i++) {
			if (in.substring(i, i + 1).equals("o")) {
				theO++;
				indexes.add(i);
			}
		}

		int counter = 0;

		while (theO > 0) {

			if (counter >= in.length() - 1) {
				break;
			}

			if (in.substring(0, 1).equals("o") || in.substring(1, 2).equals("o")) {
				theO--;
			}

			if (counter < (in.length() - 1) && in.substring(counter, counter + 1).equals("v") && in.substring(counter + 1, counter + 2).equals("v")) {
				int theBoys = indexes.get(0) + 1;
				for (int j = theBoys; j < in.length() - 1; j++) {
					if (in.substring(j, j + 1).equals("v") && in.substring(j + 1, j + 2).equals("v")) {
					ans++;
				}
				}
	
			}
			if (counter >= in.length() - 1 || !in.substring(counter + 2, counter + 3).equals("v"))  {
					indexes.remove(0);
					theO--;
					counter = 0;
				}
				else {
			counter++;
		}
		}

		System.out.println(ans);

	}

}