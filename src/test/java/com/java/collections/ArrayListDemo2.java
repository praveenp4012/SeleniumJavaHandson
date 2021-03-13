package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class ArrayListDemo2 {

	@Test
	public void compareArrayLists() {

		List<String> li1 = new ArrayList<String>();

		li1.add("Java");
		li1.add("Csharp");
		li1.add("Python");
		li1.add("Pythontest");

		List<String> li2 = new ArrayList<String>();

		li2.add("Dotnet");
		li2.add("Pearl");
		li2.add("Ruby");
		li2.add("Csharp");

		List<String> li3 = new ArrayList<String>();

		for (String str : li2) {
			li3.add(li1.contains(str) ? "Yes" : "No");
		}

		System.out.println(li3);

	}

	@Test
	public void swapInArrayList() {

		List<String> li1 = new ArrayList<String>();

		li1.add("Java");
		li1.add("Csharp");
		li1.add("Python");
		li1.add("Pythontest");

		System.out.println(li1);

		Collections.swap(li1, 1, 3);

		System.out.println(li1);

	}

	@Test
	public void joinArrayLists() {

		List<String> li1 = new ArrayList<String>();
		li1.add("Java");
		li1.add("Csharp");
		li1.add("Python");
		li1.add("Pythontest");
		System.out.println(li1);

		List<String> li2 = new ArrayList<String>();
		li2.add("Java");
		li2.add("Pearl");
		li2.add("Ruby");
		li2.add("Python");
		System.out.println(li2);

		List<String> li3 = new ArrayList<String>();
		li3.addAll(li1);
		li3.addAll(li2);
		System.out.println(li3);

	}

	@Test
	public void emptyArrayList() {

		List<String> li1 = new ArrayList<String>();
		System.out.println(li1.size());
		li1.add("Java");
		li1.add("Csharp");
		li1.add("Python");
		li1.add("Pythontest");
		System.out.println(li1);

		System.out.println(li1.size());

		// Collections.emptyList(li1);
		li1.removeAll(li1);
		System.out.println(li1);

	}

	@Test
	public void printArrayList() {

		List<String> li1 = new ArrayList<String>();
		System.out.println(li1.size());
		li1.add("Java");
		li1.add("Csharp");
		li1.add("Python");
		li1.add("Pythontest");
		System.out.println(li1);

		for (int i = 0; i < li1.size(); i++) {
			System.out.println(li1.get(i));
		}

	}

}
