package datastructures.javaCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * Create the Student and Priorities classes here.
 */
class StudentPQ {
	private int id;
	private String name;
	private double cgpa;

	StudentPQ(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getID() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getCGPA() {
		return this.cgpa;
	}
}

class Priorities {
	List<StudentPQ> getStudents(List<String> events) {
		
//		PriorityQueue<StudentPQ> pque = new PriorityQueue<StudentPQ>(events.size(), new Comparator<StudentPQ>() {
//			@Override
//			public int compare(StudentPQ s1, StudentPQ s2) {
//				if (s1.getCGPA() == s2.getCGPA()) {
//					if (s1.getName().equals(s2.getName())) {
//						return Integer.compare(s2.getID(), s1.getID());
//					} else {
//						return s1.getName().compareTo(s2.getName());
//					}
//				}
//				return Double.compare(s2.getCGPA(), s1.getCGPA());
//			}
//		});
		
		PriorityQueue<StudentPQ> pque = new PriorityQueue<>(events.size(), new CheckerPQ());
		
		for (String str : events) {
			Scanner s = new Scanner(str);
			String event = s.next();

			if (event.equals("ENTER")) {
				String name = s.next();
				double cgpa = s.nextDouble();
				int id = s.nextInt();
				// System.out.printf("%-8s \t %4.2f \t %2d\n", name, cgpa, id);
				pque.add(new StudentPQ(id, name, cgpa));
			}

			if (event.equals("SERVED")) {
				if (!pque.isEmpty())
					pque.poll();
			}
			s.close();
		}

		List<StudentPQ> students = new ArrayList<>();
		while (!pque.isEmpty()) {
			students.add(pque.poll());
		}
		
		return students;
	}
}

class CheckerPQ implements Comparator<StudentPQ> {
	@Override
	public int compare(StudentPQ s1, StudentPQ s2) {
		if (s1.getCGPA() == s2.getCGPA()) {
			if (s1.getName().equals(s2.getName())) {
				return Integer.compare(s2.getID(), s1.getID());
			} else {
				return s1.getName().compareTo(s2.getName());
			}
		}
		return Double.compare(s2.getCGPA(), s1.getCGPA());
	}
}

public class JavaPriorityQueue {

	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<StudentPQ> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (StudentPQ st : students) {
				System.out.println(st.getName());
			}
		}
	}
}
