
public class RemoveJunc
{

	public static void main(String[] args)
	{
		// Remove junc,unwanted character by regular expression
		String s="@@$##$@   Testing *&)(    Java";
		s=s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s);

	}

}
