import static leetcode.MoveZeros.printArray;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		for(int x = 0; x < nums.length; x++){
			for(int y = 0; y < nums.length; y++){
				if(x != y && nums[x] + nums[y] == target) {
					int[] indexes = {x, y};
					return indexes;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		printArray(twoSum(nums, target));
	}
}
