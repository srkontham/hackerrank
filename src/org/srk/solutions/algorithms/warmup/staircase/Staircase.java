package org.srk.solutions.algorithms.warmup.staircase;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= (n - i - 1))
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		scan.close();
	}
}