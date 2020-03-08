package leetcode.Audible;

import java.util.*;

public class MissingNumberInArithmeticProgression {

	public static int missingNumber(int[] arr) {
		Arrays.sort(arr);
		int difference = (arr[arr.length-1]-arr[0])/arr.length;
		int missing = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i-1] != difference) {
				missing = arr[i] - difference;
			}
		}
		return missing;
	}

	public static void main(String[] args) {
		int[] arr1 = {5,7,11,13};
		int[] arr2 = {15,13,12};
		int[] arr3 = {100,300,400};

		System.out.println(missingNumber(arr1));
		System.out.println(missingNumber(arr2));
		System.out.println(missingNumber(arr3));
	}
}
