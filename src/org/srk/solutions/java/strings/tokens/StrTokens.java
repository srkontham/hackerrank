package org.srk.solutions.java.strings.tokens;

import java.util.Scanner;

public class StrTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		if (!scan.hasNext()) {
			System.out.println(0);
		} else {
			String s = scan.nextLine().trim();
			// Split the string into valid tokens
			String[] strings = s.split("[  !,?._'@]+");

			// Print number of tokens
			System.out.println(strings.length);

			// Print each token
			for (String str : strings)
				System.out.println(str);
		}
		scan.close();
	}
}