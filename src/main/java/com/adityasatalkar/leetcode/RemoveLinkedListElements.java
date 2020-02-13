package com.adityasatalkar.leetcode;

public class RemoveLinkedListElements {

	public class ListNode {

		int val;
		ListNode next;

		ListNode(int value) {
			this.val = value;
			this.next = null;
		}
	}


	public ListNode removeElements(ListNode head, int val) {
		ListNode currentNode = head;

		if (currentNode == null)
			return null;

		while (currentNode.next != null) {
			if (currentNode.next.val == val) {
				currentNode.next = currentNode.next.next;
			} else {
				currentNode = currentNode.next;
			}
		}
		if (head.val == val) {
			return head.next;
		}

		return head;
	}
}
