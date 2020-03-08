package leetcode.Microsoft.OnlineAssessment;

public class MaxPossibleValue {

	public static int getPositiveLargestNumberByInserting5(int number) {
		String stringRepOfNumber = String.valueOf(number);
		String result = "";
		int index = 0;
		boolean check = false;
		for (int i = 0; i < stringRepOfNumber.length(); i++) {
			int current = Integer.parseInt(String.valueOf(stringRepOfNumber.charAt(i)));
			if (5 > current) {
				result += "5" + current;
				check = true;
				index = i;
				break;
			}
			else {
				result += stringRepOfNumber.charAt(i);
			}
		}

		if (check) {
			for (int i = index+1; i < stringRepOfNumber.length(); i++) {
				result += stringRepOfNumber.charAt(i);
			}
			return Integer.parseInt(result);
		}
		else {
			return Integer.parseInt(result + "5");
		}
	}

	public static int getNegativeLargestNumberByInserting5(int number) {
		String stringRepOfNumber = String.valueOf(number);
		String result = "";
		int index = 1;
		boolean check = false;
		for (int i = 1; i < stringRepOfNumber.length(); i++) {
			int current = Integer.parseInt(String.valueOf(stringRepOfNumber.charAt(i)));
			if (current > 5) {
				if (i == 1) {
					result += "-5" + current;
				}
				else {
					result += "5" + current;
				}
				check = true;
				index = i;
				break;
			}
			else {
				if (i == 1) {
					result += "-" + stringRepOfNumber.charAt(i);
				}
				else {
					result += stringRepOfNumber.charAt(i);
				}
			}
		}

		if (check) {
			for (int i = index+1; i < stringRepOfNumber.length(); i++) {
				result += stringRepOfNumber.charAt(i);
			}
			return Integer.parseInt(result);
		}
		else {
			return Integer.parseInt(result + "5");
		}
	}

	public static int solution(int number) {
		if (number > 0) {
			return getPositiveLargestNumberByInserting5(number);
		}
		else {
			return getNegativeLargestNumberByInserting5(number);
		}
	}

	public static void main(String[] args) {
		System.out.println(solution(945));
		System.out.println(solution(439));
		System.out.println(solution(-945));
		System.out.println(solution(-439));
	}
}
