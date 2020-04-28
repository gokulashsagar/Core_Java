
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuePractice {

	public  class numberCompareAsc implements Comparator<Integer>{

		@Override
		public int compare(Integer arg0, Integer arg1) {
			if(arg0>arg1)
				return 1;
			else
				return -1;
		}
		
	}
	public static void main (String args[]){
		   ArrayBlockingQueue<Integer> q = new 
	                 ArrayBlockingQueue<Integer>(2); 
		   System.out.println(q.peek());
		q.add(10);
		q.add(20);
		try{
		q.add(30);
		}
		catch(Exception e){ 
			System.out.println("Since Queue size is 2, 3 cannot be "
					+ "added and exception is thrown. using "
					+ "offer() method for the same will return false");
		}
		System.out.println(q.offer(30));
		System.out.println(".."+q.remove());
		QueuePractice qk= new QueuePractice();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(qk.new numberCompareAsc());
		
		pq.add(8);
		pq.add(15);
		pq.add(11); 
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());	
		
		LinkedList<String> l = new LinkedList<String>();
		
	}
}
