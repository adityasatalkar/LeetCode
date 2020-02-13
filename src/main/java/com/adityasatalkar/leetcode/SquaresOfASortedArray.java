package com.adityasatalkar.leetcode;

import java.util.Arrays;

import static com.adityasatalkar.leetcode.RemoveElement.printArray;

public class SquaresOfASortedArray {

	public static int[] sortedSquares(int[] A) {
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) Math.pow(A[i],2);
		}
		Arrays.sort(A);
		return A;
	}

	public static void main(String[] args) {
		int[] arrayOne = {-4,-1,0,3,10};
		int[] resultOne = sortedSquares(arrayOne);
		int[] arrayTwo = {-7,-3,2,3,11};
		int[] resultTwo = sortedSquares(arrayTwo);
		printArray(resultOne);
		printArray(resultTwo);
	}
}
