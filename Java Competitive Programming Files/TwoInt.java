import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TwoInt{
	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int input;
		try {
				input = Integer.parseInt(br.readLine());
				int i = 0;
				while (i < input){
				Solver sol = new Solver();
				String in = br.readLine();
				int a = Integer.parseInt(in.substring(0, in.indexOf(" ")));
				int b = Integer.parseInt(in.substring(in.indexOf(" ") + 1, in.length()));
				sol.solve(a, b);
				i++;
				}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int a, int b) {	
		int ans = 0;
		int theA = a;
		while (b - theA >= 10 || theA - b >= 10) {
			if (theA > b){
			ans += (theA - b)/10;
			theA -= 10 * ((theA - b)/10);
			}
			else {
			ans += (b - theA) / 10;
			theA += 10 * ((b - theA)/10);
			}

		}

		if (b - theA < 10 && b - theA > 0 && theA != b) {
			theA += (b - theA);
			ans++;
		}

		if (theA - b < 10 && theA - b > 0 && theA != b) {
			theA -= (b - theA);
			ans++;
		}


		System.out.println(ans);
		
	}
}

