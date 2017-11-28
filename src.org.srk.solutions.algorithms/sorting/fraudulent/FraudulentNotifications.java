package sorting.fraudulent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FraudulentNotifications {

	static int activityNotifications(int[] expenditure, int d) {
		// Complete this function
		int notify = 0, n = expenditure.length;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < d; i++) {
			int num = expenditure[i];
			list.add(num);
		}
		Collections.sort(list);
		for (int i = d; i < n; i++) {
			int num = expenditure[i];
			if (num >= getMedium(list) * 2)
				notify++;
			replace(list, expenditure[i - d], num);
		}
		return notify;
	}

	private static void replace(List<Integer> list, int remove, int add) {
		if (remove == add)
			return;
		int i = Collections.binarySearch(list, remove);
		list.remove(i);
		i = Math.abs(Collections.binarySearch(list, add));
		if (i >= list.size())
			list.add(add);
		else
			list.add(i, add);
	}

	private static double getMedium(List<Integer> list) {
		int size = list.size();
		if (size % 2 == 0) {
			return (double) (list.get(size / 2 - 1) + list.get(size / 2)) / 2;
		} else {
			return list.get(size / 2);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] expenditure = new int[n];
		for (int expenditure_i = 0; expenditure_i < n; expenditure_i++) {
			expenditure[expenditure_i] = in.nextInt();
		}
		int result = activityNotifications(expenditure, d);
		System.out.println(result);
		in.close();
	}
	
}
