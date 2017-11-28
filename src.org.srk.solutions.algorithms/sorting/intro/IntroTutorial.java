package sorting.intro;

import java.util.Scanner;

public class IntroTutorial {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. 
		 */
		Scanner in = new Scanner(System.in);
		int ele = in.nextInt();
		int nbr = in.nextInt();
		int[] array = new int[nbr];
		for (int i = 0; i < nbr; i++) {
			array[i] = in.nextInt();
			if (array[i] == ele)
				System.out.println(i);
		}
		in.close();
	}
}
