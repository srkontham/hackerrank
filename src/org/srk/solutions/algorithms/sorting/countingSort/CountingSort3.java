package org.srk.solutions.algorithms.sorting.countingSort;

import java.util.Scanner;

public class CountingSort3 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. 
		 */
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int count[] = new int[100];

		for (int i = 0; i < size; i++) {
			int num = sc.nextInt(); sc.next();
			count[num] = count[num] + 1;
		}
		
		// Output all the numbers of the list in order based on their count
		int sum = 0;
		for (int n: count) {
			sum = sum + n; 
			System.out.print(sum + " ");
		}
		sc.close();
	}

}
