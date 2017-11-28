package org.srk.solutions.java.bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		in.close();
		// Write your code here.
		System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
	}
}
