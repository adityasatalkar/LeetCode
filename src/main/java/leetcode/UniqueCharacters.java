package leetcode;

import java.util.HashSet;

public class UniqueCharacters {

	public boolean uniqueCharacters(String message) {
		HashSet<Character> hashSet = new HashSet<>();
		for (int i = 0; i < message.length(); i++) {
			Character currentChar = message.charAt(i);
			if (hashSet.contains(currentChar)) {
				return false;
			}
			else {
				hashSet.add(currentChar);
			}
		}
		return true;
	}

	public static void main(String[] args) {

	}
}
