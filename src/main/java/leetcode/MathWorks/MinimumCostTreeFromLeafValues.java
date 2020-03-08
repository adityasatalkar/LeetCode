package leetcode.MathWorks;

public class MinimumCostTreeFromLeafValues {

	public static void calculate(int[] array) {
		int result = 0;

		result = array[0] * array[1];

		for (int i = 2; i < array.length; i++) {
				result *= array[i];
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		int[] array = {6,2,4};
		calculate(array);
	}
}
