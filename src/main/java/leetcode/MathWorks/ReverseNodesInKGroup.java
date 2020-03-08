package leetcode.MathWorks;

public class ReverseNodesInKGroup {

	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode res = null;
		ListNode node = head;
		int length = 0;
		while (node.next != null) {
			length++;
		}

		if(length < k ) {
			return head;
		}

		node = head;
		ListNode previousSequenceLast = null;
		ListNode currentSequenceLast = null;

		for(; length >= k; length-= k) {

			currentSequenceLast = node;
			ListNode pre = null;

			// Reverting
			for (int j = 0; j < k; j++) {
				ListNode next = node.next;
				node.next = pre;
				pre = node;
				node = next;
			}

			// New head is the first element of the first reverted sequence
			if(res == null) {
				res = pre;
			}

			// If there is a previous reverted sequence attach it to the current one
			// Pre is the last element of the last reverted sequence
			if(previousSequenceLast != null) {
				previousSequenceLast.next = pre;
			}
			// Update
			previousSequenceLast = currentSequenceLast;
		}
		// Attaching the remaining nodes
		if(length>0) {
			previousSequenceLast.next = node;
		}

		return res;
	}

	public static void main(String[] args) {

	}
}
