package org.srk.solutions.java.datastructures.javaCollections;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int bitSetSize = scan.nextInt();
		BitSet b1 = new BitSet(bitSetSize);
		BitSet b2 = new BitSet(bitSetSize);

		int noOfOperations = scan.nextInt();
		while (noOfOperations-- > 0) {
			String op = scan.next();
			int a = scan.nextInt();
			int b = scan.nextInt();
			switch (op) {
			case "AND":
				if (a == 1)
					b1.and(b2);
				else
					b2.and(b1);
				break;
			case "OR":
				if (a == 1)
					b1.or(b2);
				else
					b2.or(b1);
				break;
			case "XOR":
				if (a == 1)
					b1.xor(b2);
				else
					b2.xor(b1);
				break;
			case "FLIP":
				if (a == 1)
					b1.flip(b);
				else
					b2.flip(b);
				break;
			case "SET":
				if (a == 1)
					b1.set(b);
				else
					b2.set(b);
				break;
			}
			System.out.println(b1.cardinality() + " " + b2.cardinality());
		}
		scan.close();
	}
}
