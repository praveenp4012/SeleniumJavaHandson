package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator li = v.listIterator();

		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(li.getClass().getName());

	}

}
