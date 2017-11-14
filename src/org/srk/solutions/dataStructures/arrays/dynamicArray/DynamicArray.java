package org.srk.solutions.datastructures.arrays.dynamicArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();

		int lastAnswer = 0;
		// Dynamic Array
		List<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++)
			seqList.add(new ArrayList<Integer>());

		for (int i = 0; i < q; i++) {
			int qType = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();

			int seq = (x ^ lastAnswer) % n;
			// System.out.println("Q1 -> Seq: " + seq);

			switch (qType) {
			case 1:
				seqList.get(seq).add(y);
				break;

			case 2:
				int index = y % seqList.get(seq).size();
				lastAnswer = seqList.get(seq).get(index);
				System.out.println(lastAnswer);
				break;
			}
		}
		scan.close();
	}
}
