package leetcode.FAANG;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

	public static HashMap<Character,Integer> populateHashMap(String s) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (hashMap.containsKey(current)) {
				int count = hashMap.get(current);
				count++;
				hashMap.put(current,count);
			}
			else {
				hashMap.put(current,1);
			}
		}
		return hashMap;
	}

	public static int firstUniqChar(String s) {
		HashMap<Character,Integer> hashMap = populateHashMap(s);

		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (hashMap.containsKey(current)) {
				int count = hashMap.get(current);
				if (count == 1) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String[] s = {"leetcode", "loveleetcode"};
		for (int i = 0; i < s.length; i++) {
			System.out.println(firstUniqChar(s[i]));
		}
	}
}
