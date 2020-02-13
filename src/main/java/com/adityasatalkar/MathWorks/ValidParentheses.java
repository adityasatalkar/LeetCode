package com.adityasatalkar.MathWorks;

import java.util.Stack;

public class ValidParentheses {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);

			if (current == '(' || current == '{' || current == '[' ) {
				stack.push(current);
			}
			else {
				if (stack.isEmpty()) {
					return false;
				}
				else {
					char charFromStack = stack.pop();
					if ((charFromStack == '(' && current != ')') ||
						(charFromStack == '{' && current != '}') ||
						(charFromStack == '[' && current != ']')) {
						return false;
					}
				}
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String[] bracketsArray = {"()", "()[]{}", "(]", "([)]"};
		for (int i = 0; i < bracketsArray.length; i++) {
			System.out.println(isValid(bracketsArray[i]));
		}
	}
}
