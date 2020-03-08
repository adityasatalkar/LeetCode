package leetcode.MathWorks;

import java.util.*;

public class ThreeSum {

	// using set to avoid duplicates
	// time and space O(n^2)
	public static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> result  = new HashSet<>();
		int length = nums.length;
		if (length < 3) return new ArrayList<>(result);

		// Sort the array
		Arrays.sort(nums);

		for(int i = 0; i < nums.length - 2; i++){
			int start = i + 1;
			int  end = nums.length - 1;

			while(start < end) {
				int sum = nums[i] + nums[start] + nums[end];
				if(sum == 0) {
					// Set uses equals method to check the equality of object, which is overridden in AbstractList class to compare every element in the List
					// so, equals returns true only if every element in the list are equal.
					// so adding it to set avoid duplicates
					result.add(Arrays.asList(nums[i], nums[start], nums[end]));
					start++;
					end--;
				}
				else if (sum > 0) {
					end--;
				}
				else if (sum < 0) {
					start++;
				}
			}

		}
		return new ArrayList<>(result);
	}

	public static void main(String[] args) {
		int[] intArray = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> result = threeSum(intArray);
		for (int i = 0; i < result.size(); i++) {
			List<Integer> list = result.get(i);
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
		}
	}
}
