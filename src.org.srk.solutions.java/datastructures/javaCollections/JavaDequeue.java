package datastructures.javaCollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaDequeue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();

		int max = Integer.MIN_VALUE;
		Set<Integer> dequeSet = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
			dequeSet.add(num);
			if (deque.size() == m) {
				max = Math.max(dequeSet.size(), max);
				int ele = (int) deque.removeFirst();
				if (!deque.contains(ele))
					dequeSet.remove(ele);
			}
		}
		System.out.println(max);
		in.close();
	}
}
