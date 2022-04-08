package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_study {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet();//we can stored only homogeniuos data(only String or integer or Charector)
		
		ts.add(2);
		ts.add(4);
		ts.add(2);//duplicate not allowed
		ts.add(3);
		//ts.add(null);//null value not accepted it show nullpointerexception
        ts.add(1);
        
        System.out.println(ts);//order of insertion maintained ---> Asending order
        
//        TreeSet t=new TreeSet<>();
//        t.add("hi");
//        t.add(1);
//        System.out.println(t);  //classcastexception shows bcz its only allow homogenious data
        
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }

        System.out.println("=================");
        for(Integer i:ts)
        {
        	System.out.println(i);
        }
        
        System.out.println("=================");
        
        System.out.println(ts.size());
        System.out.println(ts.isEmpty());
        System.out.println(ts.pollFirst());//remove lowest value and that value will return in console
        System.out.println(ts);
        System.out.println(ts.pollLast()); //remove last/highest value and that value will return in console
        System.out.println(ts);
        
        
        
        
        
        
        
	}

}
