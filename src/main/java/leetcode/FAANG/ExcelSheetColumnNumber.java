package leetcode.FAANG;

import java.util.HashMap;

public class ExcelSheetColumnNumber {

	public static int titleToNumberMethod1(String s) {
		HashMap<String,Integer> hashMap = new HashMap<>();

		String output = "";
		int i = 1;
		for(char alphabet = 'A'; alphabet <='Z'; alphabet++) {
			output = String.valueOf(alphabet);
			hashMap.put(output, i++);
		}

		for(char alphabet = 'A'; alphabet <='Z'; alphabet++) {
			for(char innerAlphabet = 'A'; innerAlphabet <='Z'; innerAlphabet++) {
				output = alphabet + "" + innerAlphabet;
				hashMap.put(output, i++);
			}
		}
		return hashMap.get(s);
	}

	public static int titleToNumberMethod2(String s) {
		int result = 0;
		int n = s.length();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int a = (ch - 'A') + 1;
			result += Math.pow(26, n - 1) * a;
			n--;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(titleToNumberMethod1("ZY"));
		System.out.println(titleToNumberMethod2("AAA"));
	}
}
