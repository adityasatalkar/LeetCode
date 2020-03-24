package leetcode.Audible;

import java.util.*;

public class MinimumAbsoluteDifference {

	public static List<List<Integer>> sortLists(List<List<Integer>> listofLists) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = listofLists.size()-1; i >= 0; i--) {
			List<Integer> list = listofLists.get(i);
			Collections.sort(list);
			result.add(list);
		}
		return result;
	}

	public static List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);

		HashMap<Integer, List<List<Integer>>> hashMap = new HashMap<>();
		for (int i = arr.length-1; i > 0; i--) {
			int diff = arr[i] - arr[i-1];
			if (hashMap.containsKey(diff)) {
				List<List<Integer>> listOfLists = hashMap.get(diff);
				List<Integer> list = new ArrayList<>();
				list.add(arr[i]);
				list.add(arr[i-1]);
				listOfLists.add(list);
				hashMap.put(diff,listOfLists);
			}
			else {
				List<List<Integer>> listOfLists = new ArrayList<>();
				List<Integer> list = new ArrayList<>();
				list.add(arr[i]);
				list.add(arr[i-1]);
				listOfLists.add(list);
				hashMap.put(diff,listOfLists);
			}
		}

		Integer[] keysArray = hashMap.keySet().toArray(new Integer[hashMap.size()]);
		Arrays.sort(keysArray);

		//return hashMap.get(keysArray[0]);
		return sortLists(hashMap.get(keysArray[0]));
	}

	public static void main(String[] args) {
		int[] array1 = {4,2,1,3};
		int[] array2 = {1,3,6,10,15};
		int[] array3 = {3,8,-10,23,19,-4,-14,27};

		List<List<Integer>> result1 = minimumAbsDifference(array1);
		List<List<Integer>> result2 = minimumAbsDifference(array2);
		List<List<Integer>> result3 = minimumAbsDifference(array3);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
