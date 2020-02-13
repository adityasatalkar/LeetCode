package com.adityasatalkar.leetcode;

import java.util.HashMap;

public class FindTheDuplicateNumber {

	public static int findDuplicate(int[] nums) {
		int result = 0;

		HashMap<Integer,Integer> hashMap = new HashMap();

		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(nums[i])) {
				return nums[i];
			} else {
				hashMap.put(nums[i],1);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] a = {1,3,4,2,2};
		int[] b = {3,1,3,4,2};

		System.out.println(findDuplicate(a));
		System.out.println(findDuplicate(b));
	}
}
