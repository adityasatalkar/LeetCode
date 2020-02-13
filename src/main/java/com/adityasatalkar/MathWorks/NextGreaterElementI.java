package com.adityasatalkar.MathWorks;

import java.util.HashMap;

import static com.adityasatalkar.leetcode.MoveZeros.printArray;

public class NextGreaterElementI {

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

		HashMap<Integer, Integer> hashMapNums2 = new HashMap<>();
		for (int i = 0; i < nums2.length; i++) {
			hashMapNums2.put(nums2[i],i);
		}

		int[] result = new int[nums1.length];

		for (int i = 0; i < nums1.length; i++) {

			int index = hashMapNums2.get(nums1[i])+1;
			boolean flag=true;
			while(flag && (index < nums2.length)) {
				if (nums2[index] > nums1[i]) {
					result[i] = nums2[index];
					flag = false;
				}
				index++;
			}
			if (flag) {
				result[i] = -1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		//int[] nums1 = {1,3,5,2,4};
		//int[] nums2 = {6,5,4,3,2,1,7};
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		int[] result = nextGreaterElement(nums1,nums2);

		printArray(result);
	}
}
