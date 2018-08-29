package chen.practiceB;

public class AddTwoNumber {


	public static void main(String[] args){
		ListNode target1 = new ListNode();
		ListNode target2 = new ListNode();

		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(2);
		node2.next = node3 ;
		node1.next = node2 ;
		target1 = node1;
		target1.printListNode();
		System.out.println("%%%%%%%%%");
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(9);
		ListNode node7 = new ListNode(1);
		node6.next = node7 ;
		node5.next = node6 ;
		node4.next = node5 ;
		target2 = node4;
		target2.printListNode();
		System.out.println("&&& addTwoNumbers  @@@@");

//		ListNode resultNode = addTwoNumbers(target1, target2);
		ListNode resultNode = addTwoNumber(target1, target2);
		resultNode.printListNode();
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode curr = dummyHead;
		ListNode p = l1, q = l2;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null) p = p.next;
			if (q != null) q = q.next;
		}
		if (carry > 0) {
			System.out.println(" carry : " + carry);
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

	/**
	 * 算法

	 就像你在纸上计算两个数字的和那样，我们首先从最低有效位也就是列表 l1l1 和 l2l2 的表头开始相加。由于每位数字都应当处于 0 \ldots 90…9 的范围内，我们计算两个数字的和时可能会出现“溢出”。例如，5 + 7 = 125+7=12。在这种情况下，我们会将当前位的数值设置为 22，并将进位 carry = 1carry=1 带入下一次迭代。进位 carrycarry 必定是 00 或 11，这是因为两个数字相加（考虑到进位）可能出现的最大和为 9 + 9 + 1 = 199+9+1=19。
		 伪代码如下：
			 将当前结点初始化为返回列表的哑结点。
			 将进位 carrycarry 初始化为 00。
			 将 pp 和 qq 分别初始化为列表 l1l1 和 l2l2 的头部。
			 遍历列表 l1l1 和 l2l2 直至到达它们的尾端。
			 将 xx 设为结点 pp 的值。如果 pp 已经到达 l1l1 的末尾，则将其值设置为 00。
			 将 yy 设为结点 qq 的值。如果 qq 已经到达 l2l2 的末尾，则将其值设置为 00。
			 设定 sum = x + y + carrysum=x+y+carry。
			 更新进位的值，carry = sum / 10carry=sum/10。
			 创建一个数值为 (sum \bmod 10)(summod10) 的新结点，并将其设置为当前结点的下一个结点，然后将当前结点前进到下一个结点。
			 同时，将 pp 和 qq 前进到下一个结点。
			 检查 carry = 1carry=1 是否成立，如果成立，则向返回列表追加一个含有数字 11 的新结点。
			 返回哑结点的下一个结点。
			 请注意，我们使用哑结点来简化代码。如果没有哑结点，则必须编写额外的条件语句来初始化表头的值。
	 *
	 */

	public static ListNode addTwoNumber(ListNode l1 , ListNode l2){
		ListNode result = new ListNode(0);
		ListNode container = result;
		int weight = 0 ;
		while (l1 != null || l2 != null) {
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;
			int sum = weight + x + y ;
			weight = sum / 10 ;
			container.next = new ListNode(sum % 10);
			container = container.next;
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		if (weight > 0) {
			container.next = new ListNode(weight);
		}
		System.out.println(" result - begin");
		result.printListNode();
		System.out.println(" end  result  ");
		return result.next ;
	}


}
