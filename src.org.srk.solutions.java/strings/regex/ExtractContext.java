package org.srk.solutions.java.strings.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractContext {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();

			// Write your code here
			boolean matchFound = false;
			Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
			Matcher m = p.matcher(line);
			while (m.find()) {
				System.out.println(m.group(2));
				matchFound = true;
			}
			if (!matchFound) {
				System.out.println("None");
			}

			testCases--;
		}
		in.close();
	}
}