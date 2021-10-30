import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Marching {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int groups;
		try {
			groups = Integer.parseInt(br.readLine());
			int[] people = new int[groups];
			Solver sol = new Solver();
			sol.solve(groups, people);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int groups, int[] people) {	
		int[] sorted = sort(people);
		for (int num : sorted) {
			System.out.print(num + " ");
		}
	}


	public int[] sort (int[] arr) {
		int min = 0;
		for (int i = 1; i < arr.length; i++) {
			int currNum = arr[i];
			int currIndex = i - 1;

			while (currIndex >= 0 && currNum > arr[currIndex]) {
				arr[currIndex + 1] = arr[currIndex];
				currIndex--;
			}

			arr[currIndex + 1] = currNum;
		}

		return arr;

	}

}