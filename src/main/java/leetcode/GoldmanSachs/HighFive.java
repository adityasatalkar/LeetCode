package leetcode.GoldmanSachs;

import java.util.*;

public class HighFive {

	public static HashMap<Integer, List<Integer>> populateHashMap(int[][] items) {
		HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
		for (int i = 0; i < items.length; i++) {
			int[] array = items[i];
			int currentId = array[0];
			if (hashMap.containsKey(currentId)) {
				List<Integer> currentList = hashMap.get(currentId);
				currentList.add(array[1]);
			}
			else {
				List<Integer> list = new ArrayList<>();
				list.add(array[1]);
				hashMap.put(array[0],list);
			}
		}
		return hashMap;
	}

	public static int[][] highFive(int[][] items) {
		HashMap<Integer, List<Integer>> hashMap = populateHashMap(items);
		int[][] resultArray = new int[hashMap.size()][2];
		Integer[] keysArray = hashMap.keySet().toArray(new Integer[hashMap.size()]);
		for (int i = 0; i < keysArray.length; i++) {
			int key = keysArray[i];
			List<Integer> list = hashMap.get(key);
			Collections.sort(list, Collections.reverseOrder());
			int count = 0;
			for (int j = 0; j < 5; j++) {
				count += list.get(j);
			}
			int average = count / 5;
			resultArray[i][0] = key;
			resultArray[i][1] = average;
		}
		return resultArray;
	}

	public static void main(String[] args) {
		int[][] inputArray1 = {
				{1,91},
				{1,92},
				{2,93},
				{2,97},
				{1,60},
				{2,77},
				{1,65},
				{1,87},
				{1,100},
				{2,100},
				{2,76}};
		int[][] result = highFive(inputArray1);

		for (int i = 0; i < result.length; i++) {
			int[] array = result[i];
			System.out.println("ID: " + array[0] + " Average: " + array[1]);
		}
	}
}
