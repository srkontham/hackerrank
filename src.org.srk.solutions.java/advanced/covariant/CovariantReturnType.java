package advanced.covariant;

import java.util.Scanner;

class Flower {

	public String whatsYourName() {
		return "I have many names and types.";
	}
}

class Jasmine extends Flower {
	@Override
	public String whatsYourName() {
		return "Jasmine";
	}
}

class Lily extends Flower {
	@Override
	public String whatsYourName() {
		return "Lily";
	}
}

class Lotus extends Flower {
	@Override
	public String whatsYourName() {
		return "Lotus";
	}
}

class State {
	Flower yourNationalFlower() {
		return new Flower();
	}
}

class WestBengal extends State {
	@Override
	Jasmine yourNationalFlower() {
		return new Jasmine();
	}
}

class Karnataka extends State {
	@Override
	Lotus yourNationalFlower() {
		return new Lotus();
	}
}

class AndhraPradesh extends State {
	@Override
	Lily yourNationalFlower() {
		return new Lily();
	}
}

// Main Class
public class CovariantReturnType {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		System.out.print("Enter Class Name of State : ");
		Scanner sc = new Scanner(System.in);
		String className = sc.next();

		StringBuilder sb = new StringBuilder();
		sb.append("org.srk.solutions.java.advanced.covariant.");
		sb.append(className);

		State state = (State) Class.forName(sb.toString()).newInstance();
		Flower flower = state.yourNationalFlower();
		System.out.println(flower.whatsYourName());

		sc.close();
	}
}
