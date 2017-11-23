package org.srk.solutions.algorithms.sorting.countingSort;

import java.util.Scanner;

public class FullCountingSort {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 */
		Scanner scan = new Scanner(System.in);
		int size = Integer.parseInt(scan.nextLine());
		StringBuffer[] str = new StringBuffer[100];

		for (int i = 0; i < 100; i++) {
			str[i] = new StringBuffer();
		}

		for (int i = 0; i < size; i++) {
			String[] input = scan.nextLine().split("[\\s]+");
			int index = Integer.parseInt(input[0]);
			String s;
			if (i < size / 2)
				s = "- ";
			else
				s = input[1] + " ";
			str[index] = str[index].append(s);
		}

		for (int i = 0; i < 100; i++) {
			System.out.print(str[i]);
		}

		scan.close();
	}

}
