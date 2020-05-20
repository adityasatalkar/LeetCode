package leetcode.Apple;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	public static int numJewelsInStones(String J, String S) {
		int count = 0;
		Set<Character> hashSet = new HashSet<>();
		for(char jewel: J.toCharArray()) {
			hashSet.add(jewel);
		}

		for(char stone: S.toCharArray()) {
			if(hashSet.contains(stone)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String J = "aA", S = "aAAbbbb";
		System.out.println(numJewelsInStones(J,S));
	}
}
