package collection;

import java.util.PriorityQueue;

public class Priority_queue_Study {

	public static void main(String[] args) {
		
		PriorityQueue pq= new PriorityQueue<>();
		
		pq.add(400);//use can use String data type also but only homogenious data
		pq.add(200);
		pq.add(300);
		pq.add(100);
		//pq.add("hi");//classcastexception
		
		System.out.println(pq);
		
		System.out.println(pq.element());//retrives head element but dont remove 
		System.out.println(pq);
		System.out.println(pq.poll());//retrive and remove the head element  of queue
		System.out.println(pq);
		System.out.println(pq.peek());//retrives head element but dont remove
		System.out.println(pq);
		
		

		System.out.println("remove method "+pq.remove());
		
		System.out.println(pq.removeAll(pq));
		//pq.poll();//remove 2nd value
		//pq.poll();//remove 3rd value
		System.out.println(pq);
		
		
	}

}
