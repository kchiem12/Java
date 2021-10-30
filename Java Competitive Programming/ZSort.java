import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ZSort {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int len;
		try {
			len = Integer.parseInt(br.readLine().trim());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[len];
			int n = 0;
			while(st.hasMoreTokens())
			{
				arr[n] = Integer.parseInt(st.nextToken());
				n++;
			}
			Solver sol = new Solver();
			sol.solve(len, arr);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int len, int[] arr) {	
		int[] temp = new int[len];
		int[] temp1 = new int[len];
		int n = 0;
		for (int suh : arr)
		{
			temp[n] = suh;
			temp1[n] = suh;
			n++;
		}
		int[] sorted = new int[len];
		if (len == 1)
		{
			System.out.println(arr[0]);
		}
		else
		{

	int even = 0;
	for (int i = 0; i < len - 1; i ++)
	{
		if (even >= len)
		{
			break;
		}
		int min = temp[i];
		for (int k = i + 1; k < len; k ++)
		{
			if (min > temp[k])
			{
				min = temp[k];
				int temper = temp[k];
				temp[k] = temp[i];
				temp[i] = temper;
			}
		}
		sorted[even] = min;
		even += 2;
	}

	int odd = 1;
	for (int i = 0; i < len - 1; i ++)
	{
		if (odd >= len)
		{
			break;
		}
		int max = temp1[i];
		for (int j = i + 1; j < len; j ++)
		{
			if (max < temp1[j])
			{
				max = temp1[j];
				int tempor = temp1[j];
				temp1[j] = temp1[i];
				temp1[i] = tempor;
			}
		}
		sorted[odd] = max;
		odd += 2;
	}

	if (len % 2 == 0)
	{
		if(sorted[len - 2] > sorted[len - 1])
		{
			System.out.println("Impossible");
		}
		else
		{
			String ans = "";
			for (int suh : sorted)
			{
				ans += suh + " ";
			}
			System.out.println(ans.trim());
		}
		
	}
	else
	{
		if (len == 1)
		{
			System.out.println(sorted[0]);
		}
		else if (sorted[len - 2] < sorted[len - 1])
		{
			System.out.println("Impossible");
		}
		else
		{
			String ans = "";
			for (int bruh : sorted)
			{
				ans += bruh + " ";
			}
			System.out.println(ans.trim());
		}
	}
}
	}

}