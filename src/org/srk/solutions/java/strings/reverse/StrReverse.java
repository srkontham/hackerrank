package org.srk.solutions.java.strings.reverse;

import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		boolean isPalindrome = true;

		for (int i = 0; i < (int) A.length() / 2; i++) {
			if (A.charAt(i) != A.charAt(A.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		System.out.println(isPalindrome ? "Yes" : "No");
		sc.close();
	}
}