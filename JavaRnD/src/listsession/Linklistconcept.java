package listsession;
import java.util.Iterator;
import java.util.LinkedList;


public class Linklistconcept
{

	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<String>();
		//add
		ll.add("Vikas");
		ll.add("Ram");
		ll.add("Shyam");
		System.out.println(ll);
		//add first
		ll.addFirst("Shyam");
		
		System.out.println(ll);
		//add last
		ll.addLast("Dayal");
		System.out.println(ll);
		//get
		
		System.out.println(ll.get(0));
		//set
		ll.set(1, "Father");
		System.out.println(ll);
		
		//Remove first and last by index
		
		ll.remove(3);
		System.out.println(ll);
		
		//Remove first and last by index
				ll.removeFirst();
				ll.removeLast();
				System.out.println(ll);
				
			//for loop
				for(int i =0;i<ll.size();i++)
					System.out.println(ll.get(i));
			//advanced for loop
				for(String str:ll)
					System.out.println(str);
			//Iterator
				Iterator<String> it=ll.iterator();
				while(it.hasNext())
					System.out.println(it.next());
				//while loop
				int n=0;
				while(ll.size()==n)
				{
					System.out.println(ll.get(n));
					n++;
				}
	}

}
