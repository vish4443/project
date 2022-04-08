package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet hs= new HashSet<>();
		
		hs.add("pune");
		hs.add(null);
		hs.add(100);
		hs.add(null);//only one null value accepted
		hs.add('A');
		hs.add(100);//duplicate not allowed
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(100));
		System.out.println(hs);
		//System.out.println(hs.remove('A'));
		System.out.println(hs);
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())		
		{
			System.out.println(it.next());
		}
		
		for(Object o:hs)
		{
			System.out.println(o);
		}
		//hs.clear();
		//System.out.println(hs);
		//System.out.println(hs.isEmpty());

	}

}
