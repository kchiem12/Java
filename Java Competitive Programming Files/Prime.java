import java.util.*;
import java.io.*;

public class Prime
{

	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	Solver sol = new Solver();
	final int n = in.nextInt();

	sol.solve(n);

}


}

class Solver
{
	public void solve(int num)
	{
		if (num % 2 == 0)
		{
			System.out.println(num / 2);
			String ans = "";
			for (int i = 0; i < num / 2; i++)
			{
				ans += 2 + " ";
			}
			System.out.println(ans.trim());
		}
		else
		{ 
			num -= 3;
			System.out.println((num / 2) + 1);
			String ans = "";
			for (int k = 0; k < num / 2; k++)
			{
				ans += 2 + " ";
			}
			ans += 3;
			System.out.println(ans.trim());
		}
	}
}