package org.srk.solutions.algorithms.sorting.quickSort;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QuicksortPartition {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. */
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}

		divide(arr, arr[0]);

		scan.close();
	}

	public static void divide(int[] arr, int pivot) {
		Queue<Integer> left = new LinkedList<>();
		Queue<Integer> right = new LinkedList<>();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < pivot)
				left.add(arr[i]);
			if (arr[i] > pivot)
				right.add(arr[i]);
		}
		printArray(left.toArray());
		System.out.print(pivot + " ");
		printArray(right.toArray());
	}

	private static void printArray(Object[] objects) {
		for (Object value : objects) {
			System.out.print(value.toString() + " ");
		}
	}

}
