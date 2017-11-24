package org.srk.solutions.algorithms.sorting.quickSort;

import java.util.Scanner;

public class QuicksortRunTime {
	private static int quickSwaps = 0;

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. */
		Scanner scan = new Scanner(System.in);
		// System.out.print("Enter number of elements: ");
		// int size = scan.nextInt();
		// int arr[] = new int[size];
		// for (int i = 0; i < size; i++)
		// arr[i] = scan.nextInt();
		// int arr[] = { 1, 3, 9, 8, 2, 7, 5 };
		int arr[] = { 1, 3, 4, 5, 2, 7, 8, 9, 6, 10 };
		int insertArr[] = arr.clone();
		quickSort(arr, 0, arr.length - 1);
		int insertSwaps = insertionSort(insertArr);

		System.out.println(insertSwaps - quickSwaps);

		scan.close();
	}

	public static int insertionSort(int[] A) {
		int count = 0;
		for (int i = 1; i < A.length; i++) {
			int value = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > value) {
				count++;
				A[j + 1] = A[j];
				j = j - 1;
			}
			A[j + 1] = value;
		}
		return count;
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int index = partition(arr, low, high);
			// printArray(arr);
			quickSort(arr, low, index - 1);
			quickSort(arr, index + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				quickSwaps++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		quickSwaps++;
		int temp = arr[high];
		arr[high] = arr[i + 1];
		arr[i + 1] = temp;

		return i + 1;
	}

	@SuppressWarnings("unused")
	private static void printArray(int[] arr) {
		for (int value : arr)
			System.out.print(value + " ");
		System.out.println();
	}

}
