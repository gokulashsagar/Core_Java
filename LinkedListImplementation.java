

public class LinkedListImplementation {
  Node head ;
  
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
  public Node getList(){
	  return head;
  }
  public void delete(int value){
	  Node n =head;
	  Node prev=null;
	  while(n.data!=value){
		  prev=n;
		  n=n.next;
	  }
	  if(prev!=null){
		  System.out.println("in if");
	  prev.next=n.next;
	  }
	  else{
		  System.out.println("in else");
		  head=head.next;
	  }
	  
  }
  public void printList(Node n){
	  while(n.next!=null){
		  System.out.println(n.data);
		  n=n.next;
	  }
	  System.out.println(n.data);
  }
  public static void main(String args[]){
	  LinkedListImplementation l  =new LinkedListImplementation();
	  l.insert(10);
	  l.insert(20);
	  l.insert(30);
	  l.printList(l.getList());
	  l.delete(30);	
      l.printList(l.getList());
  }
}
