package leetcode.FAANG;

import static leetcode.FAANG.RotateArray.printArray;

public class ProductOfArrayExceptSelf {

	public static int[] productExceptSelf(int[] nums) {
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];

		for(int i=0;i<nums.length;i++){
			left[i]=1;
			right[i]=1;
		}

		for(int i=1;i<nums.length;i++){
			left[i] = left[i-1]*nums[i-1] ;

		}

		for(int j=nums.length-2;j>=0;j--){
			right[j] = right[j+1]*nums[j+1] ;

		}

		for(int i=0;i<nums.length;i++){
			nums[i] = right[i] * left[i];
		}

		return nums;
	}

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4};
		int[] a2 = {0,0};
		int[] a3 = {0,1};
		int[] a4 = {1,0};
		int[] a5 = {1,1};

		printArray(productExceptSelf(a1));
		System.out.println();
		printArray(productExceptSelf(a2));
		System.out.println();
		printArray(productExceptSelf(a3));
		System.out.println();
		printArray(productExceptSelf(a4));
		System.out.println();
		printArray(productExceptSelf(a5));
	}
}
