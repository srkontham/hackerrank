package bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner s = new Scanner(System.in);
		BigInteger a = new BigInteger(s.nextLine());
		BigInteger b = new BigInteger(s.nextLine());
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		s.close();
	}
}
