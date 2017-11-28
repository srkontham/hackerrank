package org.srk.solutions.java.datastructures.javaCollections;

import java.util.Scanner;
import java.util.Stack;

@SuppressWarnings("unused")
public class JavaStack {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code
			while (input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length())
				;
			System.out.println(input.isEmpty());

			// Stack<Character> st = new Stack<>();
			// for (int i = 0; i < input.length(); i++) {
			// if (st.isEmpty()) {
			// st.push(input.charAt(i));
			// } else {
			// switch (input.charAt(i)) {
			// case '}':
			// if (st.peek() == '{') {
			// st.pop();
			// }
			// break;
			// case ']':
			// if (st.peek() == '[') {
			// st.pop();
			// }
			// break;
			// case ')':
			// if (st.peek() == '(') {
			// st.pop();
			// }
			// break;
			// default:
			// st.push(input.charAt(i));
			// }
			// }
			// }
			// System.out.println(st.isEmpty());

		}
		sc.close();
	}
}
