package com.adityasatalkar.data_structure_algorithms;

public class BubbleSort {

	public static int[] bubbleSort(int[] array) {
		boolean isSorted = false;
		int unSortedLast = array.length-1;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < unSortedLast; i++) {
				if (array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					isSorted = false;
				}
			}
			unSortedLast--;
		}
		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[] array = {3,9,6,5,4,1,2};
		System.out.println("Unsorted Array: ");
		printArray(array);
		System.out.println("Sorted Array: ");
		printArray(bubbleSort(array));
	}
}
