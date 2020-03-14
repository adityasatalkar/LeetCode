package leetcode.practice;

import java.util.Arrays;

public class DailyTemperatures {

	public static int getIndexOfNextLargest(int[] array) {
		int biggerNumber = array[0];
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > biggerNumber) {
				return i;
			}
		}
		return result;
	}

	public static int[] dailyTemperatures(int[] T) {
		int[] result = new int[T.length];
		for (int i = 0; i < T.length; i++) {
			int[] array = Arrays.copyOfRange(T, i, T.length);
			result[i] = getIndexOfNextLargest(array);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] result = dailyTemperatures(T);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
