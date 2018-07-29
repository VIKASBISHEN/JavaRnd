package string;

import java.util.Scanner;

public class CountWords
{

	public static void main(String[] args)
	{
		// str="Testing Java"   ,count=2
		
		System.out.println("Enter String with more than two words:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		char [] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
				count++;
			}
				
		}
		count++;
		System.out.println(count +" Words");

	}

}
