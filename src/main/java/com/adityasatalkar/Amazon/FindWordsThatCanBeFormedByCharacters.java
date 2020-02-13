package com.adityasatalkar.Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindWordsThatCanBeFormedByCharacters {

	public static void populateHashMap(HashMap<Character,Integer> hashMap, char[] charArray) {

		for (char c : charArray) {
			if (hashMap.containsKey(c)) {
				int count = hashMap.get(c);
				hashMap.put(c, count++);
			} else {
				hashMap.put(c, 1);
			}
		}
	}

	public static boolean checkIfWordCanBeFormedFromChars(String word, String chars) {
		if (chars.length()<word.length()) {
			return false;
		}

		HashMap<Character, Integer> wordsHashMap = new HashMap<>();
		HashMap<Character, Integer> charsHashMap = new HashMap<>();
		char[] wordsCharArray = word.toCharArray();
		char[] charsCharArray = chars.toCharArray();
		Arrays.sort(wordsCharArray);
		Arrays.sort(charsCharArray);

		populateHashMap(wordsHashMap, wordsCharArray);
		populateHashMap(charsHashMap, charsCharArray);

		for (char c: wordsCharArray) {
			if (!charsHashMap.containsKey(c)) {
				return false;
			}
			int wordCurrentCharCount = wordsHashMap.get(c);
			int charCurrentCharCount = charsHashMap.get(c);

			if (wordCurrentCharCount != charCurrentCharCount) {
				return false;
			}
		}

		return true;
	}

	public static List<String> countCharacters(String[] words, String chars) {
		List<String> result = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (checkIfWordCanBeFormedFromChars(words[i],chars)) {
				count += words[i].length();
				result.add(words[i]);
			}
		}
		//return count;
		return result;
	}

	public static void printNumberOfTimesACharIsPresent(String chars) {
		HashMap<Character,Integer> hashMap = new HashMap<>();
		char[] charArray = chars.toCharArray();
		for (char c : charArray) {
			if (hashMap.containsKey(c)) {
				int count = hashMap.get(c);
				hashMap.put(c, ++count);
			} else {
				hashMap.put(c, 1);
			}
		}
		System.out.println(chars + " " + hashMap);
	}

	public static void main(String[] args) {
		String[] stringArray1 = {"cat","bt","hat","tree"};
		String charsForArray1 = "atach";
		System.out.println(countCharacters(stringArray1,charsForArray1));

		String[] stringArray2 = {"hello","world","leetcode"};
		String charsForArray2 = "welldonehoneyr";
		System.out.println(countCharacters(stringArray2,charsForArray2));


		String[] ridiculousArayByLeetCodeTestCase = {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
		String charsForRidiculousArray = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
		System.out.println(countCharacters(ridiculousArayByLeetCodeTestCase,charsForRidiculousArray));

		printNumberOfTimesACharIsPresent(charsForRidiculousArray);
		printNumberOfTimesACharIsPresent("boygirdlggnh");
		printNumberOfTimesACharIsPresent("lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo");
	}
}
