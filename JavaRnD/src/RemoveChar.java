import java.util.Scanner;


public class RemoveChar
{

	public static void main(String[] args)
	{
		// Str="Test Java" ,remove 'J' from Str then look like  "Test ava"
		
		System.out.println("Enter a String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=str.substring(0, 4)+ str.substring(4, 9);
        System.out.println(str1);
        
       System.out.println( str.replace("J", ""));
       
       char []strar=str.toCharArray();
       String str2="";
       
       for(int i=0;i<str.length();i++)
       {
    	   if(strar[i]!='t')
    	   {
    		   str2+=String.valueOf(strar[i]);	
    	   }
       }
       
       System.out.println( str2);
	}

}
