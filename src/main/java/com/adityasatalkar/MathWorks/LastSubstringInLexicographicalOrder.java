package com.adityasatalkar.MathWorks;

public class LastSubstringInLexicographicalOrder {

	public static String lastSubstring(String s) {
		String max = "";
		for(int i = 0 ; i < s.length(); i++) {
			if (max.compareTo(s.substring(i)) <= 0) {
				max = s.substring(i);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(lastSubstring("abab"));
	}
}
