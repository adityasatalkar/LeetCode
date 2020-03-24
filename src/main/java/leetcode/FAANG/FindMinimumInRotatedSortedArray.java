package leetcode.FAANG;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray {

	public int findMin(int[] nums) {
		if(nums.length == 0) {
			return 0;
		}
		Arrays.sort(nums);
		return nums[0];
	}
}
