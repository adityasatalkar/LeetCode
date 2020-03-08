package data_structure_algorithms;

public class BinarySearchRecursive {

	public static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
		if (left > right) {
			return false;
		}

		int mid = (left + right) / 2;
		if (array[mid] == x) {
			return true;
		}
		else if (x < array[mid]) {
			return binarySearchRecursive(array, x, left, mid-1);
		} else {
			return binarySearchRecursive(array, x, mid +1, right);
		}
	}

	public static boolean binarySearchRecursive(int[] array, int x) {
		return binarySearchRecursive(array, x, 0, array.length-1);
	}

	public static void main(String[] args) {
		int[] array = {1,3,6,7,8,9};
		System.out.println(binarySearchRecursive(array,2));
	}
}
