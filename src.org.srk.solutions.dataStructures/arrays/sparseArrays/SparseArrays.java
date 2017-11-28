package arrays.sparseArrays;

import java.util.Scanner;

public class SparseArrays {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = scan.nextLine();
		}

		int q = Integer.parseInt(scan.nextLine());
		String[] qry = new String[q];
		for (int i = 0; i < q; i++) {
			qry[i] = scan.nextLine();
		}

		for (int i = 0; i < q; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (qry[i].equals(str[j]))
					count++;
			}
			System.out.println(count);
		}
		scan.close();
	}
}