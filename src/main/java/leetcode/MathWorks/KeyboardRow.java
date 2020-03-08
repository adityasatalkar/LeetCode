package leetcode.MathWorks;

import java.util.ArrayList;
import java.util.List;

import static leetcode.PrintArray.printArray;


public class KeyboardRow {

	public static boolean canWordBeConstructedFromOneRowOfKeyboard(String word, String row) {
		for(char currentCharacter: word.toCharArray()) {
			if(row.indexOf(currentCharacter) == -1) { //indicates character is not present in the row
				return false;
			}
		}
		return true;
	}

	public static String[] findWords(String[] words) {

		if(words == null || words.length == 0) {
			return new String[]{};
		}

		List<String> result = new ArrayList<>();

		String[] keyBoardRows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

		for (int i = 0; i < words.length; i++) {
			String current = words[i].toLowerCase();
			for(String currentRowOfKeyBoard: keyBoardRows) {
				if(currentRowOfKeyBoard.indexOf(current.charAt(0)) >= 0) {
					if (canWordBeConstructedFromOneRowOfKeyboard(current, currentRowOfKeyBoard)) {
						result.add(words[i]); //because current has converted all characters to lower case.
					}
				}
			}
		}
		String[] resultArray = result.toArray(new String[result.size()]);
		return resultArray;
	}

	public static void main(String[] args) {
		String[] inputArray1 = {"Hello", "Alaska", "Dad", "Peace"};
		//String[] inputArray2 = {};
		printArray(findWords(inputArray1));
	}
}
