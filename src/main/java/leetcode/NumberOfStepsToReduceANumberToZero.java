package leetcode;

public class NumberOfStepsToReduceANumberToZero {

	public static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		}
		return false;
	}

	public static int numberOfSteps (int num) {
		int count = 0;
		while (num != 0) {
			if (isEven(num)) {
				num = num / 2;
			}
			else {
				num -= 1;
			}
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(numberOfSteps(14));
	}
}
