package leetcode.Google;

import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram {

	public static String[] listToStringArray(List<String> list) {
		String[] stringArray = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			stringArray[i] = list.get(i);
		}
		return stringArray;
	}

	public static String[] findOcurrences(String text, String first, String second) {
		List<String> list = new ArrayList<>();
		if (!text.contains(first) || !text.contains(second)) {
			return null;
		}

		String[] stringArray = text.split(" ");
		for (int i = 0; i < stringArray.length-2; i++) {
			if (stringArray[i].equalsIgnoreCase(first) && stringArray[i+1].equalsIgnoreCase(second)) {
				list.add(stringArray[i+2]);
			}
		}
		return listToStringArray(list);
	}

	public static void main(String[] args) {
		String text = "alice is a good girl she is a good student a good", first = "a", second = "good";
		String[] result = findOcurrences(text,first,second);
		for (String word: result) {
			System.out.print(word + " ");
		}
	}
}
