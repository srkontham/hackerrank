package org.srk.solutions.java.datastructures.javaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<List<Integer>> arrList = new ArrayList<List<Integer>>(n);
		for (int i = 0; i < n; i++) {
			int inSize = scan.nextInt();
			if (inSize > 0) {
				List<Integer> intList = new ArrayList<Integer>();
				for (int j = 0; j < inSize; j++) {
					intList.add(j, scan.nextInt());
				}
				arrList.add(i, intList);
			} else {
				arrList.add(i, new ArrayList<Integer>());
			}
		}

		int q = scan.nextInt();

		for (int i = 0; i < q; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			// System.out.println("Size: "+arrList.get(x-1).size());
			if (arrList.get(x - 1).size() >= y) {
				System.out.println(arrList.get(x - 1).get(y - 1));
			} else {
				System.out.println("ERROR!");
			}
		}
		scan.close();
	}
}