package leetcode.Microsoft.OnlineAssessment;

import java.util.HashMap;
import java.util.Map;

public class LargestNumberXWhichOccursXTimes {

	public static HashMap<Integer,Integer> populateHashMap(int[] array) {
		HashMap<Integer,Integer> hashMap = new HashMap<>();
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

	public static int solution(int[] array) {
		HashMap<Integer,Integer> hashMap = populateHashMap(array);

		int max = 0;
		for (Map.Entry<Integer,Integer> entryList: hashMap.entrySet()) {
			int key = entryList.getKey();
			int value = entryList.getValue();
			if(key == value && key > max) {
				max = key;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[] array1 = {3,8,2,3,3,2};
		System.out.println(solution(array1));

		int[] array2 = {7,1,2,8,2};
		System.out.println(solution(array2));

		int[] array3 = {3,1,4,1,5};
		System.out.println(solution(array3));

		int[] array4 = {5,5,5,5,5};
		System.out.println(solution(array4));
	}
}
