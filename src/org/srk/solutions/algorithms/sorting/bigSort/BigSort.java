package org.srk.solutions.algorithms.sorting.bigSort;

import java.util.Arrays;
import java.util.Comparator;

public class BigSort {
	public static void main(String args[]) {
		// Reading input from STDIN
		// Scanner in = new Scanner(System.in);
		// int n = in.nextInt();
		// String[] unsorted = new String[n];
		// for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
		// unsorted[unsorted_i] = in.next();
		// }

		String unsorted[] = { "5", "1237637463746732323", "97987", "12" };

		// your code goes here
		// Sorting using comparator
		Arrays.sort(unsorted, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				if (a.length() != b.length())
					return a.length() - b.length();
				return a.compareTo(b);
			}
		});
		
		// Sorting using lambda expression
		// Arrays.sort(unsorted, (a, b) -> {
		// if (a.length() != b.length())
		// return a.length() - b.length();
		// return a.compareTo(b);
		// });
		
		for (String str : unsorted)
			System.out.println(str);
	}
}
