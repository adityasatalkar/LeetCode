package com.adityasatalkar.practice;

public class Matrix {

	public static void main(String[] args) {
		int count = 1;
		int[][] matrix = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = count++;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
