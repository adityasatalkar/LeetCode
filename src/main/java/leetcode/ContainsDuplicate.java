package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static boolean containsDuplicateV1(int[] nums) {
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(nums[i])) {
				return true;
			}
			else {
				hashMap.put(nums[i],1);
			}
		}
		return false;
	}

	public static boolean containsDuplicateV2(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			}
			else {
				set.add(nums[i]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 1};
		int[] b = {1, 2, 3, 4};
		int[] c = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

		System.out.println(containsDuplicateV1(a));
		System.out.println(containsDuplicateV1(b));
		System.out.println(containsDuplicateV1(c));

		System.out.println(containsDuplicateV2(a));
		System.out.println(containsDuplicateV2(b));
		System.out.println(containsDuplicateV2(c));
	}
}
