class RevLinked
{
 static Node head;
  
  
  static class Node {
 
   int data;
   Node next;
   
   Node(int d)
   
   {
   data = d;
   next= null;
   }
  }
 Node reverse(Node c,Node p){

  if(c.next == null){
  
    head=c;
	c.next=p;
	return null;
   }
    
  Node next1= c.next;
  c.next=p;
  reverse(next1,c);
  return head;
 }
 void printList(Node node){
  while(node != null)
  {
   System.out.println(node.data+"  ");
   node = node.next;
  
  }
 }
 
 public static void main(String [] args)
 {
    RevLinked ref= new RevLinked();
	ref.head=new Node(1);
	ref.head.next=new Node(2);
	ref.head.next.next=new Node(3);
	ref.head.next.next.next=new Node(4);
	ref.head.next.next.next.next=new Node(5);
	
	System.out.println("Original");
	ref.printList(head);
	Node res = ref.reverse(head,null);
	System.out.println("Reversed List");
	ref.printList(res);
	
 
 }
 
 
}