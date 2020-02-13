//https://leetcode.com/problems/move-zeroes/

package com.adityasatalkar.leetcode;

public class MoveZeros {

	public static int[] zerosMoved(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0)
			{
				nums[index++] = nums[i];
			}
		}
		for(int i = index; i < nums.length; i++)
		{
			nums[i] = 0;
		}
		return nums;
	}

	public static void printArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] inputArray = {0,1,0,3,12};
		printArray(zerosMoved(inputArray));
	}
}
