package org.srk.solutions.algorithms.sorting.quickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuicksortSorting {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. */
		Scanner scan = new Scanner(System.in);
		// System.out.print("Enter number of elements: ");
		// int size = scan.nextInt();
		// int arr[] = new int[size];
		// for (int i = 0; i < size; i++)
		// arr[i] = scan.nextInt();

		int arr[] = { 5, 8, 1, 3, 7, 9, 2 };

		List<Integer> list = new ArrayList<>();
		for (int n : arr)
			list.add(n);

		partition(list);

		scan.close();
	}

	// private static void quickSort(int[] arr, int low, int high) {
	// if (low < high) {
	// //int index = partition(Arrays.asList(arr));
	// quickSort(arr, low, index - 1);
	// quickSort(arr, index + 1, high);
	// printArray(arr);
	// }
	// }

	public static List<Integer> partition(List<Integer> list) {

		int pivot = list.get(0);
		List<Integer> leftSide = new ArrayList<>();
		List<Integer> rightSide = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < pivot) {

				leftSide.add(list.get(i));
			} else if (list.get(i) > pivot) {
				rightSide.add(list.get(i));
			}

		}

		if (leftSide.size() > 1) 
			leftSide = partition(leftSide);
		if (rightSide.size() > 1) 
			rightSide = partition(rightSide);
		
		List<Integer> merge = new ArrayList<>();
		merge.addAll(leftSide);
		merge.add(pivot);
		merge.addAll(rightSide);

		// print output
		printArray(merge);

		return merge;
	}

	private static void printArray(List<Integer> list) {
		for (int value : list)
			System.out.print(value + " ");
		System.out.println();
	}

}
