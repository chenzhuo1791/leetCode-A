package chen.practiceB;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

	int val ;

	ListNode next ;

	public ListNode() {}
	public ListNode(int x){
		val = x ;
	}

	public void printListNode(){
		String value = "";
		if (this == null) {
			System.out.println("%% 无值 @@");
		} else {
			ListNode temp = this;
			while (temp != null) {
				value +=  temp.val ;
				temp = temp.next ;
			}
			if (value == "" || value == null) {
				System.out.println("$$$ 异常--无值 @@");
			} else {
				StringBuffer sb = new StringBuffer(value);
				Integer result = Integer.parseInt(sb.reverse().toString());
				System.out.println("## node : " + result);
			}
		}
	}

	public ListNode reverseNode(){
		List<ListNode> nodeList = new ArrayList<ListNode>();
		ListNode reverseNode = new ListNode(0);// 哑点设置
		ListNode present = reverseNode;
		ListNode current = this ;
		while (current != null) {
			ListNode tempNode = new ListNode(current.val);
			nodeList.add(tempNode);
			current = current.next;
		}
		if (nodeList.size() > 0) {
			for (int i = nodeList.size() - 1; i >= 0; i--) {
				present.next = nodeList.get(i);
				present = present.next ;
			}
		}
		return reverseNode.next;
	}

}
