package leetcode.Microsoft.OnlineAssessment;

public class StringWithout3IdenticalConsecutiveLetters {

	public static String solution(String inputString) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(inputString.charAt(0));

		int count = 1;

		for (int i = 1; i < inputString.length(); i++) {

			char current = inputString.charAt(i);

			if (current == inputString.charAt(i-1)) {
				count++;
			}
			else {
				count = 1;
			}

			if (count < 3) {
				stringBuilder.append(current);
			}
		}
		return new String(stringBuilder);
	}

	public static void main(String[] args) {
		String s1 = "eedaaad";
		String s2 = "xxxtxxx";
		String s3 = "uuuuxaaaaxuuu";
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
	}
}