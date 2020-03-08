package leetcode.BookFace;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfThreeSortedArrays {

	public static Set populateSet(int[] array) {
		Set set = new HashSet();
		for (int i = 0; i < array.length; i++) {
			if (!set.contains(array[i])) {
				set.add(array[i]);
			}
		}
		return set;
	}

	public static int getLargest(int lengthOfArray1,int lengthOfArray2, int lengthOfArray3) {
		if ((lengthOfArray1 >= lengthOfArray2) && (lengthOfArray1 >= lengthOfArray3)) {
			return 1;
		}
		else if (lengthOfArray2 >= lengthOfArray3) {
			return 2;
		}
		else {
			return 3;
		}
	}

	public static List<Integer> getResult(int[] array, Set set1, Set set2) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (set1.contains(array[i]) && set2.contains(array[i])) {
				result.add(array[i]);
			}
		}
		return result;
	}

	public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
		List<Integer> result;
		Set setForArray1 = populateSet(arr1);
		Set setForArray2 = populateSet(arr2);
		Set setForArray3 = populateSet(arr3);

		int whoseLengthIsLargest = getLargest(arr1.length, arr2.length, arr3.length);

		if (whoseLengthIsLargest == 1) {
			result = getResult(arr1,setForArray2,setForArray3);
		}
		else if (whoseLengthIsLargest == 2) {
			result = getResult(arr2,setForArray1,setForArray3);
		}
		else {
			result = getResult(arr3,setForArray1,setForArray2);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,5,7,9};
		int[] arr3 = {1,3,4,5,8};
		List<Integer> result = arraysIntersection(arr1,arr2,arr3);
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
	}
}
