package leetcode.Microsoft.OnlineAssessment;

import java.util.ArrayList;
import java.util.List;

public class ReformatTelephoneNumbers {

	public static String[] reformat(String[] phoneNumbers) {
		StringBuilder formattedNumbers = null;

		int i = 0;
		for (String number: phoneNumbers) {
			formattedNumbers = new StringBuilder();
			if (number.charAt(3) == '-') {
				formattedNumbers.append(number.substring(4,7))
					.append("-")
					.append(number.substring(0,3))
					.append("-")
					.append(number.substring(8,12));
			}
			else {
				formattedNumbers.append(number.substring(3,6))
						.append("-")
						.append(number.substring(0,3))
						.append("-")
						.append(number.substring(6,10));
			}
			phoneNumbers[i++] = new String(formattedNumbers);
		}
		return phoneNumbers;
	}

	public static void main(String[] args) {
		String[] inputStringArray = {"456-123-7890","4561237890"};
		String[] resultStringArray = reformat(inputStringArray);
		int i = 0;
		for (String number: resultStringArray) {
			System.out.println(number);
		}
	}
}