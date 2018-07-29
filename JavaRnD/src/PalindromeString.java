import java.util.Scanner;


public class PalindromeString
{

	public static void main(String[] args)
	{
		// If str="VIKIV" and its reverse="VIKIV" is equal then str is called palindrome.
		System.out.println("Enter a String want to check as palindrome:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(isPalindromeString(str))
		{
			
			System.out.println(str+" is a polindrome");
		}else
		{
			System.out.println(str+" is not a polindrome");
		}

	}
	

    private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }


}
