package leetcode.Google;

import java.util.Arrays;
import java.util.HashMap;

import static leetcode.practice.MoveZeros.printArray;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

	public static HashMap<Integer, Integer> populateInitialHashMap(int[] array) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (hashMap.containsKey(array[i])) {
				continue;
			}
			hashMap.put(array[i],i);
		}
		return hashMap;
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int length = nums.length;
		int[] result = new int[length];
		int[] sorted = Arrays.copyOfRange(nums,0,length);

		Arrays.sort(sorted);
		HashMap<Integer, Integer> hashMap = populateInitialHashMap(sorted);

		for (int i = 0; i < length; i++) {
			result[i] = hashMap.get(nums[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array1 = {8,1,2,2,3};
		int[] array2 = {6,5,4,8};
		int[] array3 = {7,7,7,7};

		printArray(smallerNumbersThanCurrent(array1));
		System.out.println();
		printArray(smallerNumbersThanCurrent(array2));
		System.out.println();
		printArray(smallerNumbersThanCurrent(array3));
	}
}
