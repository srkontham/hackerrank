package org.srk.solutions.datastructures.arrays.array2d;

import java.util.Scanner;

public class ArraysDS2D {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. */
		int SIZE = 6;
		int[][] arr = new int[SIZE][SIZE];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		int maxHourGlass = Integer.MIN_VALUE;

		for (int i = 0; i < SIZE - 2; i++) {
			for (int j = 0; j < SIZE - 2; j++) {
				int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];

				if (sum > maxHourGlass)
					maxHourGlass = sum;
			}
		}

		System.out.println(maxHourGlass);
		scan.close();
	}
}