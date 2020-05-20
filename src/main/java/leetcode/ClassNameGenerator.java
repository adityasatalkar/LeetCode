package leetcode;

public class ClassNameGenerator {

	public static String generateName(String inputString) {
		String[] stringArray = inputString.split(" ");
		String result = "";
		for (int i = 0; i < stringArray.length; i++) {
			int lenghtOfWord = stringArray[i].length();
			char[] charArray = stringArray[i].toCharArray();
			String temp = "";
			for (int j = 0; j < lenghtOfWord; j++) {
				if (j == 0 && Character.isLowerCase(charArray[0])) {
					temp = temp + Character.toUpperCase(charArray[0]);
				} else {
					temp = temp + charArray[j];
				}
			}
			stringArray[i] = temp;
			result += stringArray[i];
		}
		return result;
	}

	public static void main(String[] args) {
		String inputString = "First Unique Number";
		System.out.println(generateName(inputString));
	}
}
