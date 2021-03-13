package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		List<String> li1 = new ArrayList<String>();

		li1.add("Java");
		li1.add("Csharp");
		li1.add("Python");
		li1.add("Java");
		li1.add("Pythontest");
		li1.add("");

		Collections.sort(li1);
		System.out.println(li1);
		Collections.reverse(li1);
		System.out.println(li1);

		List<String> li11 = li1.subList(0, 2);
		System.out.println(li11);

		List<String> li2 = new ArrayList<String>();

		li2.add("Java");

		li1.removeAll(li2);

		for (String str : li1) {
			System.out.print(str + " ");
		}

	}

}
