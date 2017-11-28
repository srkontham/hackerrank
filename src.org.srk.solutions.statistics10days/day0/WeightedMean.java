package day0;

import java.util.Scanner;

public class WeightedMean {

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
		int weights[] = new int[size];
		for (int i = 0; i < size; i++) {
			weights[i] = scan.nextInt();
		}
		scan.close();
		
		double mean = getWeightedMean(arr, weights);

		System.out.printf("%1d",mean);

	}

	private static double getWeightedMean(int[] arr, int [] weights) {
		double eleWeightSum = 0;
		double weightSum = 0;
		for (int i=0; i<arr.length; i++) {
			eleWeightSum += arr[i]*weights[i];
			weightSum += weights[i];
		}
		return eleWeightSum /weightSum;
	}

}