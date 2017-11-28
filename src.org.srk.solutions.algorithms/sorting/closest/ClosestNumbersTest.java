package sorting.closest;

import java.util.Arrays;

class ClosestNumbers {
	public String absoluteDifference(int[] arr) {

		int minDiff = Integer.MAX_VALUE;
		StringBuilder absDiffNums = new StringBuilder("");
		for (int i = 0; i < arr.length - 1; i++) {
			int diff = Math.abs(arr[i+1] - arr[i]);
			if (diff < minDiff) {
				// System.out.println("Diff: " + diff);
				minDiff = diff;
				absDiffNums.setLength(0);
				absDiffNums.append(arr[i] + " " + arr[i+1]);
			} else if (diff == minDiff) {
				absDiffNums.append(" " + arr[i] + " " + arr[i+1]);
			}
		}
		return absDiffNums.toString();
	}
}

public class ClosestNumbersTest {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. */
		// Scanner scan = new Scanner(System.in);
		// int size = scan.nextInt();
		// int arr[] = new int[size];
		// for (int i = 0; i < size; i++)
		// arr[i] = scan.nextInt();
		// scan.close();

		// int arr[] = { 1, 3, 9, 8, 2, 7, 5 };
		int arr[] = { -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854 };
		Arrays.sort(arr);
		ClosestNumbers cn = new ClosestNumbers();
		String absDiffNums = cn.absoluteDifference(arr);

		System.out.println(absDiffNums);
	}

}
