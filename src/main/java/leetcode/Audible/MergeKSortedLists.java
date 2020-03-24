package leetcode.Audible;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeKSortedLists {

	public class ListNode {

		int val;
		ListNode next;

		ListNode(int value) {
			this.val = value;
			this.next = null;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length == 0)
			return null;

		List<Integer> listOfIntegers = new ArrayList<>();
		for (int i = 0; i < lists.length; i++) {
			ListNode head = lists[i];
			while (head != null) {
				listOfIntegers.add(head.val);
				head = head.next;
			}
		}

		Collections.sort(listOfIntegers);

		ListNode head = new ListNode(0);
		ListNode node1 = head;
		for (int i = 0; i < listOfIntegers.size(); i++) {
			ListNode node = new ListNode(listOfIntegers.get(i));
			head.next = node;
			head = head.next;
		}
		return node1.next;
	}
}
