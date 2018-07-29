
public class ReverseStr
{

	public static void main(String[] args)
	{
		// Reverse String without any function
           String str="Selenium";
           int len=str.length();
           String rev="";
           for(int i=len-1;i>=0;i--)
           {
        	   rev=rev+str.charAt(i);
           }
           
           System.out.println(rev);
           //Reverse String with reverse function
           StringBuffer strb=new StringBuffer("Selenium");
           System.out.println(strb.reverse());
           }
     }


