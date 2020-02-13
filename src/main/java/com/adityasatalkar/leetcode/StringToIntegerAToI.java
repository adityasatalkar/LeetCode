package com.adityasatalkar.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToIntegerAToI {


	public static int myAtoi(String str) {
		String regex = "([-+]?\\d+)([\\s+-.\\da-zA-Z]*)";
		Pattern pattern = Pattern.compile(regex);

		str = str.trim();

		Matcher matcher = pattern.matcher(str);
		boolean match = matcher.matches();

		if(match) {

			String value = matcher.group(1);
			boolean isNegativeFlag = false;
			if(str.startsWith("-")) {
				isNegativeFlag = true;
			}

			try {
				int result = Integer.parseInt(value);
				return result;
			} catch (Exception e) {
				if(isNegativeFlag) {
					return Integer.MIN_VALUE;
				} else {
					return Integer.MAX_VALUE;
				}

			}
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		String[] inputArray = {"42", "   -42", "4193 with words", "words and 987", "-91283472332", "3.14159"};
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(myAtoi(inputArray[i]));
		}
	}
}
