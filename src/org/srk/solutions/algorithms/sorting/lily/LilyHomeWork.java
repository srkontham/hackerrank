package org.srk.solutions.algorithms.sorting.lily;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LilyHomeWork {
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. */
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int sortedSwaps = 0;
		int[] homework = new int[n];
		Integer[] homeworkSorted = new Integer[n];
		Map<Integer, Integer> original = new HashMap<>();

		int sortedReverseSwaps = 0;
		int[] homework2ndCopy = new int[n];
		Map<Integer, Integer> original2ndCopy = new HashMap<>();

		// Initialize our arrays and maps
		for (int i = 0; i < n; i++) {
			homeworkSorted[i] = input.nextInt();
			homework[i] = homeworkSorted[i];
			homework2ndCopy[i] = homeworkSorted[i];
			original.put(homework[i], i);
			original2ndCopy.put(homework2ndCopy[i], i);
		}
		input.close();
		// Sort the input ascending
		Arrays.sort(homeworkSorted);

		for (int i = 0; i < n; i++) {
			if (homework[i] != homeworkSorted[i]) {
				// swap the element from homework to the right position
				int tmp = homework[i];
				homework[i] = homework[original.get(homeworkSorted[i])];
				homework[original.get(homeworkSorted[i])] = tmp;
				// Update index after swap
				original.put(tmp, original.get(homeworkSorted[i]));
				sortedSwaps++;
			}
		}
		// Sort the input descending
		Arrays.sort(homeworkSorted, Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			if (homework2ndCopy[i] != homeworkSorted[i]) {
				// swap the element from homework to the right position
				int tmp = homework2ndCopy[i];
				homework2ndCopy[i] = homework2ndCopy[original.get(homeworkSorted[i])];
				homework2ndCopy[original2ndCopy.get(homeworkSorted[i])] = tmp;
				// Update index after swap
				original2ndCopy.put(tmp, original2ndCopy.get(homeworkSorted[i]));
				sortedReverseSwaps++;
			}
		}
		// Choose the smallest of the two possible
		System.out.println(Math.min(sortedSwaps, sortedReverseSwaps));
	}
}
