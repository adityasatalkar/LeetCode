package leetcode.practice;

public class ValidPalindrome {

	public static boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}

		String alphaNumeric = "";
		for (char c : s.toCharArray()) {
			if (Character.isLetter(c) ||Character.isDigit(c))
				alphaNumeric += c;
		}

		String reversed = new String(new StringBuilder(alphaNumeric).reverse());

		if (alphaNumeric.equalsIgnoreCase(reversed)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		String[] stringArray = {"A man, a plan, a canal: Panama", "race a car"};
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(isPalindrome(stringArray[i]));
		}
	}
}
