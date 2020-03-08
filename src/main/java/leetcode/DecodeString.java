package leetcode;

import java.util.Stack;

public class DecodeString {

	public static String decodeString(String s) {

		if(s.length()==0) {
			return s;
		}

		Stack<Character> stack = new Stack<>();
		StringBuilder result = new StringBuilder();

		for(int i = 0 ; i < s.length() ; i++) {
			stack.push(s.charAt(i));

			if(stack.peek()==']') {
				stack.pop(); //remove ]

				//get all chars
				StringBuilder stringBuilder = new StringBuilder();
				while(!stack.isEmpty() && Character.isAlphabetic(stack.peek())) {
					stringBuilder.insert(0,stack.pop());
				}

				//remove [
				stack.pop();

				//get int
				StringBuilder stringBuilderInt = new StringBuilder();
				while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
					stringBuilderInt.insert(0,stack.pop());
				}

				int val = Integer.valueOf(stringBuilderInt.toString());

				//multiply int * chars
				String string = stringBuilder.toString();
				for(int j = 1 ; j < val ; j++) {
					stringBuilder.append(string);
				}

				//condition to insert back or not
				if(!stack.isEmpty()) {
					for(char c: stringBuilder.toString().toCharArray()) {
						stack.push(c);
					}
				} else {
					result.append(stringBuilder);
				}
			}
		}

		//get remaining chars
		StringBuilder remainingCharacters = new StringBuilder();
		while(!stack.isEmpty()) {
			remainingCharacters.append(stack.pop());
		}

		return result.append(remainingCharacters.reverse()).toString();
	}

	public static void main(String[] args) {
		System.out.println(decodeString("3[a]2[bc]"));
	}
}
