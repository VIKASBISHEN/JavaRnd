
public class ReverseInteger
{

	public static void main(String[] args)
	{
		// Reverse Integer
		long num=12345,rev=0,rem=0;
		System.out.println(num);
		while(num !=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
	    System.out.println(rev);
        long value=7654321;
	    System.out.println(new StringBuffer(String.valueOf(value)).reverse());
	    
        
	}

}
