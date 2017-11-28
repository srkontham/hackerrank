package oops.interfaces;

import java.util.Scanner;

public class InterfaceTest {
	public static void main(String[] args) {
		MyCalculator my_calculator = new MyCalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(my_calculator.divisor_sum(n) + "\n");
		sc.close();
	}

	/*
	 * ImplementedInterfaceNames method takes an object and prints the name of the
	 * interfaces it implemented
	 */
	@SuppressWarnings("rawtypes")
	static void ImplementedInterfaceNames(Object o) {
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}
}

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

// Write your code here
class MyCalculator implements AdvancedArithmetic {
	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			sum = sum + ((n % i == 0) ? i : 0);
		}
		sum = sum + n;

		return sum;
	}
}
