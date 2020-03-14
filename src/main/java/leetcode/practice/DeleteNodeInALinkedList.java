package leetcode.practice;

public class DeleteNodeInALinkedList {

	public class ListNode {

		int val;
		ListNode next;

		ListNode(int value) {
			this.val = value;
			this.next = null;
		}
	}

	public void deleteNode(ListNode node) {
		if (node != null && node.next != null) {
			ListNode nextNode = node.next;
			node.val = nextNode.val;
			node.next = nextNode.next;
		}
	}
}
