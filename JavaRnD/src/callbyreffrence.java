
public class callbyreffrence
{
    int var=50;
    public void method(int var)
    {
    	var=var+100;
    }
    
    public void method1(callbyreffrence ref)
    {
    	ref.var=ref.var+100;
    }
    
    public final static void main(String args[])
    {
    	callbyreffrence one=new callbyreffrence();
    	System.out.println("Before ="+one.var);
    	one.method1(one);
    	System.out.println("After="+one.var);
    }
}
