package leetcode.practice;

import java.util.HashMap;
import java.util.Random;

public class IntegerToEnglishWords {

	static HashMap<Integer,String> units = new HashMap<>();
	static HashMap<Integer,String> tens = new HashMap<>();
	static HashMap<Integer,String> teens = new HashMap<>();

	public static void populateHashMaps() {
		String[] unitsString = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		String[] tensString = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		String[] teensString = {"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

		for (int i = 0; i < 10; i++) {
			units.put(i,unitsString[i]);
			teens.put(i+10,teensString[0]);
		}

		int j = 0;
		for (int i = 10; i < 100; i = i+10) {
			tens.put(i,tensString[j++]);
		}

		int x= 0;
		for (int i = 11; i < 20; i++) {
			teens.put(i,teensString[x++]);
		}
	}

	public static String zeroToNinetyNine(int num) {
		String result = "";
		String numberString = String.valueOf(num);
		int length = numberString.length();
		if (length == 1) {
			result = units.get(num);
		}

		if (length == 2) {
			if (numberString.charAt(0) == '1' && numberString.charAt(1) != '0') {
				return teens.get(num);
			}
			if (numberString.charAt(1) != '0') {
				Integer tensInt = Integer.parseInt(String.valueOf(numberString.charAt(0)));
				Integer unitsInt = Integer.parseInt(String.valueOf(numberString.charAt(1)));
				result = tens.get(tensInt*10) + units.get(unitsInt);
			}
			if (numberString.charAt(1) == '0') {
				Integer tensInt = Integer.parseInt(String.valueOf(numberString.charAt(0)));
				result = tens.get(tensInt*10);
			}
		}
		return result;
	}

	public static String getHundreds(int num) {
		String result = "";
		String numberString = String.valueOf(num);
		int length = numberString.length();

		if (numberString.charAt(1) == '0' && numberString.charAt(2) == '0') {
			result = units.get(num) + " Hundred ";
		}

		return result;
	}

	public static String numberToWords(int num) {
		String result = "";
		String numberString = String.valueOf(num);
		int length = numberString.length();

		if (length <= 2) {
			result = zeroToNinetyNine(num);
		}

		if (length == 3) {

		}
		return result;
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public static void main(String[] args) {
		populateHashMaps();
		int[] numbers = {0,1,2,3,4,5,6,7,8,9};

		for (int i = 0; i < 100; i++) {
			//int j = getRandomNumberInRange(0,99);
			System.out.println(i + "\t" + numberToWords(i));
		}
	}
}
