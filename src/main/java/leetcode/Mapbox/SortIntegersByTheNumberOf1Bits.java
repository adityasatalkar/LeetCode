package leetcode.Mapbox;

import java.util.*;

import static leetcode.practice.MoveZeros.printArray;

public class SortIntegersByTheNumberOf1Bits {

	public static int getBitCount(String binaryInteger) {
		int count = 0;
		char[] charArray = binaryInteger.toCharArray();
		for (char current: charArray) {
			if (current == '1') {
				count++;
			}
		}
		return count;
	}

	public static HashMap<Integer,List<Integer>> populateHashMap(int[] arr) {
		HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			String binaryInteger = Integer.toBinaryString(arr[i]);
			int numberOf1s = getBitCount(binaryInteger);
			if (hashMap.containsKey(numberOf1s)) {
				List list = hashMap.get(numberOf1s);
				list.add(arr[i]);
				hashMap.put(numberOf1s,list);
			}
			else {
				List<Integer> list = new ArrayList<>();
				list.add(arr[i]);
				hashMap.put(numberOf1s,list);
			}
		}
		return hashMap;
	}

	public static int[] sortByBits(int[] arr) {
		int[] result = new int[arr.length];
		List<Integer> resultList = new ArrayList<>();
		HashMap<Integer, List<Integer>> hashMap = populateHashMap(arr);
		Set<Integer> keySet = hashMap.keySet();
		Integer[] array = keySet.toArray(new Integer[keySet.size()]);
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			List<Integer> list = hashMap.get(array[i]);
			int[] arrayOfList = list.stream().mapToInt(a->a).toArray();
			Arrays.sort(arrayOfList);
			for (int j = 0; j < arrayOfList.length; j++) {
				resultList.add(arrayOfList[j]);
			}
		}

		return resultList.stream().mapToInt(b->b).toArray();
	}

	public static void main(String[] args) {
		int[] input1 = {0,1,2,3,4,5,6,7,8};
		int[] result1 = sortByBits(input1);
		printArray(result1);

		System.out.println();
		int[] input2 = {1024,512,256,128,64,32,16,8,4,2,1};
		int[] result2 = sortByBits(input2);
		printArray(result2);
	}
}
