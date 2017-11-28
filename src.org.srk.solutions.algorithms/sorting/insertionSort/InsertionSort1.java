package sorting.insertionSort;

import java.util.Scanner;

public class InsertionSort1 {
	public static void insertIntoSorted(int[] array) {
		// Fill up this function
		boolean flag = true;
		while (flag) {
			int temp;
			flag = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i + 1] < array[i]) {
					temp = array[i + 1];
					array[i + 1] = array[i];
					printArray(array);
					array[i] = temp;
					flag = true;
				}
			}
		}
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
		printArray(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
