package leetcode.Microsoft.OnlineAssessment;

import static leetcode.practice.MoveZeros.printArray;

public class FindNUniqueIntegersSumUpToZero {

	public static int[] sumZero(int n) {
		int[] result = new int[n];

		int iterator = 0;

		if(n % 2 != 0) {
			result[iterator++] = 0;
		}

		int start = 1;

		while(iterator < n) {
			result[iterator++] = start;
			result[iterator++] = -start;
			start++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] result = sumZero(5);
		printArray(result);
	}
}
