package leetcode.FAANG;

public class RotateArray {

	public static int[] rotateMethod(int[] nums, int k) {
		for (int i = 0; i < k; i++) {
			rightRotatebyOne(nums);
		}
		return nums;
	}

	public static void rightRotatebyOne(int arr[]) {
		int i, temp;
		temp = arr[arr.length-1];
		for (i = arr.length - 1; i > 0 ; i--){
			arr[i] = arr[i - 1];
		}
		arr[i] = temp;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		printArray(rotateMethod(array,3));
	}
}
