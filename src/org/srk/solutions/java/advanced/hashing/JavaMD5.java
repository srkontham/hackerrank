package org.srk.solutions.java.advanced.hashing;

import java.util.Scanner;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

public class JavaMD5 {
	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.next();
		sc.close();
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			System.out.println(DatatypeConverter.printHexBinary(md.digest()).toLowerCase());
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
