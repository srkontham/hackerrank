package datastructures.javaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			intList.add(scan.nextInt());
		}

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			String query = scan.next();
			if (query.equalsIgnoreCase("Insert")) {
				int index = scan.nextInt();
				int value = scan.nextInt();
				intList.add(index, value);
			}
			if (query.equalsIgnoreCase("Delete")) {
				int index = scan.nextInt();
				// System.out.println("Index: " + index);
				// System.out.println(intList.remove(index));
				intList.remove(index);
			}
		}

		for (int value : intList) {
			System.out.print(value + " ");
		}
		scan.close();
	}
}
