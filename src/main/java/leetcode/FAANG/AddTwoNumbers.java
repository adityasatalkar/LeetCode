package leetcode.FAANG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null) {
			return l2;
		}

		if(l2 == null) {
			return l1;
		}

		if(l1 == null && l2 == null) {
			return new ListNode(0);
		}

		ListNode head1 = l1;
		ListNode head2 = l2;

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		while(head1 != null) {
			list1.add(head1.val);
			head1 = head1.next;
		}
		Collections.reverse(list1);

		while(head2 != null) {
			list2.add(head2.val);
			head2 = head2.next;
		}
		Collections.reverse(list2);

		String number1 = "", number2 = "";
		for(Integer i: list1) {
			number1 += i;
		}

		for(Integer i: list2) {
			number2 += i;
		}

		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		int sum = num1 + num2;

		String sumString = new StringBuilder(String.valueOf(sum)).reverse().toString();
		//System.out.println(sumString);

		ListNode result = new ListNode(0);
		ListNode answer = result;
		for(int i = 0; i < sumString.length(); i++) {
			ListNode node = new ListNode(Integer.parseInt(String.valueOf(sumString.charAt(i))));
			result.next = node;
			result = result.next;
		}
		return answer.next;
	}
}
