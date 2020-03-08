package leetcode.Microsoft;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAStringII {

	public static void reverseWordsBruteForceMethod(char[] s) {
		String sentence = new String();
		for (int i = 0; i < s.length; i++) {
			sentence += s[i];
		}
		List<String> list = Arrays.asList(sentence.split(" "));
		Collections.reverse(list);
		sentence = new String();
		for (int i = 0; i < list.size(); i++) {
			sentence += list.get(i) + " ";
		}
		sentence.trim();
		char[] charArray = sentence.toCharArray();
		for (int i = 0; i < s.length; i++) {
			s[i] = charArray[i];
			System.out.print(s[i]);
		}
	}

	public static void main(String[] args) {
		char[] charArray = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
		reverseWordsBruteForceMethod(charArray);
	}
}

/*
	public static void reverseWords(char[] s) {
		for (int i = 0, j = s.length-1; j != i; i++, j--) {
			char c = s[i];
			s[i] = s[j];
			s[j] = c;
		}
	}
 */