package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

	String name;
	int roll;
	int age;

	Student(String name, int roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
	}

	public int compareTo(Student st) {

		if (roll == st.roll)
			return 0;
		if (roll < st.roll)
			return -1;

		return 1;

	}

}

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();

		al.add(new Student("King", 101, 24));
		al.add(new Student("John", 102, 19));
		al.add(new Student("Charan", 103, 25));

		Collections.sort(al);

		for (Student s : al) {
			System.out.println(s.name + " " + s.roll + " " + s.age);
		}
	}
}
