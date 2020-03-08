package leetcode.Microsoft.OnlineAssessment;

import java.util.HashMap;
import java.util.Map;

public class LargestInteger {

	public static HashMap<Integer,Integer> populateHashMap(int[] array) {
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			if (current > 0) {
				hashMap.put(current,0);
			}
		}
		return hashMap;
	}

	public static int solution(int[] array) {
		HashMap<Integer,Integer> hashMap = populateHashMap(array);

		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			if (current < 0) {
				int abs = Math.abs(current);
				if (hashMap.containsKey(abs)) {
					hashMap.put(abs,1);
				}
			}
		}

		int max = 0;
		for (Map.Entry<Integer,Integer> entryList: hashMap.entrySet()) {
			int key = entryList.getKey();
			int value = entryList.getValue();
			if (value == 1 && key > max) {
				max = key;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[] array1 = {3, 2, -2, 5, -3};
		int[] array2 = {1, 2, 3, -4};

		System.out.println(solution(array1));
		System.out.println(solution(array2));
	}
}
