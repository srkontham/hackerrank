package org.srk.solutions.java.intro.staticBlock;

import java.util.Scanner;

public class StaticInitializer {
	// Write your code here
	private static boolean flag = true;
	private static int B;
	private static int H;

	static {
		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		} else
			flag = true;
		scan.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class