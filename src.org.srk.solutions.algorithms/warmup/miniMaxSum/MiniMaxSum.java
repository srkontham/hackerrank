package warmup.miniMaxSum;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		long sum[] = new long[5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i != j)
					sum[i] = sum[i] + arr[j];
			}
		}

		long min = sum[0], max = sum[0];
		for (int i = 1; i < 5; i++) {
			if (min > sum[i])
				min = sum[i];
			if (max < sum[i])
				max = sum[i];
		}

		System.out.println(min + " " + max);
		
		in.close();
	}
}