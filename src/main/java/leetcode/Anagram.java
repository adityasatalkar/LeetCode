// https://leetcode.com/problems/valid-anagram

package leetcode;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String s, String t) {

		char[] charArrayS = s.toCharArray();
		char[] charArrayT = t.toCharArray();

		Arrays.sort(charArrayS);
		Arrays.sort(charArrayT);

		String a = new String(charArrayS);
		System.out.println(a);

		String b = new String(charArrayT);
		System.out.println(b);

		if (a.equalsIgnoreCase(b)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		String s = "abc";
		String t = "bac";
		System.out.println(isAnagram(s,t));
	}
}
