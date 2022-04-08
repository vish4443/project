package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		Vector v=new Vector<>();
		
		v.add(null);
		v.add(12);
		v.add('B');
		v.add("Pune");
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.get(3));
		System.out.println(v.size());
		System.out.println(v.capacity());//default capacity 10
		System.out.println(v.isEmpty());
		System.out.println(v.contains('B'));
		System.out.println(v.contains('A'));
		
		//System.out.println(v.indexOf("pune"));//index out of bound -1  
		System.out.println(v.indexOf("Pune"));
		v.add(1, "akshay");
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		
		for(Object a:v)//using for each loop
		{
			System.out.println(a);
		}
		System.out.println("========================");
		
		Iterator it = v.iterator();//universal iterator
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=================");
		
		ListIterator l = v.listIterator();
		//listIterator--> Applicable for all classes implements list interface
		
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println("====================");
		
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	

	}

}
