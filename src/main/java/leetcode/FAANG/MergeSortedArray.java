package leetcode.FAANG;

import static leetcode.FAANG.RotateArray.printArray;

public class MergeSortedArray {

	public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		int i = 0, j = 0, k = 0;

		// Traverse both array
		while (i < n1 && j < n2) {
			// Check if current element of first
			// array is smaller than current element
			// of second array. If yes, store first
			// array element and increment first array
			// index. Otherwise do same with second array
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			}
			else {
				arr3[k++] = arr2[j++];
			}
		}

		// Store remaining elements of first array
		while (i < n1) {
			arr3[k++] = arr1[i++];
		}

		// Store remaining elements of second array
		while (j < n2) {
			arr3[k++] = arr2[j++];
		}

		printArray(arr3);
	}

	public static void main(String[] args) {
		int[] array1 = {1,2,3};
		int[] array2 = {2,5,6};

		mergeArrays(array1, array2, array1.length, array2.length, new int[array1.length + array2.length]);
	}
}
