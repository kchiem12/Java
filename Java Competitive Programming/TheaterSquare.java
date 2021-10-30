import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheatreSquare {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int side1;
		final int side2;
		final int square;
		try {
			String line = br.readLine();
			String[] suh = line.split(" ");
			side1 = Integer.parseInt(suh[0]);
			side2 = Integer.parseInt(suh[1]);
			square = Integer.parseInt(suh[2]);
			Solver sol = new Solver();

			sol.solve(side1, side2, square);



		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int side1, int side2, int sq) {	
		int ans = (side1 / sq) * (side2 / sq);

		if(side1 * side2 % sq != 0)
		{
			int temp1 = (side1 / sq) + 1;
			int temp2 = side2 / sq;
			ans += temp1 + temp2;
		}

		System.out.println(ans);
		
	}

}