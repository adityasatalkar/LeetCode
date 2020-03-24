package leetcode.AkunaCapital;

public class IncreasingDecreasingString {

	public static String sortString(String s) {
		StringBuilder res = new StringBuilder(s.length());
		int[] letterCount = new int[26];
		int sLength = s.length();

		// populate letter count array
		for(char c : s.toCharArray()) {
			letterCount[c - 'a']++;
		}

		while(sLength != 0) {

			// move forward and append characters to res
			for(int i=0; i<letterCount.length; i++) {

				if(letterCount[i] != 0) {
					char c = (char) ('a' + i);
					res.append(c);
					letterCount[i]--;
					sLength--;
				}
			}

			// move backwards and append characters to res
			for(int i=letterCount.length-1; i>=0; i--) {
				if(letterCount[i] != 0) {
					char c = (char) ('a' + i);
					res.append(c);
					letterCount[i]--;
					sLength--;
				}
			}
		}

		return res.toString();
	}

	public static void main(String[] args) {
		String[] stringArray = {"aaaabbbbcccc", "rat", "leetcode", "ggggggg", "spo"};
		for (String current: stringArray) {
			System.out.println(sortString(current));
		}
	}
}