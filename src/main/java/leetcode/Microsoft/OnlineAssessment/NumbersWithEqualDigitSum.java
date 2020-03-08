package leetcode.Microsoft.OnlineAssessment;

import java.util.*;

public class NumbersWithEqualDigitSum {

	public static int getDigitSum(int number) {
		number = Math.abs(number);
		int result = 0;
		while (number > 0) {
			result = result + (number % 10);
			number = number / 10;
		}
		return result;
	}

	public static int maxSum(int[] A) {
		HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			int digitSum = getDigitSum(A[i]);
			if (hashMap.containsKey(digitSum)) {
				List<Integer> list = hashMap.get(digitSum);
				list.add(A[i]);
				hashMap.put(digitSum,list);
			}
			else {
				List<Integer> list = new ArrayList<>();
				list.add(A[i]);
				hashMap.put(digitSum,list);
			}
		}
		for (Map.Entry<Integer,List<Integer>> entryList: hashMap.entrySet()) {
			List<Integer> list = entryList.getValue();
			if (list.size() > 1) {
				return list.get(0) + list.get(list.size()-1);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array1 = {51,71,17,42};
		int[] array2 = {42,33,60};
		int[] array3 = {51,32,43};

		System.out.println(maxSum(array1));
		System.out.println(maxSum(array2));
		System.out.println(maxSum(array3));
	}
}
