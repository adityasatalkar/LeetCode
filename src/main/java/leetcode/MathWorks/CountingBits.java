package leetcode.MathWorks;

import static leetcode.practice.MoveZeros.printArray;

public class CountingBits {

	public static int[] countBits(int num) {
		int[] result = new int[num+1];
		for (int i = 0; i <= num; i++) {
			int count = 0;
			String stringBinaryRepresentation = Integer.toBinaryString(i);
			System.out.println(stringBinaryRepresentation);
			for (int j = 0; j < stringBinaryRepresentation.length(); j++) {
				if (stringBinaryRepresentation.charAt(j) == '1') {
					count++;
				}
			}
			result[i] = count;

		}
		return result;
	}

	public static void main(String[] args) {
		int input = 5;
		printArray(countBits(input));
	}
}
