package leetcode.Google;

import java.util.Arrays;

public class HeightChecker {

	public static int heightChecker(int[] heights) {
		int count = 0;
		int[] sorted = Arrays.copyOfRange(heights,0,heights.length);
		Arrays.sort(sorted);
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != sorted[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] array = {1,1,4,2,1,3};
		System.out.println(heightChecker(array));
	}
}
