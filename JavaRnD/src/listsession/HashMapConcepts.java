package listsession;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcepts
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//it store one null key and multiple null value
		//no order maintain
		//non shynchronised
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "UFT");
		hm.put(3, "Jmeter");
		
		//traverse
		for(Entry en : hm.entrySet())
		{
			System.out.println(en.getKey() +" " + en.getValue());
		}
		
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer,Employee> hm1=new HashMap<Integer,Employee>();
		Employee e1=new Employee("Vikas",36,"IT");
		Employee e2=new Employee("Vinod",30,"Account");
		Employee e3=new Employee("Manish",28,"HR");
		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);
		
		//traverse hashmap
		for(Entry<Integer,Employee> en1:hm1.entrySet())
		{
			int key=en1.getKey();
			Employee e=en1.getValue();
			System.out.println("Employee" +" " +key +" "+ "info:");
			System.out.println(e.dpt +  " " +e.name+" "+e.age);
			
		}
		
	}

}
