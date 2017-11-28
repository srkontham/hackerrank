package org.srk.solutions.statistics10days.day0;

import java.util.Arrays;
import java.util.Scanner;

public class StatOperationsMMM {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		Arrays.sort(arr);
		double mean = getMean(arr);
		double median = getMedian(arr);
		int mode = getMode(arr);

		System.out.println(mean + "\n" + median + "\n" + mode);

	}

	private static double getMean(int[] arr) {
		double sum = 0;
		for (int value : arr)
			sum += value;
		return sum / arr.length;
	}

	private static double getMedian(int[] arr) {
		int size = arr.length;
		return (size % 2 == 0) ? ((arr[size / 2 - 1] + arr[size / 2]) / (double) 2) : arr[size / 2];
	}

	private static int getMode(int[] arr) {
		int modeCount = 0, mode = 0, currCount = 0;

		for (int candidateMode : arr) {
			currCount = 0;

			for (int element : arr) {
				if (candidateMode == element)
					currCount++;
			}

			if (currCount > modeCount) {
				modeCount = currCount;
				mode = candidateMode;
			}
		}
		return mode;
	}

}