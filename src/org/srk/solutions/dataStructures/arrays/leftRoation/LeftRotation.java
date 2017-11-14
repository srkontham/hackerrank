package org.srk.solutions.dataStructures.arrays.leftRoation;

import java.util.Scanner;

public class LeftRotation {
	static int[] leftRotation(int[] a, int d) {
		// Complete this function
		int size = a.length;
		int[] res = new int[size];

		for (int count = 0; count < size; count++) {
			int i = (count + d) % size;
			res[count] = a[i];
			// System.out.print(res[count] + " ");
		}
		// System.out.print("\n");
		return res;

		/*
		 * int size = a.length; int[] res = a;
		 * 
		 * if(d <= 0) return res; else{ for(int r=1; r<=d; r++){ int lastIndexValue =
		 * res[0]; for(int i=0; i<size; i++){ if(i == size-1) res[i] = lastIndexValue;
		 * else res[i] = res[i+1]; //System.out.print(res[i] + " "); }
		 * //System.out.print("\n"); } return res; }
		 */
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] result = leftRotation(a, d);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
