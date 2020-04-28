import java.util.LinkedList;

public class QueueClass {
 
	int a;
	String b;	
	
	/*Overloading default constructor*/
	QueueClass(){
		
	}
	public static void main (String args[]){
		LinkedList<String> a = new LinkedList<>();
		a.add("A");
		a.add("C");
		LinkedList<String> b =a;
		b.remove("A");
		System.out.println(a);
		System.out.println(b);
	}
}
