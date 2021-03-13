package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector v = new Vector();

		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}

		System.out.println(v);

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {
			Object obj = e.nextElement();
			Integer i = (Integer) obj;
			// System.out.println(i);
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
