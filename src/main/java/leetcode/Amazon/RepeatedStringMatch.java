package leetcode.Amazon;

public class RepeatedStringMatch {

	public static int repeatedStringMatch(String A, String B) {
		int i = 1;

		StringBuilder stringBuilder = new StringBuilder(A);

		for (; stringBuilder.length() < B.length(); i++) {
			stringBuilder.append(A);
		}

		if (stringBuilder.indexOf(B) >= 0) {
			return i;
		}

		if (stringBuilder.append(A).indexOf(B) >= 0) {
			return i + 1;
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println(repeatedStringMatch("abcd","cdabcdab"));
		System.out.println(repeatedStringMatch("aa","a"));
	}
}
