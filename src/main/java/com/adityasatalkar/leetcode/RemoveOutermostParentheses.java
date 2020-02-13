package com.adityasatalkar.leetcode;

public class RemoveOutermostParentheses {

	public static String removeOuterParentheses(String inputString) {
		String result = "";
		int stringLength = inputString.length();

		if (stringLength <= 2) {
			return inputString;
		}

		char[] charArray = inputString.toCharArray();

		for (int i = 0; i < stringLength-1; i++) {
			if (charArray[i] == '(' && charArray[i++] == '(') {
				result = result + "(";
				i = i+1;
				System.out.println("***********");
				System.out.println(result);
			}
			if (charArray[i] == ')' && charArray[i++] == ')') {
				result = result + ")";
				i = i+1;
				System.out.println("***********");
				System.out.println(result);
			}
			if (charArray[i] == '(' && charArray[i++] == ')') {
				result = result + "()";
				i = i+2;
			}
		}
		return result;
	}

	public static String removeOuterParentheses2(String S) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		char[] ch = S.toCharArray();
		int n=ch.length;
		for (int i = 0; i < n; i++) {
			if(ch[i]=='('&&count++>0){
				sb.append(ch[i]);
			}
			if (ch[i]==')'&&count-->1){
				sb.append(ch[i]);
			}

		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String inputString = "(()())(())";
		System.out.println(removeOuterParentheses(inputString));
		System.out.println(inputString);
		System.out.println(removeOuterParentheses2(inputString));
	}
}
