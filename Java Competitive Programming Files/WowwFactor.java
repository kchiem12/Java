import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WowwFactor{
	

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

		/*for (int i = 0; i < in.length(); i++) {
			if (in.substring(i, i + 1).equals("o")) {
				theO++;
				indexes.add(i);
			}
		}*/

		int counter = 0;
		int theO = in.indexOf("o");
		while (counter <= in.length() - 1) {

			if (theO == -1) {
				break;
			}

		
			if (in.substring(counter, counter + 2).equals("vv")){
				for (int j = theO + 1; j < in.length() - 1; j++) {
					if (in.substring(j, j + 1).equals("v")){
					ans++;
					}
				}
				counter++;
				}
	
			if (in.substring(counter, counter + 2).equals("vo")){
				counter+= 2;
				theO = in.substring(counter, in.length()).indexOf("o");

			}

			if (in.substring(counter, counter + 1).equals("o")){
				counter++;
				theO = in.substring(counter, in.length()).indexOf("o");
			}
			/*if (counter >= in.length() - 1 || !in.substring(counter + 2, counter + 3).equals("v"))  {
					indexes.remove(0);
					theO--;
					counter = 0;
				}
				else {
			counter++;
		}*/
		}

		System.out.println(ans);

	}

}
