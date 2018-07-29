package listsession;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistconcept
{

	public static <E> void main(String[] args)
	{
		//Dynamic array -ArrayList
		//maintain insertion order
		//store duplicate
		//Synchronize
		//allow random access of element because it store values on the basis of index
		
		//generic array list
		ArrayList<String> al=new ArrayList<String>();
		//add value
		al.add("Vikas");
		al.add("Vikrant");
		al.add("Vikram");
		System.out.println(al.size());
		al.add("Vikrant");
		al.add("Vikram");
		System.out.println(al.size());
		
		//get values by index
		System.out.println(al.get(2));
		
		//print arraylist values
		
		//1 for loop
		//2 iterator
		
		//for loop
		for(int i =0;i<al.size();i++)
			System.out.println(al.get(i));
		
		//non generic array list
		ArrayList al1=new ArrayList();
		//add value
		al1.add("Vikas");
		al1.add(1);
		al1.add(1.56);
		
		al1.add(true);
		al1.add("Vikram");
		System.out.println(al1);
		
		//generic array list
				ArrayList<E> al2=new ArrayList<E>();
				al2.add((E) "Vikram");
				System.out.println(al2);
		
		//object adding 
				System.out.println("Objects in ArrayList");
				Employee e1=new Employee("Tina",10,"child");
				Employee e2=new Employee("Meena",30,"Sugar");
				Employee e3=new Employee("Reena",35,"Education");
				ArrayList<Employee> eal=new ArrayList<Employee>();
				eal.add(e1);
				eal.add(e2);
				eal.add(e3);
				//Iterator
				
				Iterator<Employee> it=eal.iterator();
				while(it.hasNext())
				{
				  Employee e=it.next();
					System.out.println(e.age);
					System.out.println(e.name);
					System.out.println(e.dpt);
				}
	}

}
