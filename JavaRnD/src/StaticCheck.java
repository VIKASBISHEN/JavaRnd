
public class StaticCheck
{
    static int a=2;
    static int b=1;
	static {System.out.println("Test Static");
	System.out.println(b);
	System.exit(0);
	}
	
	public void test()
	{
		this.a=6;
	}
	
	public static void main(String []args)
	{
		StaticCheck sc=new StaticCheck();
		sc.test();
		System.out.println(sc.a);
	}
}
