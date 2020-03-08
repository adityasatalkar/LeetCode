package leetcode;

public class DecryptStringFromAlphabetToIntegerMapping {

	public static String freqAlphabets(String inputString) {
		String result = "";
		int length = inputString.length();
		for(int i = 0; i < length; ) {
			if(i < length - 2 && inputString.charAt(i + 2) == '#') {
				int num = Integer.parseInt(inputString.substring(i, i + 2));
				result += (char)(num + 96);
				i = i + 3;
				continue;
			}
			result += (char)(97 + inputString.charAt(i) - '1');
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		String inputString1 = "10#11#12";
		String inputString2 = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
		System.out.println(freqAlphabets(inputString1));
		System.out.println(freqAlphabets(inputString2));
	}
}
