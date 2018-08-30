package chen.practiceB;

public class DemoB {

	public static void main(String[] args){
		ListNode node1 = new ListNode(5);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(2);
//		node2.next = node3 ;
//		node1.next = node2 ;
//		node1.printListNode();
		node3.next = node2 ;
		node2.next = node1 ;
		node3.printListNode();
	}


}
