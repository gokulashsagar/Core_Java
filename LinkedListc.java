import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

interface A1{
}
interface A2{	 
}
class B implements A1{	
}
class C implements A1,A2{	
}


public class LinkedListc { 
	
	public static void main(String[] args) {
		Stack<Integer> stc = new Stack<>();
		List<Integer> adq = new LinkedList<>();
		stc.add(10);
		stc.add(20);
		stc.add(30);  
		stc.add(40);
		System.out.println(stc.peek());
		System.out.println(stc.pop());
		System.out.println(stc);
		adq.add(10); 
		adq.add(20);
		adq.add(30);
		adq.add(40);
		adq.remove(Integer.valueOf(40));
		System.out.println(adq);
	}
	public void submain(){
		A1 a = new B();
		A1 b = new C();
		List list = new ArrayList ();
		List<String> lis2 = new LinkedList<String>();
		List<String> lis = new LinkedList<String>();
		LinkedList ll = new LinkedList();
		ArrayList<String>  gt= null;
		/*Stacks don't seem to be really useful to me as all their functions are easily available in ArrayList and LinkedList*/
		Stack<Integer> stc = new Stack<>();
		stc.add(10);
		stc.add(20);
		stc.add(30);
		System.out.println(stc);
		System.out.println(stc.pop());
		System.out.println(stc);
		stc.add(40);
		stc.push(60);
		stc.add(90);
		System.out.println(stc);
	}
}
