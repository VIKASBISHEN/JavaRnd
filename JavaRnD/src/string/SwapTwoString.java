package string;

import java.util.Scanner;

public class SwapTwoString
{

	public static void main(String[] args)
	{
		// A="Test", B"Java"  after swap  A="Java", B"Test"
		
		System.out.println("Enter Frst String:");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		
		System.out.println("Enter Second String:");
		Scanner sc1=new Scanner(System.in);
		String str2=sc.nextLine();
		System.out.println("Before swap:"+str1+" "+ str2);
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println("After swap:"+str1+" "+ str2);
		

	}

}
