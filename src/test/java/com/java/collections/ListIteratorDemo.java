package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add("Hi");
		al.add("Hello");
		al.add("Where");

		System.out.println(al);

		ListIterator itr = al.listIterator();

		while (itr.hasNext()) {
			//String str = (String)itr.next();
			//Integer i = (Integer) obj;
			//System.out.println(str);
			int i = itr.nextIndex();
			String s = (String)itr.next();
			System.out.println(i + " && " + s);
		}
		
		itr.add("are");
		System.out.println(al);
		
		while(itr.hasPrevious()) {
			//System.out.println(itr.previous());
			
			int i = itr.previousIndex();
			String s = (String)itr.previous();
			System.out.println(i + " && " + s);
		}
		
		itr.set("go");;
		System.out.println(al);

		//System.out.println(al);

	}

}
