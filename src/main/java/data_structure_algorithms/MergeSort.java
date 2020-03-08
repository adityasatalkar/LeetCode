package data_structure_algorithms;

public class MergeSort {

	public static void mergeSort(int[] array) {
		int[] tempArray = new int[array.length];
		mergeSort(array, tempArray, 0, array.length-1);
	}

	public static void mergeSort(int[] array, int[] tempArray, int begin, int end) {
		if (begin >= end) {
			return;
		}
		int middle = (begin + end) / 2;
		mergeSort(array, tempArray, begin, middle);
		mergeSort(array, tempArray, middle+1, end);
		mergeHalves(array, tempArray, begin, end);
	}

	public static void mergeHalves(int[] array,int[] tempArray, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart) / 2;
		int rightStart = leftEnd + 1;

		int size = rightEnd - leftStart + 1;

		int leftIndex = leftStart;
		int rightIndex = rightStart;
		int index = leftStart;

		while (leftIndex <= leftStart && rightIndex <= rightStart) {
			if (array[leftIndex] <= array[rightIndex]) {
				tempArray[index] = array[leftIndex];
				leftIndex++;
			} else {
				tempArray[index] = array[rightIndex];
				index++;
				rightIndex++;
			}
			index++;
		}
		System.arraycopy(array, leftIndex, tempArray, index, leftEnd - leftIndex + 1);
		System.arraycopy(array, rightIndex, tempArray, index, rightEnd - rightIndex + 1);
		System.arraycopy(tempArray, leftStart, array, leftStart, size);
	}
}
