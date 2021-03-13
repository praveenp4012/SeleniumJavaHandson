package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("");
		//System.out.println(ts);

		ts.add("Red");
		ts.add("Green");
		ts.add("Blue");
		ts.add("White");
		ts.add("Orange");
		ts.add("");

		System.out.println(ts);
		System.out.println(ts.size());

		// List<String> li = new ArrayList<String>(ts);

		TreeSet<String> ts1 = new TreeSet<String>();

		ts1.add("Red");
		ts1.add("Green");
		ts1.add("Blue");
		ts1.add("WWhite");
		ts1.add("OOrange");

		for (String tss : ts) {
			System.out.println(ts1.contains(tss) ? "YES" : "NO");
		}

		TreeSet<Integer> ts2 = new TreeSet<Integer>();

		ts2.add(1);
		ts2.add(2);
		ts2.add(3);
		ts2.add(5);
		ts2.add(9);

		Iterator<Integer> itr = ts2.headSet(3).iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("======");

		Iterator<Integer> itr2 = ts2.tailSet(3).iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("======");

		System.out.println(ts2.ceiling(11));
		System.out.println(ts2.floor(3));

		System.out.println("======");

		System.out.println(ts2.lower(3));
		System.out.println(ts2.higher(3));
		
		System.out.println("======");
		
		TreeSet t = new TreeSet();
		
		t.add(new StringBuffer("AA"));
		t.add(new StringBuffer("BB"));
		System.out.println(t);
		

		// ts1.addAll(ts);
		// System.out.println(ts1);

		/*
		 * System.out.println("Treeset to ArrayList: " + li); Collections.reverse(li);
		 * System.out.println("After Reversing: " + li);
		 */

		/*
		 * Iterator<String> itr = ts.iterator();
		 * 
		 * while (itr.hasNext()) { System.out.println(itr.next()); }
		 */
	}

}
