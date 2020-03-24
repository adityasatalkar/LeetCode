// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

package leetcode.FAANG;

import java.util.HashMap;

public class TwoSum2InputArrayIsSorted {

	public static int[] twoSum2(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> hashMap = new HashMap();

		for (int i = 0; i < nums.length; i++) {
			int required = target - nums[i];
			if (hashMap.containsKey(required)) {
				result[0] = hashMap.get(required);
				result[1] = i+1;
			}
			else {
				hashMap.put(nums[i],i+1);
			}
		}
		return result;
	}
}
