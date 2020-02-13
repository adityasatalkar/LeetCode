package com.adityasatalkar.MathWorks;

// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}

public class ReverseLinkedList {

	public static ListNode reverseList(ListNode head) {
		ListNode previous = null;
		while (head != null) {
			ListNode tmp = head.next;
			head.next = previous;
			previous = head;
			head = tmp;
		}
		return previous;
	}

	public static void main(String[] args) {

	}
}
