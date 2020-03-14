package leetcode.practice;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		String string = String.valueOf(x);
		String reversed = new String(new StringBuilder(string).reverse());
		if (string.equals(reversed)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int[] a = {121, -121, 10};
		for (int i = 0; i < a.length; i++) {
			System.out.println(isPalindrome(a[i]));
		}
	}
}
