// https://leetcode.com/problems/single-row-keyboard/

package leetcode.practice;

public class SingleRowKeyboard {

	public static int calculateTime(String keyboard, String word) {
		int result = 0;
		int prevIndex = 0;
		for (int i = 0; i < word.length(); i++) {
			int currentIndex = keyboard.indexOf(word.charAt(i));
			if (result == 0) {
				result += currentIndex;
				prevIndex = currentIndex;
			}
			else {
				int distance = Math.abs(currentIndex - prevIndex);
				result += distance;
				prevIndex = currentIndex;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[] keyboard = {"abcdefghijklmnopqrstuvwxyz", "pqrstuvwxyzabcdefghijklmno"};
		String[] word = {"cba", "leetcode"};

		for (int i = 0; i < keyboard.length; i++) {
			System.out.println(calculateTime(keyboard[i],word[i]));
		}
	}
}
