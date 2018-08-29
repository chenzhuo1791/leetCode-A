package chen.practiceB;

public class PlusTwoNumber {

	/** AddTwoNumber--拓展，将倒序存储-->正序存储 **/
	/** 实现相同的相加结果 **/
	/** 思路一：使用倒序思想，再编写一个反置方法 **/
	/** 思路二：推翻原有思想，重新构思 **/
	public static void main(String[] args){
		ListNode target1 = new ListNode();
		ListNode target2 = new ListNode();

		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(2);
		node2.next = node3 ;
		node1.next = node2 ;
		System.out.println("%%%%%%%%%");
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(9);
		ListNode node7 = new ListNode(1);
		node6.next = node7 ;
		node5.next = node6 ;
		node4.next = node5 ;

		target1 = node1;
		target1 = target1.reverseNode();
		target1.printListNode();
		target2 = node4;
		target2 = target2.reverseNode();
		target2.printListNode();
		System.out.println("&&& addTwoNumbers  @@@@");

		ListNode resultNode = plusTwoNumber(target1, target2);
//		resultNode = resultNode.reverseNode();
		resultNode.printListNode();
	}

	/**特别注意：加和最后形成的结果就是最终结果，不需要再次颠倒顺序 **/

	public static ListNode plusTwoNumber(ListNode nodeA , ListNode nodeB){
		ListNode result = new ListNode(0); // 设置哑点
		ListNode current = result;
		int weight = 0 ;
		while (nodeA != null || nodeB != null) {
			int x = (nodeA != null) ? nodeA.val : 0;
			int y = (nodeB != null) ? nodeB.val : 0;
			int sum = weight + x + y ;
			current.next = new ListNode(sum % 10);
			current = current.next ;
			if (nodeA != null) nodeA = nodeA.next ;
			if (nodeB != null) nodeB = nodeB.next;
			weight = sum / 10 ;
		}
		if (weight > 0) { // 进位处理
			current.next = new ListNode(weight);
		}
		return result.next ;
	}

}
