import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Elevator {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int cases;
		final int top;
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			cases = Integer.parseInt(st.nextToken());
			top = Integer.parseInt(st.nextToken());
			int[] theFloors = new int[cases];
			int[] seconds = new int[cases];
			for (int i = 0; i < cases; i++) {
				StringTokenizer st1 = new StringTokenizer(br.readLine());
				theFloors[i] = Integer.parseInt(st1.nextToken());
				seconds[i] = Integer.parseInt(st1.nextToken());
			}
			Solver sol = new Solver();
			sol.solve(cases, top, theFloors, seconds);


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int people, int top, int[] floors, int[] seconds) {	
		int sec = 0;
		int curFloor = top;
		for (int i = people - 1; i >= 0; i--) {
			sec += curFloor - floors[i];
			curFloor = floors[i];
			if (sec < seconds[i]) {
				sec += seconds[i] - sec;
			}
			if (i == 0) {
				sec += curFloor;
			}
		}

		System.out.println(sec);
		
	}

}