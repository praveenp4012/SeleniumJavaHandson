package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {

	String name;
	int id;
	int age;

	Employee(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
}

class NameComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}

class IdComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		if (e1.id == e2.id)
			return 0;
		if (e1.id < e2.id)
			return -1;

		return 1;
	}

}

class AgeComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		if (e1.age == e2.age)
			return 0;
		if (e1.age < e2.age)
			return -1;

		return 1;
	}

}

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee("King", 105, 24));
		al.add(new Employee("John", 101, 19));
		al.add(new Employee("Charan", 103, 25));

		NameComparator nameC = new NameComparator();
		IdComparator idC = new IdComparator();
		AgeComparator ageC = new AgeComparator();

		System.out.println("Sorting based on Name: ");
		Collections.sort(al, nameC);

		for (Employee e : al) {
			System.out.println(e.name + " " + e.id + " " + e.age);
		}

		System.out.println("==========");

		System.out.println("Sorting based on ID: ");
		Collections.sort(al, idC);

		for (Employee e : al) {
			System.out.println(e.name + " " + e.id + " " + e.age);
		}

		System.out.println("==========");

		System.out.println("Sorting based on Age: ");
		Collections.sort(al, ageC);

		for (Employee e : al) {
			System.out.println(e.name + " " + e.id + " " + e.age);
		}
	}
}
