package leetcode.practice;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {

	public static List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> integerList = new ArrayList<>();

		Map<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int current = nums[i];
			if (hashMap.containsKey(current)) {
				int value = hashMap.get(current);
				hashMap.put(current, value + 1);
			}
			else {
				hashMap.put(current, 1);
			}
		}

		LinkedHashMap<Integer, Integer> linkedHashMap = (LinkedHashMap<Integer, Integer>) hashMap.entrySet().stream()
				.sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

		List<Integer> keys = linkedHashMap.keySet().stream().collect(Collectors.toList());
		for (int i = 0; i < k; i++) {
			integerList.add(keys.get(i));
		}

		return integerList;
	}

	public static void printHashMap(Map<Integer,Integer> hashMap) {
		System.out.println(Arrays.asList(hashMap));
	}

	public static void printList(List<Object> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void main(String[] args) {
		int[] arrayA = {1,1,1,2,2,3};
		int[] arrayB = {1};
		int kForArrayA = 2;
		int kForArrayB = 1;

		List resultArrayA = topKFrequent(arrayA,kForArrayA);
		List resultArrayB = topKFrequent(arrayB,kForArrayB);

		printList(resultArrayA);
		printList(resultArrayB);
	}
}
