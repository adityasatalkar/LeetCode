package com.adityasatalkar.leetcode;

public class ValidPerfectSquare {

	public static boolean isPerfectSquare(int num) {
		for (int i = 1; i * i <= num ; i++) {
			if ((num % i == 0) && (num / i == i)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(14));
		System.out.println(isPerfectSquare(9));
		System.out.println(isPerfectSquare(144));
		System.out.println(isPerfectSquare(16));
	}
}
