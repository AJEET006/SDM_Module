package POG_LLHasACycle;


public class Node {
	 int data;
	 Node next;
    
	
	
  public Node()
  {
	  this.data = 0;
	 this.next = null;
  }
  
  public Node (int data)
  {
	  this.data = data;
	  this.next = null;
  }
  
  public Node (Node next)
  {
	  this.data = 0;
	  this.next = next;
  }
  
  public Node (int data,Node next)
  {
	  this.data = data;
	  this.next = next;
  }
  
}
