package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		for (int i = 0; i < 10; i++) {
			al.add(i);
		}

		System.out.println(al);

		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			Object obj = itr.next();
			Integer i = (Integer) obj;
			// System.out.println(i);

			if (i % 2 != 0) {
				itr.remove();
			}

			//System.out.println(i);
		}
		
		System.out.println(al);

	}

}
