package leetcode.practice;

public class RemoveElement {

	static int[] nums1 = {3,2,2,3};
	static int[] nums2 = {0,1,2,2,3,0,4,2};

	public static int removeElement(int[] nums, int val) {
		int j = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[j] = nums[i];
				count++;
				j++;
			}
		}
		return count;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("answer " + removeElement(nums1,3));
		System.out.println("answer " + removeElement(nums2,2));

		printArray(nums1);
		printArray(nums2);
	}
}
