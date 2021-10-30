import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Axles {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int a;
		final int b;
		try {
			a = Integer.parseInt(br.readLine());
			StringTokenizer as = new StringTokenizer(br.readLine());
			int[] theA = new int[a];
			for (int i = 0; i < a; i++) {
				theA[i] = Integer.parseInt(as.nextToken());
			}

			b = Integer.parseInt(br.readLine());
			StringTokenizer bs = new StringTokenizer(br.readLine());
			int[] theB = new int[b];
			for (int i = 0; i < b; i++) {
				theB[i] = Integer.parseInt(bs.nextToken());
			}

			
			Solver sol = new Solver();

			sol.solve(theA, theB);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int[] theA, int[] theB) {	
		
		int max = 0;
		int leftOff = 0;
		int count = 0;
		int lenB = theB.length - 1;
		int lenA = 0;
		int more = 0;

		while (!(lenB < 0) && lenA != theA.length) {
			 if (theB[lenB] % theA[lenA] == 0) {
			 	max = theB[lenB] / theA[lenA];
			 	count++;
			 	leftOff = lenA;
			 	break;
			 }
			 else if (theB[lenB] < theA[lenA]) {
			 	lenA++;
			 	lenB = theB.length - 1;
			 }
			 else {
			 	lenB--;
			 }

			 if (lenB < 0) {
			 	lenB = theB.length - 1;
			 	lenA++;
			 }

			 if (lenA == theA.length) {
			 	more = -1;
			 	break;
			 }
		}

		lenA = leftOff + 1;
		lenB = theB.length - 1;
		while (more == 0 && lenA != theA.length && !(lenB < 0)) {
			if (theB[lenB] % theA[lenA] == 0) {
				if (theB[lenB] / theA[lenA] >= max) {
					count++;
					lenA++;
					lenB = theB.length - 1;
				} else {
					break;
				}
			} else {
				lenB--;
			}
			

			if (lenB == 0) {
			 	lenB = theB.length - 1;
			 	lenA++;
			 }

			 if (lenA == theA.length) {
			 	more = -1;
			 	break;
			 }
		}

		System.out.println(count);

		
	}

}