package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList lin= new LinkedList();
		lin.add(12);
		lin.add(null);
		lin.add('A');
		lin.add("Akshay");
		lin.add('A');
		
		System.out.println(lin);
		
		System.out.println(lin.size());
		System.out.println(lin.indexOf('A'));
		System.out.println(lin.lastIndexOf('A'));
		
		lin.add(4, null);
		System.out.println(lin);

		System.out.println("-----print info in linkdlist using iterator cursor------");

		Iterator ak = lin.iterator();
		while(ak.hasNext())
		{
			System.out.println(ak.next());
		}
		

		System.out.println("-----print info in linkdlist using Listiterator cursor------");

		ListIterator listit = lin.listIterator();
		while(listit.hasNext())
		{
			System.out.println(listit.next());
		}
		
		System.out.println("-----print info in linkdlist using for loop------");	
		
		for(int i=0;i<=lin.size()-1;i++)
		{
			System.out.println(lin.get(i));
		}
		
		
	}

}
