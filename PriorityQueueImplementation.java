import java.util.Comparator;

public class PriorityQueueImplementation implements Comparator<Integer> {	
	/*This queue is capable of holding record less than 8000000*/
	Node head;
	
	@Override
	public int compare(Integer arg0, Integer arg1) {
		if(arg0>arg1)
			return 1;
		else if(arg1>arg0)
			return -1;
		else 
			return 0;
	}

	public void insert(int value){
		Node node = new Node();
		node.data=value;
		if(head==null){
			head=node;
		}
		else{
			Node n = head;
			while(n.next!=null){			
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public Integer getPoll(){
		Node n = head;
		Integer record=8000000;
		int count=0;
		int temp=0;
		while(n.next!=null){
			count++;
		 if(new PriorityQueueImplementation().compare(n.data,n.next.data)==1){
			 temp=n.next.data;
			 if(record>temp)
				 record=temp;
		 }
		 else  if(new PriorityQueueImplementation().compare(n.data,n.next.data)==-1){
			 temp=n.data;
			 if(record>temp)
				 record=temp;
		 }
			n=n.next;
		}
		Node nb = head; 
		Node prev=null;
		if(count==0) record=head.data;
		while(nb.data!=record){
			prev=nb;
			nb=nb.next;
		}	
		if(prev==null){		
			head=nb.next;
		}
		else{
			prev.next=nb.next;
		}		
		return record;
	}
	
	  public void printList(Node n){
		  while(n.next!=null){
			  n=n.next;
		  }
	  }
	  public Node getList(){
		  return head;
	  }
	
	public void delete(int value){
		
	}
	
	public static void main (String args[]){
		/*Comaparator has been created to produce least value as first priority*/
		PriorityQueueImplementation queue = new PriorityQueueImplementation();
		queue.insert(40);
		queue.insert(30);
		queue.insert(20);
		queue.insert(10);
		System.out.println("Poll:"+queue.getPoll());			
		System.out.println("Poll:"+queue.getPoll());		
		System.out.println("Poll:"+queue.getPoll());		
		System.out.println("Poll:"+queue.getPoll());	
	}


}
