package org.srk.solutions.java.intro.stdInOut;

import java.util.Scanner;

public class StdInOutTwo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();

		// Write your code here.
		double d = scan.nextDouble();
		String s = "";
		while (scan.hasNextLine()) {
			s = scan.nextLine();
		}
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		scan.close();
	}
}
