package com.adityasatalkar.leetcode;

public class RemoveVowelsFromAString {

	public static boolean isVowel(String character) {
		if( character.equalsIgnoreCase("a") ||
			character.equalsIgnoreCase("e") ||
			character.equalsIgnoreCase("i") ||
			character.equalsIgnoreCase("o") ||
			character.equalsIgnoreCase("u")) {
			return true;
		}
		return false;
	}

	public static String removeVowels(String S) {
		String result = "";
		for(int i = 0 ; i < S.length(); i++) {
			String character = String.valueOf(S.charAt(i));
			if(!isVowel(character)) {
				result += character;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(removeVowels("aeiouAEIOUYZyz"));
		System.out.println(removeVowels("leetcodeisacommunityforcoders"));
	}
}
