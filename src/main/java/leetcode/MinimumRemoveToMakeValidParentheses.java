// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/

package leetcode;

public class MinimumRemoveToMakeValidParentheses {

	public static String minRemoveToMakeValid(String inputString) {

		StringBuilder result = new StringBuilder();
		int opening = 0;

		for (int i = 0; i < inputString.length(); i++) {

			char currentChar = inputString.charAt(i);

			if (currentChar == ')' && opening == 0) {
				continue;
			}
			if (currentChar == '(') {
				opening++;
			} else if (currentChar == ')') {
				opening--;
			}
			result.append(currentChar);
		}

		while(opening -- > 0) {
			result.deleteCharAt(result.lastIndexOf( "(" ) );
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String leetcode = "(l(e(e(t(c)o)de)";
		System.out.println(minRemoveToMakeValid(leetcode));
	}
}
