package leetcode.Microsoft;

import java.util.*;

public class ContainsDuplicateII {

	public static HashMap<Integer, List> populateHashMap(int[] array) {
		HashMap<Integer, List> hashMap = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			if (hashMap.containsKey(current)) {
				List<Integer> list = hashMap.get(current);
				list.add(i);
				Collections.sort(list);
				hashMap.put(current,list);
			}
			else {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				hashMap.put(current,list);
			}
		}
		return hashMap;
	}

	public static int getMinimumDifference(List<Integer> list) {
		int minDifference = Math.abs(list.get(0) - list.get(1));
		for (int i = 0; i < list.size() - 1; i++) {
			int diff = Math.abs(list.get(i) - list.get(i+1));
			if (diff < minDifference) {
				minDifference = diff;
			}
		}
		return minDifference;
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, List> hashMap = populateHashMap(nums);
		for (int i = 0; i < nums.length; i++) {
			int current = nums[i];
			if (hashMap.containsKey(current)) {
				List<Integer> list = hashMap.get(current);
				if (list.size() > 1) {
					int difference = getMinimumDifference(list);
					if (difference > k) {
						return false;
					}
					if (difference <= k) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array1 = {1,2,3,1};
		int k1 = 3;
		int[] array2 = {1,0,1,1};
		int k2 = 1;
		int[] array3 = {1,2,3,1,2,3};
		int k3 = 2;
		int[] array4 = {};
		int k4 = 0;

		System.out.println(containsNearbyDuplicate(array1,k1));
		System.out.println(containsNearbyDuplicate(array2,k2));
		System.out.println(containsNearbyDuplicate(array3,k3));
		System.out.println(containsNearbyDuplicate(array4,k4));
	}
}
