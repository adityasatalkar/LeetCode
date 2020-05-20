package leetcode.practice;

import java.util.Arrays;
import java.util.HashMap;

public class CountingElements {

	public static int countElements(int[] arr) {
		Arrays.sort(arr);
		int result = 0;
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		for (int current: arr) {
			if (hashMap.containsKey(current)) {
				int count = hashMap.get(current);
				hashMap.put(current,count+1);
			}
			else {
				hashMap.put(current,1);
			}
		}

		for (int current: arr) {
			int x = 0;
			x = current+1;
			if (hashMap.containsKey(x)) {
				int count = hashMap.get(current);
				if (count > 0) {
					hashMap.put(current,count-1);
					result++;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] array1 = {1,3,2,3,5,0};
		System.out.println(countElements(array1));
	}
}
