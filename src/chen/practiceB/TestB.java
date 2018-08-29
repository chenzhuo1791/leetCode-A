package chen.practiceB;

public class TestB {


	public static void main(String[] args){
		ListNode node1 = new ListNode(5);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(2);
		node2.next = node3 ;
		node1.next = node2 ;
		node1.printListNode();
		ListNode reverse = node1.reverseNode();
		if (reverse != null) {
			reverse.printListNode();
		}
	}

}
