
public class MissingNumInArray
{

	public static void main(String[] args)
	{
		// 1,2,3,4,---,6,7,8,9
		
		int num[]={0,1,2,4,3,5,6,9,8};
		int sum=0;
		
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		
		System.out.println(sum);
		int num1=0;
		for(int i=0;i<10;i++)
		{
			num1=num1+i;
		}
		
		System.out.println(num1);
	    int misnum=num1-sum;
		System.out.println("Missing number is:"+misnum);

	}

}
