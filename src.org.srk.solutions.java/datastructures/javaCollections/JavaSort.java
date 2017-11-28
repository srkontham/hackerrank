package datastructures.javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

// Complete the code - Using Comparable
class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		double cgpa1 = s1.getCgpa();
		double cgpa2 = s2.getCgpa();

		if (Math.abs(cgpa1 - cgpa2) < .00000001) {
			int fnameCom = s1.getFname().compareTo(s2.getFname());
			if (fnameCom == 0) {
				return s1.getId() - s2.getId();
			}
			return fnameCom;
		}

		return (cgpa1 < cgpa2) ? 1 : (cgpa1 > cgpa2 ? -1 : 0);
	}

}

public class JavaSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		// Complete the code - using Comparator
		// Collections.sort(studentList, new Comparator<Student>() {
		// public int compare(Student s1, Student s2) {
		// if (s1.getCgpa() == s2.getCgpa()) {
		// if (s1.getFname().equals(s2.getFname()))
		// return s1.getId() - s2.getId();
		// else
		// return s1.getFname().compareTo(s2.getFname());
		// } else {
		// return ((double) (s2.getCgpa() - s1.getCgpa()) < 0) ? -1 : 1;
		// }
		// }
		// });
		
		Collections.sort(studentList, new StudentComparator());
		
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}

		in.close();
	}
}
