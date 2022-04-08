package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_hashset {

	public static void main(String[] args) {
		
		LinkedHashSet lh= new LinkedHashSet();
		
		lh.add(100);
		lh.add(200);
		lh.add(null);
		lh.add("akki");
		lh.add(null);
		lh.add('B');
		
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.isEmpty());
		
		Iterator it = lh.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Object a:lh)
		{
			System.out.println(a);
		}
		
		
		
		
		
		

	}

}
