package sorting.insertionSort;

import java.util.Scanner;

public class InsertionSortAdvanced {

	private static long swapCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int itr = in.nextInt();
		// for (int x = 0; x < itr; x++)
		{
			// int n = in.nextInt();
			// int[] arr = new int[n];
			// for (int i = 0; i < n; i++) {
			// arr[i] = in.nextInt();
			// }
			int arr[] = { 2, 1, 3, 1, 2 };

			int buffer[] = new int[arr.length];
			mergeSort(arr, buffer, 0, arr.length - 1);
			System.out.println(swapCount);
			// printArray(arr);
		}
		sc.close();
	}

	// Implemented Merge sort for best performance of Insertion Sort
	private static void mergeSort(int[] data, int[] buffer, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(data, buffer, start, mid);// sort the left side
			mergeSort(data, buffer, mid + 1, end);// sort the right side
			mergeArray(data, buffer, start, mid, end);// merge subArry[start ... mid] and subArray[mid+1 ... end]
		}
	}

	private static void mergeArray(int[] data, int[] buffer, int start, int mid, int end) {
		int i = start, j = mid + 1;// i is the cursor of subArray[start ... mid](asc) and j is the cursor of
									// subArray[mid+1 ... end](asc)
		int upBound_i = mid, upBound_j = end;
		int k = 0;// k is the cursor of the buffer
		while (i <= upBound_i && j <= upBound_j) {
			if (data[i] <= data[j]) {// no inversion
				buffer[k++] = data[i++];
			} else {
				buffer[k++] = data[j++];
				swapCount += (mid - i + 1);// data[i...mid] all bigger than data[j] update the inversion
			}
		}
		// get the rest
		while (i <= upBound_i)
			buffer[k++] = data[i++];
		while (j < upBound_j)
			buffer[k++] = data[j++];
		// put the buffer(sorted) to the data(start...end)
		for (int cur = 0; cur < k; cur++)
			data[start + cur] = buffer[cur];
	}

	public static void printArray(int arr[]) {
		int size = arr.length;
		for (int i = 0; i < size; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
