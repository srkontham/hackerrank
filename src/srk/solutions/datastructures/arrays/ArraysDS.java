package srk.solutions.datastructures.arrays;

import java.util.Scanner;

public class ArraysDS {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		/*
		 * Printing the array elements in reverse order.
		 */
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}
}
