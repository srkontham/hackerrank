package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		try {
			int x = new Integer(sc.nextInt());
			int y = new Integer(sc.nextInt());
			System.out.println("" + (x / y));
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}