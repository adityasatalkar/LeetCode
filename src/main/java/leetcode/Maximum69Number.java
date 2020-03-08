package leetcode;

public class Maximum69Number {

	public static int maximum69Number (int num) {
		String number = String.valueOf(num);
		if (!number.contains("6")) {
			return num;
		}

		char[] charArray = number.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '6') {
				charArray[i] = '9';
				return Integer.parseInt(new String(charArray));
			}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(maximum69Number(9669));
		System.out.println(maximum69Number(9996));
		System.out.println(maximum69Number(9999));
	}
}
