package leetcode.LinkedIn;

import java.util.Arrays;

public class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {

	public static int numOfSubarrays(int[] arr, int k, int threshold) {
		int result = 0;
		for (int i = 0; i <= arr.length - k; i++) {
			int[] subArray = Arrays.copyOfRange(arr,i,i + k);
			int sum = 0;
			for (int j = 0; j < k; j++) {
				sum += subArray[j];
			}
			if (sum / k >= threshold) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = {2,2,2,2,5,5,5,8};
		int k1 = 3, threshold1 = 4;

		int[] arr2 = {1,1,1,1,1};
		int k2 = 1, threshold2 = 0;

		int[] arr3 = {11,13,17,23,29,31,7,5,2,3};
		int k3 = 3, threshold3 = 5;

		int[] arr4 = {7,7,7,7,7,7,7};
		int k4 = 7, threshold4 = 7;

		int[] arr5 = {4,4,4,4};
		int k5 = 4, threshold5 = 1;

		System.out.println(numOfSubarrays(arr1, k1, threshold1));
		System.out.println(numOfSubarrays(arr2, k2, threshold2));
		System.out.println(numOfSubarrays(arr3, k3, threshold3));
		System.out.println(numOfSubarrays(arr4, k4, threshold4));
		System.out.println(numOfSubarrays(arr5, k5, threshold5));
	}
}
