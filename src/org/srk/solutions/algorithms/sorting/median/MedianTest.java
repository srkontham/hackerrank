package org.srk.solutions.algorithms.sorting.median;

import java.util.Arrays;

public class MedianTest {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. */
		// Scanner scan = new Scanner(System.in);
		// int size = scan.nextInt();
		// int arr[] = new int[size];
		// for (int i = 0; i < size; i++)
		// arr[i] = scan.nextInt();
		// scan.close();

		int arr[] = {0, 1, 2, 4, 6, 5, 3};
		Arrays.sort(arr);
		int median = findMedian(arr);
		System.out.println(median);
	}

	private static int findMedian(int[] arr) {
		return arr[arr.length/2];
	}

}
