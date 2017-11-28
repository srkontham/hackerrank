package warmup.plusMinus;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = scan.nextInt();
		}

		int pCount = 0, nCount = 0, zCount = 0;

		for (int i = 0; i < n; i++) {
			if (nums[i] > 0)
				pCount++;
			else if (nums[i] < 0)
				nCount++;
			else
				zCount++;
		}

		System.out.printf("%.6f \n%.6f \n%.6f", pCount / (double) n, nCount / (double) n, zCount / (double) n);

		scan.close();
	}
}