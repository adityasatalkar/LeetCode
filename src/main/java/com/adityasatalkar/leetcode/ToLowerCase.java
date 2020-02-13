package com.adityasatalkar.leetcode;

public class ToLowerCase {

	public static String toLowerCase(String inputString) {
		String result = "";
		for (int i = 0; i < inputString.length(); i++) {
			char currentCharacter = inputString.charAt(i);

			if (currentCharacter >= 'A' && currentCharacter <= 'Z') {
				result += (char) (currentCharacter+32);
			} else {
				result += currentCharacter;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String hello = "HEllO";
		System.out.println(toLowerCase(hello));
	}
}
