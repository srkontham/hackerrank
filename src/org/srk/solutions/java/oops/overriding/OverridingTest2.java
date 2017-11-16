package org.srk.solutions.java.oops.overriding;

public class OverridingTest2 {
	public static void main(String[] args) {
		MotorCycle M = new MotorCycle();
	}
}

class BiCycle {
	String define_me() {
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle {
	String define_me() {
		return "a cycle with an engine.";
	}

	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am " + define_me());

		// String temp = define_me(); // Fix this line
		String temp = super.define_me(); // Fixed code

		System.out.println("My ancestor is a cycle who is " + temp);
	}

}