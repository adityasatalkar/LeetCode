package com.adityasatalkar.MathWorks;

public class BeautifulArrangement {

	static int count = 0;

	public static int countArrangement(int N) {

		int[] array = new int[N];
		for (int i = 1; i <= N; i++) {
			array[i] = i;
		}

		for (int i = 1; i < N; i++) {
			if (array[i] % i == 0) {
				count++;
			}

		}
		return 0;
	}

	public static void main(String[] args) {

	}
}
