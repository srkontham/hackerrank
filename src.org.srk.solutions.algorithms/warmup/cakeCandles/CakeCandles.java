package warmup.cakeCandles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CakeCandles {
	static int birthdayCakeCandles(int n, int[] ar) {
		// Complete this function
		Map<Integer, Integer> candles = new HashMap<Integer, Integer>();
		int max = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			if (max < ar[i])
				max = ar[i];
			if (candles.containsKey((Integer) ar[i])) {
				count = candles.get(ar[i]);
				candles.put(ar[i], ++count);
			} else {
				candles.put(ar[i], ++count);
			}
		}

		return candles.get(max);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
		
		in.close();
	}
}
