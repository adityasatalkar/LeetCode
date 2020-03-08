package leetcode.Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LargestUniqueNumber {

	public static List reverseArrayAsList(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		return list;
	}

	public static HashMap<Integer, Integer> populateHashMap(int[] array) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			if (hashMap.containsKey(current)) {
				int value = hashMap.get(current);
				value++;
				hashMap.put(current,value);
			}
			else {
				hashMap.put(current,1);
			}
		}
		return hashMap;
	}

	public static int largestUniqueNumber(int[] A) {
		HashMap<Integer, Integer> hashMap = populateHashMap(A);

		List<Integer> reversedA = reverseArrayAsList(A);
		for (int i = 0; i < reversedA.size(); i++) {
			int count = hashMap.get(reversedA.get(i));
			if (count > 1) {
				continue;
			}
			else if (count == 1) {
				return reversedA.get(i);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array1 = {5,7,3,9,4,9,8,3,1};
		int[] array2 = {9,9,8,8};

		System.out.println(largestUniqueNumber(array1));
		System.out.println(largestUniqueNumber(array2));
	}
}
