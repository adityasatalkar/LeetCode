package leetcode.Microsoft.OnlineAssessment;

public class MinMovesToObtainStringWithout3IdenticalConsecutiveLetters {

	public static int getCount(String inputString) {
		int numberOfAs = 0;
		int numberOfBs = 0;
		int result = 0;
		for (int i = 0; i < inputString.length(); i++) {
			char currentChar = inputString.charAt(i);
			//boolean aMod3;
			if (currentChar == 'a') {
				numberOfBs = 0;
				numberOfAs += 1;
				if (numberOfAs % 3 == 0) {
					result += 1;
					numberOfAs = 0;
				}
			} else {
				numberOfAs = 0;
				numberOfBs += 1;
				if (numberOfBs%3 == 0) {
					result += 1;
					numberOfBs = 0;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[] stringArray = {"baaaaa", "baaabbaabbba", "baabab"};
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(getCount(stringArray[i]));
		}
	}
}
