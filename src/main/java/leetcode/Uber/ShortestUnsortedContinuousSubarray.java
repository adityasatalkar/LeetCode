package leetcode.Uber;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {

	public static int findUnsortedSubarray(int[] nums) {
		int[] array = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			array[i] = nums[i];
		}
		Arrays.sort(array);
		int end = 0;
		int start = nums.length;
		for(int i = 0; i < nums.length; i++) {
			if(array[i] != nums[i]) {
				start = Math.min(start, i);
				end = Math.max(end, i);
			}
		}
		if (end-start > 0) {
			return end-start+1;
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int[] array = {2, 6, 4, 8, 10, 9, 15};
		System.out.println(findUnsortedSubarray(array));
	}
}
