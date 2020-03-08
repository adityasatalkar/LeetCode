package leetcode.Audible;

import java.util.*;

public class MinimumAbsoluteDifference {

	public static int getDifferenceInNumbers(int[] array) {
		HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
		int diff = 0;
		for (int i = 0; i < array.length-1; i++) {
			diff = array[i] - array[i+1];
			if (hashMap.containsKey(diff)) {
				List<Integer> list = hashMap.get(diff);
				list.add(array[i]);
				hashMap.put(diff,list);
			}
			else {
				List<Integer> list = new ArrayList<>();
				list.add(array[i]);
				hashMap.put(diff,list);
			}
		}
		Set<Integer> keySet = hashMap.keySet();
		Integer[] keysArray = keySet.toArray(new Integer[keySet.size()]);
		int max = 0;
		for (int i = 0; i < keysArray.length; i++) {
			List<Integer> list = hashMap.get(diff);
			if (list.size() > max) {
				max = list.size();
			}
		}
		diff = max;
		//System.out.println("Difference is " + diff);
		printHashMap(hashMap);
		return diff;
	}

	public static void printHashMap(HashMap<Integer, List<Integer>> hashMap) {
		Set<Integer> keySet = hashMap.keySet();
		Integer[] keysArray = keySet.toArray(new Integer[keySet.size()]);
		for (int i = 0; i < keysArray.length; i++) {
			List<Integer> list = hashMap.get(keysArray[i]);
			System.out.println("Key: " + keysArray[i]);
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
		}
	}

	public static List<List<Integer>> minimumAbsDifference(int[] arr) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(arr);
		//printArray(arr);
		//System.out.println();
		getDifferenceInNumbers(arr);
		//System.out.println();
		return result;
	}

	public static void main(String[] args) {
//		int[] array1 = {4,2,1,3};
//		int[] array2 = {1,3,6,10,15};
		int[] array3 = {3,8,-10,23,19,-4,-14,27};

//		List<List<Integer>> result1 = minimumAbsDifference(array1);
//		List<List<Integer>> result2 = minimumAbsDifference(array2);
		List<List<Integer>> result3 = minimumAbsDifference(array3);
	}
}
