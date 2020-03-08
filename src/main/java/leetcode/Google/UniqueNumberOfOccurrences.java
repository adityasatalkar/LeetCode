package leetcode.Google;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {

	public static boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			if (hashMap.containsKey(current)) {
				hashMap.put(current, hashMap.get(current)+1);
			}
			else {
				hashMap.put(current,1);
			}
		}
		Integer[] keysArray = hashMap.keySet().toArray(new Integer[hashMap.size()]);
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = 0; i < keysArray.length; i++) {
			int value = hashMap.get(keysArray[i]);
			if (hashSet.contains(value)) {
				return false;
			}
			else {
				hashSet.add(value);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2,2,1,1,3};
		int[] arr2 = {1,2};
		int[] arr3 = {-3,0,1,-3,1,1,1,-3,10,0};

		System.out.println(uniqueOccurrences(arr1));
		System.out.println(uniqueOccurrences(arr2));
		System.out.println(uniqueOccurrences(arr3));
	}
}
