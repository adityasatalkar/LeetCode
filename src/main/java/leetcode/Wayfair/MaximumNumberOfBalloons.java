package leetcode.Wayfair;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;

public class MaximumNumberOfBalloons {

	public static HashMap<Character, Integer> populateHashMap(String inputString) {
		String balloon = "balloon";
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < inputString.length(); i++) {
			char currentChar = inputString.charAt(i);
			if (balloon.contains(String.valueOf(currentChar))) {
				if (hashMap.containsKey(currentChar)) {
					int count = hashMap.get(currentChar);
					count++;
					hashMap.put(currentChar,count);
				}
				else {
					hashMap.put(currentChar,1);
				}
			}
		}
		return hashMap;
	}

	public static Stack populateStack(char character, HashMap<Character, Integer> hashMap) {
		Stack<Character> stack = new Stack<>();
		if (hashMap.containsKey(character)) {
			for (int i = 0; i < hashMap.get(character); i++) {
				stack.push(character);
			}
		}
		return stack;
	}

	public static int maxNumberOfBalloons(String text) {
		HashMap<Character, Integer> hashMap = populateHashMap(text);
		int count = 0;

		if (hashMap.containsKey('b')) {
			Stack<Character> stackB = populateStack('b', hashMap);

			if (hashMap.containsKey('a')) {
				Stack<Character> stackA = populateStack('a', hashMap);

				if (hashMap.containsKey('l')) {
					Stack<Character> stackL = populateStack('l', hashMap);

					if (hashMap.containsKey('o')) {
						Stack<Character> stackO = populateStack('o', hashMap);

						if (hashMap.containsKey('n')) {
							Stack<Character> stackN = populateStack('n',hashMap);

							try {
								while (!stackB.isEmpty()) {
									stackB.pop();
									stackA.pop();
									stackL.pop();
									stackL.pop();
									stackO.pop();
									stackO.pop();
									stackN.pop();
									count++;
								}
							}
							catch (EmptyStackException e) {
								return count;
							}
						}
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// Expected output for s1 = 1
		String s1 = "nlaebolko";

		// Expected output for s2 = 2
		String s2 = "loonbalxballpoon";

		// Expected output for s3 = 0
		String s3 = "leetcode";

		// Expected output for s4 = 10
		String s4 = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";

		System.out.println(maxNumberOfBalloons(s1));
		System.out.println(maxNumberOfBalloons(s2));
		System.out.println(maxNumberOfBalloons(s3));
		System.out.println(maxNumberOfBalloons(s4));
	}
}
