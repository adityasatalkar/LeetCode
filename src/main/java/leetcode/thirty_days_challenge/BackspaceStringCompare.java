package leetcode.thirty_days_challenge;

import java.util.Stack;

public class BackspaceStringCompare {

	public static String compute(String inputString) {
		Stack<Character> stack = new Stack<>();
		char[] charArray = inputString.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char current = charArray[i];
			if (current != '#') {
				stack.push(current);
			}
			else if (current == '#') {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			}
		}
		System.out.println(stack);
		return stack.toString();
	}

	public static boolean backspaceCompare(String S, String T) {
		String a = compute(S);
		String b = compute(T);

		if (a.equalsIgnoreCase(b)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		String S1 = "ab#c", T1 = "ad#c";
		System.out.println(backspaceCompare(S1,T1));

		String S2 = "ab##", T2 = "c#d#";
		System.out.println(backspaceCompare(S2,T2));

		String S3 = "a##c", T3 = "#a#c";
		System.out.println(backspaceCompare(S3,T3));

		String S4 = "a#c", T4 = "b";
		System.out.println(backspaceCompare(S4,T4));

		String S5 ="aaa###a", T5 = "aaaa###a";
		System.out.println(backspaceCompare(S5,T5));

		String S6 = "bxj##tw", T6 = "bxj###tw";
		System.out.println(backspaceCompare(S6,T6));
	}
}
