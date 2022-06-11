package POG_LLHasACycle;

public class Main {
	public static void main(String[] args) {

		DetectCycleList list = new DetectCycleList();
		list.Insert_last(5);
		list.Insert_last(78);
		list.Insert_last(69);
		list.Insert_last(45);
		list.Insert_last(50);
		list.Insert_last(1);
		list.Insert_last(30);
		list.Insert_last(50000);
		list.Insert_last(488);
		list.Insert_last(123);
		list.Insert_last(456);
		System.out.println(list);
		list.InsertCycle(78);

		//System.out.println(list);
		Node C = list.findCycle();
		
		System.out.println("Cycle found at node " + C.data);
		
		int l = list.lengthList(C);
		System.out.println("total length: "+l);
		Node temp = list.head;
		for (int i = 1; i < l; i++)
		{

			temp = temp.next;
			
		}temp.next=null;
			System.out.println("Cycle is removed....... ");
			System.out.println(list);
	}


}
