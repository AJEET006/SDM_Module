package POG_LLHasACycle;
//POG Program Detect CYCLE
public class DetectCycleList
{
	 Node head;
	 public DetectCycleList()
	 {
		 Node head=null;
		 //Akshay
	 }
	
	public void Insert_last(int data)
	{
		Node new_node = new Node(data);
		if(head==null)
		{
			head = new_node;
			return;
		}
		Node it = head;
		while(it.next!=null)
		{
			it = it.next;
		}
		it.next = new_node;
		return;
	
	public void InsertCycle(int data)
	{
		Node psave = null, it = head, prev = null;
		if(head==null)
		{
			System.out.println("Empty LL");
			return;
		}
		
		while(it!=null)
		{
			prev = it;
			if(it.data==data)
			
				psave = it;
				
				it = it.next;
		}
		if(psave!=null)
			{
				prev.next = psave;
			}
		else
			System.out.println("cycle node is not found");
		
//		Node it = head;
//		while(it.next!=null)
//		{
//			it = it.next;
//			
//		}
//			it.next = head.next.next;
			
		
			
	}
	
	public Node findCycle()
	{
		Node slow,fast;
		slow = fast = head;
		if(head == null)
		{
			System.out.println("cycle is not detected");
			return null;
		}
		while((fast!=null) && (fast.next!=null))
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				return slow;
			}
		}return null;
	}
	
	public int lengthList(Node C)
	{
		Node it1,it2;
		
		int len_cycle = 0,len_rem = 0;
		it1 = it2 = C;
		do
		{
			len_cycle = len_cycle+1;
			it2 = it2.next;
		}
		while(it1 != it2);
		
		System.out.println("Cycle length= " +len_cycle);
		it1 = head;
		while(it1 != it2)
		{
			
			len_rem = len_rem+1;
			it1 = it1.next;
			it2 = it2.next;
		}
		System.out.println("Rem length= " +len_rem);
		return (len_rem+len_cycle);
	}
	
	
	public String toString() 
	{
		String str = "";
		if(head== null)
		{
			str = "LL is empty";
		}
		else
		{
			Node it = head;
			
			//while(it.next !=null) //this is without last node
	      while(it !=null) //with last node
			{
			str+= it.data+ ",";
			it=it.next;
			}
			
		}
		return str;
	}
	
	
}
