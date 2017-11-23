package org.srk.solutions.algorithms.sorting.countingSort;

import java.util.Scanner;

public class CountingSort2 {
	
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 */
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int count[] = new int[100];

		for (int i = 0; i < size; i++) {
			int num = sc.nextInt();
			count[num] = count[num] + 1;
		}
		
		for (int i=0; i<size; i++) {
			int cnt = count[i]; 
			while(cnt-- > 0)
				System.out.print(i + " ");
		}
			
		sc.close();
	}
}
