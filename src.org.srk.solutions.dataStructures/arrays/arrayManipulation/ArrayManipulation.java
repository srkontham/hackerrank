package arrays.arrayManipulation;

import java.util.Scanner;

public class ArrayManipulation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		long[] list = new long[n + 1];
		for (int i = 1; i <= n; i++)
			list[i] = 0;

		for (int a0 = 0; a0 < m; a0++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();

			list[a] += k;
			if (b < n)
				list[b + 1] -= k;
		}

		long max = 0, sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += list[i];
			// System.out.print(list[i]+" ");
			if (sum > max)
				max = sum;
		}
		System.out.println(max);
		in.close();
	}
}
