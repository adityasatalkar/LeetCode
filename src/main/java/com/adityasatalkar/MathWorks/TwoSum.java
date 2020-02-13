package com.adityasatalkar.MathWorks;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> hashMap = new HashMap();

		for (int i = 0; i < nums.length; i++) {
			int required = target - nums[i];
			if (hashMap.containsKey(required)) {
				result[0] = hashMap.get(required);
				result[1] = i;
			}
			else {
				hashMap.put(nums[i],i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] inputArray = {2, 7, 11, 15};
		int[] resultArray = twoSum(inputArray, 9);
		for (int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}
	}
}
