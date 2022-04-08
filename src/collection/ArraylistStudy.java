package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistStudy {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		
		al.add("velocity");
		al.add('A');
		al.add(122.23);
		al.add('B');
		al.add('B');
		al.add(null);
		al.add("pune");
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.add("pune");
		al.add(0, "GOOD MORNING");
		System.out.println(al);
		//al.remove("GOOD MORNING");
		al.remove(0);
		System.out.println(al);
		
		System.out.println(al.contains('B'));
		System.out.println(al.contains('p'));
		
		System.out.println(al.isEmpty());
		System.out.println(al.get(7));
		
		System.out.println("===========Using for loop============");
		for(int i=0;i<=al.size()-1;i++)//when we use String then we use length & arraylist -->size
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("===========Using Iterator===========");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===========Using each loop===========");
		for(Object o:al)
		{
			System.out.println(o);
		}
		
		
		ArrayList<Integer> in=new ArrayList<>();
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(4);
		
		System.out.println(in);
		System.out.println(in.size());
		System.out.println("===================");
		for(int a:in)
		{
			System.out.println(a);
		}
		
		Iterator<Integer>int1=in.iterator();
		while(int1.hasNext())
		{
			System.out.println(int1.next());
		}
		
	
		
		

	}

}
