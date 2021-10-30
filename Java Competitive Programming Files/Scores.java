import java.util.*;
import java.io.*;
import java.math.*;

public class Scores
{
	public int solve(int p, int v, int t){
		int count = 0;
		int[] arr = {p, v, t};
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == 1)
			{
				count++;
			}
		}
		if (count >= 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args)
	{
		Scores suh = new Scores();
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int ans = 0;
		for (int i = 0; i < N; i++)
		{
			int p = in.nextInt();
			int v = in.nextInt();
			int t = in.nextInt();
			ans += suh.solve(p, v, t);
		}
		System.out.println(ans);
	}
}