package org.srk.solutions.java.oops.inheritance;

public class InteritanceTest1 {

	public static void main(String args[]) {

		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

	}
}

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}

	void sing() {
		System.out.println("I am singing");
	}
}
