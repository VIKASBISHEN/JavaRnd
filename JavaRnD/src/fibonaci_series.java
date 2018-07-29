public class fibonaci_series
{

	public static void main(String[] args)
	{
		int n = 11, i, f0 = 1, f1 = 1, f2 = 0;
		for (i = 1; i <= n; i++)
		{
			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
			f2 = f0;
			System.out.println(f2);
		}

	}

}
