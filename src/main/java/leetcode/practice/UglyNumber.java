package leetcode.practice;

public class UglyNumber {

	public static boolean isUgly(int num) {
		if (num <= 0)
			return false;

		int[] uglyFactors = {2,3,5};

		int i = 0;

		while(i < uglyFactors.length) {
			while (num % uglyFactors[i] == 0) {
				num = num / uglyFactors[i];
			}
			i++;
		}
		return num == 1;
	}

	public static void main(String[] args) {
		System.out.println(isUgly(6));
		System.out.println(isUgly(8));
		System.out.println(isUgly(14));
	}
}
