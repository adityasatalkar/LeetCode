package leetcode.FAANG;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public static boolean wordBreak(String s, List<String> wordDict) {
		return word_Break(s, new HashSet(wordDict), 0);
	}

	public static boolean word_Break(String s, Set<String> wordDict, int start) {
		if (start == s.length()) {
			return true;
		}
		for (int end = start + 1; end <= s.length(); end++) {
			if (wordDict.contains(s.substring(start, end)) && word_Break(s, wordDict, end)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String s1 = "leetcode";
		String[] wordDict1 = {"leet", "code"};
		List<String> wordDictList = new ArrayList<>();
		for (int i = 0; i < wordDict1.length; i++) {
			wordDictList.add(wordDict1[i]);
		}
		System.out.println(wordBreak(s1, wordDictList));
	}
}
