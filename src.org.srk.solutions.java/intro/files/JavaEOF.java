package intro.files;

import java.util.Scanner;

public class JavaEOF {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		for (int i = 1; scan.hasNext(); i++) {
			System.out.println(i + " " + scan.nextLine());
		}
		scan.close();
	}
}