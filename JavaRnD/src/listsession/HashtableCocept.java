package listsession;

import java.util.Hashtable;

public class HashtableCocept
{

	public static void main(String[] args)
	{
		// synchronized
		
		Hashtable h1=new Hashtable();
		h1.put(1, "VIKAS");
		h1.put(2, "VIKRANT");
		h1.put(3, "VIVEK");
		
		Hashtable h2=new Hashtable();
		h2=(Hashtable) h1.clone();
		System.out.println(h1);
		System.out.println(h2);
		
		
	}

}
