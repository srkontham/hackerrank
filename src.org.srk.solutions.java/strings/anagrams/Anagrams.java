package strings.anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		if (a.length() != b.length())
			return false;
		else {
			char aArray[] = a.toLowerCase().toCharArray();
			char bArray[] = b.toLowerCase().toCharArray();
			Arrays.sort(aArray);
			Arrays.sort(bArray);

			if (String.valueOf(aArray).equals(String.valueOf(bArray)))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
