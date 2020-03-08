package leetcode.Microsoft;

public class SortColors {

	public static void sortColors(int[] nums) {
		int countZeros = 0, countOnes = 0, countTwos = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 0) {
				countZeros++;
			}
			else if(nums[i] == 1) {
				countOnes++;
			}
			else if(nums[i] == 2) {
				countTwos++;
			}
		}
		for(int i = 0; i < countZeros; i++) {
			nums[i] = 0;
		}
		for(int i = countZeros; i < countZeros + countOnes; i++) {
			nums[i] = 1;
		}
		for(int i = countZeros + countOnes; i < nums.length; i++) {
			nums[i] = 2;
		}
	}

	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
	}
}
