
public class AraayAdition
{

	public static void main(String[] args)
	{
		// 
		int []a=new int[15];
		int []b=new int[5];
		int []c=new int[a.length+b.length];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=i;
			if(i>=10){
				b[count]=i;
				count++;
			}
		}
		count=15;
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[count]=b[i];
			count++;
		}
		
		for(int i=0;i<a.length+b.length;i++)
		{
			System.out.print(" "+c[i]);
		}
		

	}

}
