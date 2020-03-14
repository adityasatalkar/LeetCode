package leetcode.Amazon;

import static leetcode.practice.MoveZeros.printArray;

public class ReplaceElementsWithGreatestElementOnRightSide {

	public static int[] replaceElements(int[] arr) {
		if(arr.length == 0) {
			return arr;
		}

		if(arr.length == 1) {
			arr[0] = -1;
			return arr;
		}

		int greatest = -1, element;
		for (int i=arr.length - 1; i >= 0; i--) {
			element = arr[i];
			arr[i] = greatest;
			greatest = greatest > element ? greatest : element;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {17,18,5,4,6,1};
		printArray(replaceElements(arr));
	}
}
