class Sum{

int add(int a, int b) {

return (a+b);   
}

public static void main (String args[]){
    System.out.println(" using Sum class");
    Sum a = new Sum();
    System.out.println("Sum is :" + a.add(5, 10));
    }
public static void main (int i)
 {
    System.out.println(" Using Sum class main function with integer argument");
    Sum a = new Sum();
    System.out.println("Sum is :" + a.add(20, 10));
 }
}

class DefClass {

public static void main (String args[])
{
	StaticCheck sc=new StaticCheck();
	System.out.println(sc.b);
	
	System.out.println(" using DefClass");
    Sum a = new Sum();
    System.out.println("Sum is :" + a.add(5, 10));
    Sum.main(null);
    Sum.main(1);
    String str=null;
    System.out.println(str.toString());
    
    StringBuffer sb1 = new StringBuffer("Amit");
    StringBuffer sb2 = new StringBuffer("Amit");
    String ss1 = "Amit";
    System.out.println(sb1==sb2);
    System.out.println(sb1.equals(sb2));
    System.out.println(sb1.equals(ss1));
    System.out.println("Poddar".substring(3)); 
}
}