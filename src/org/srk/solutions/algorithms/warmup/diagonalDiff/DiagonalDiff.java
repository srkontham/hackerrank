package org.srk.solutions.algorithms.warmup.diagonalDiff;

import java.util.Scanner;

public class DiagonalDiff {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int d1 = 0, d2 = 0;
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			String s[] = str.trim().split("\\s+");

			int value1 = Integer.parseInt(s[i]);
			d1 = d1 + value1;
			int value2 = Integer.parseInt(s[n - 1 - i]);
			d2 = d2 + value2;
			
			/*for(int j=0; j < s.length; j++) { 
				if(j == i){ int value1 =
					Integer.parseInt(s[j]); 
					d1 = d1 + value1; 
					//System.out.println(value1); 
				}
				if(j == (s.length-1-i)){ 
					int value2 = Integer.parseInt(s[j]); 
					d2 = d2 + value2; 
					//System.out.println(value2); 
				} 
			}*/
 
		}
		System.out.println(Math.abs(d1 - d2));

		scan.close();
	}
}