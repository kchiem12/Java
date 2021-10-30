import java.math.*;

public class ASum
{
	public static long findNb(long m)
	{
		int n = 0;
		long temp = 0;
		while (temp < m)
		{
			n++;
			temp += Math.pow(n, 3);
		}

		if (temp == m)
		{
			return n;
		}
		else
		{
			return -1;
		}
	}

	public static void main(String[] args)
	{
		System.out.println(findNb(1071225));
		System.out.println("Elapsed time: " + System.currentTimeMillis());
	}
}
