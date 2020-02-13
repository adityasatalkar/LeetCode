package com.adityasatalkar.leetcode;

public class ArmstrongNumber {

	public static boolean isArmstrong(int N) {
		int result = 0;
		String string = String.valueOf(N);

		for (int i = 0; i < string.length(); i++) {
			result += (int) Math.pow(Integer.parseInt(String.valueOf(string.charAt(i))),string.length());
		}
		if (result == N) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
		System.out.println(isArmstrong(123));
	}
}