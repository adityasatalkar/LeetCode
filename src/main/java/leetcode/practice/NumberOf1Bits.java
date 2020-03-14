package leetcode.practice;

public class NumberOf1Bits {

	public static int hammingWeight(int n) {
		return Integer.bitCount(n);
	}

	public static void main(String[] args) {
		System.out.println(hammingWeight(00000000000000000000000000001011));
		System.out.println(hammingWeight(00000000000000000000000010000000));
	}
}
