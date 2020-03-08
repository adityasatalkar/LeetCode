package leetcode.Apple;

import java.util.HashSet;

public class NRepeatedElementInSize2NArray {

	public static int repeatedNTimes(int[] A) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (hashSet.contains(A[i])) {
				return A[i];
			}
			else {
				hashSet.add(A[i]);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] array1 = {1,2,3,3};
		int[] array2 = {2,1,2,5,3,2};
 		int[] array3 = {5,1,5,2,5,3,5,4};

		System.out.println(repeatedNTimes(array1));
		System.out.println(repeatedNTimes(array2));
		System.out.println(repeatedNTimes(array3));
	}
}
