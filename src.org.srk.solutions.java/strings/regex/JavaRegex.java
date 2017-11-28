package strings.regex;

import java.util.Scanner;

public class JavaRegex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		in.close();
	}
}

// Write your code here
class MyRegex {
	String pattern = "^(?:(?:[01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.){3}(?:[01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])$";
}