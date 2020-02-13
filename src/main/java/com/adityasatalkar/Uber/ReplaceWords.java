package com.adityasatalkar.Uber;

import java.util.ArrayList;
import java.util.List;

public class ReplaceWords {

	public static String formSentence(String[] stringArray) {
		String result = "";
		for (int i = 0; i < stringArray.length; i++) {
			if (i != stringArray.length) {
				result += stringArray[i] + " ";
			}
			else {
				result += stringArray[i];
			}
		}
		return result;
	}

	public static String replaceWords(List<String> dict, String sentence) {
		String[] sentenceArray = sentence.split(" ");
		String[] dictionaryArray = dict.toArray(new String[0]);
		for (int i = 0; i < sentenceArray.length; i++) {
			String currentWord = sentenceArray[i];
			for (int j = 0; j < dictionaryArray.length; j++) {
				String dictWord = dictionaryArray[j];
				if (currentWord.startsWith(dictWord)) {
					sentenceArray[i] = dictWord;
				}
			}
		}
		return formSentence(sentenceArray);
	}

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		String[] stringArray = {"cat", "bat", "rat"};
		for (int i = 0; i < stringArray.length; i++) {
			stringList.add(stringArray[i]);
		}
		String sentence = "the cattle was rattled by the battery";
		System.out.println(replaceWords(stringList, sentence));
	}
}
