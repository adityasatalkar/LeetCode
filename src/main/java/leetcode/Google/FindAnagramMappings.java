package leetcode.Google;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import static leetcode.MoveZeros.printArray;

public class FindAnagramMappings {

	//HashMap and Stacks
	public static int[] anagramMappingsMethod1(int[] A, int[] B) {
		int[] result = new int[A.length];
		HashMap<Integer, Stack> hashMapB = new HashMap<>();
		for (int i = 0; i < B.length; i++) {
			int current = B[i];
			if (hashMapB.containsKey(current)) {
				Stack<Integer> stack = hashMapB.get(current);
				stack.add(i);
				hashMapB.put(B[i],stack);
			}
			else {
				Stack<Integer> stack = new Stack<>();
				stack.add(i);
				hashMapB.put(B[i],stack);
			}
		}
		for (int i = 0; i < result.length; i++) {
			Stack<Integer> stack = hashMapB.get(A[i]);
			int removeInt = stack.pop();
			result[i] = removeInt;
			if (!stack.isEmpty()) {
				hashMapB.put(A[i],stack);
			}
		}
		return result;
	}

	//HashMap and Lists
	public static int[] anagramMappingsMethod2(int[] A, int[] B) {
		int[] result = new int[A.length];
		HashMap<Integer, List> hashMapB = new HashMap<>();
		for (int i = 0; i < B.length; i++) {
			int current = B[i];
			if (hashMapB.containsKey(current)) {
				List<Integer> list = hashMapB.get(current);
				list.add(i);
				hashMapB.put(B[i],list);
			}
			else {
				List<Integer> list = new Stack<>();
				list.add(i);
				hashMapB.put(B[i],list);
			}
		}
		for (int i = 0; i < result.length; i++) {
			List<Integer> list = hashMapB.get(A[i]);
			int removeInt = list.remove(0);
			result[i] = removeInt;
			if (!list.isEmpty()) {
				hashMapB.put(A[i],list);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array1 = {12, 28, 46, 32, 50};
		int[] array2 = {50, 12, 32, 46, 28};
		int[] result = anagramMappingsMethod2(array1,array2);
		printArray(result);
	}
}
