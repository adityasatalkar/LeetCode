package leetcode.Microsoft.OnlineAssessment;

public class CropWords {

	public static String cropWords(String inputString, int k) {
		String result = "";
		if (inputString.length() == 0 || inputString.isEmpty() || inputString == null) {
			return "";
		}

		String[] stringArray = inputString.split(" ");
		if (inputString.contains("-")) {
			stringArray = inputString.split("-");
		}
		int total = 0;
		int currentTotal = 0;
		for (int i = 0; i < stringArray.length; i++) {
			currentTotal = stringArray[i].length();
			if (total + currentTotal < k) {
				result += " " + stringArray[i];
				result = result.trim();
			}
			else if (total + currentTotal > k) {
				return result;
			}
			result.trim();
			total += result.length();
		}
		return result;
	}

	public static void main(String[] args) {
		String[] testCases = {"Codility Me test coders", "withOutSpaces", "", "Separated-by-hyphens", "              Codility Me test coders              "};
		int k = 14;
		for (String input: testCases) {
			System.out.println(cropWords(input,k));
		}
	}
}
