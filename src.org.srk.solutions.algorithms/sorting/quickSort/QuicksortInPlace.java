package sorting.quickSort;

import java.util.Scanner;

public class QuicksortInPlace {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. */
		Scanner scan = new Scanner(System.in);
		// System.out.print("Enter number of elements: ");
		// int size = scan.nextInt();
		// int arr[] = new int[size];
		// for (int i = 0; i < size; i++)
		// arr[i] = scan.nextInt();
		int arr[] = { 1, 3, 9, 8, 2, 7, 5 };

		quickSort(arr, 0, arr.length - 1);

		scan.close();
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int index = partition(arr, low, high);
			printArray(arr);
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
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[high];
		arr[high] = arr[i + 1];
		arr[i + 1] = temp;

		return i + 1;
	}

	private static void printArray(int[] arr) {
		for (int value : arr)
			System.out.print(value + " ");
		System.out.println();
	}

}
