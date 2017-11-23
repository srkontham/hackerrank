package org.srk.solutions.algorithms.sorting.countingSort;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingSort1v2 {
	
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. 
		 */
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		Map<Integer, Integer> count = new HashMap<>();
		for(int i=0; i<100; i++)
			count.put(i, 0);
		
		for(int i=0; i<size; i++) {
			int num = sc.nextInt();
			if(count.containsKey(num)) {
				count.put(num, count.get(num) + 1);
			}
		}
		
		// Output the number of times every number from 0 to 99 (inclusive) appears on the list.
		count.forEach((k,v)->System.out.print(v + " "));
				
		sc.close();
	}
}
