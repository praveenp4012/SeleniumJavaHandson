package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<String> li = new LinkedList<String>();

		li.add("Hi");
		li.add("Hello");
		li.add("Where");
		li.add("are");
		li.add("you");
		System.out.println(li);

		// Collections.reverse(li);
		// System.out.println(li);
		// Iterator itr = li.listIterator(2);
		
		/*li.add(1, "Which");
		System.out.println(li);
		li.add(0, "First");
		li.add(li.size(), "last");
		System.out.println(li);
		// li.addFirst();
		li.set(1, "PRVN");
		System.out.println(li);*/
		
		List<String> al = new ArrayList<String>(li);		
		System.out.println(al);		
		
		System.out.println("=============");
		
		List<String> al1 = new ArrayList<String>();
		al1.add("Hi");
		al1.add("Hello");
		al1.add("Where");
		al1.add("are");
		al1.add("you");
		System.out.println(al1);
		
		List<String> li1 = new LinkedList<String>(al1);		
		System.out.println(li1);
		
		
	/*	//((LinkedList<String>) li).pop();
		System.out.println(((LinkedList<String>) li).pop());
		System.out.println("After POP: " +li);*/
		
		/*List<String> newLi = new LinkedList<String>();
		newLi = (List<String>) ((LinkedList) li).clone();
		System.out.println("Clone: " + newLi);*/
		
		/*List<String> li1 = new LinkedList<String>();
		li1.add("New1");
		li1.add("New2");
		
		List<String> li2 = new LinkedList<String>();*/
		
		/*li.addAll(li1);
		System.out.println(li);
		
		li.addAll(3, li1);
		System.out.println(li);*/
		
		/*for(int i=0;i<li.size();i++) {
			System.out.println("Element at the index " + i + " is: " + li.get(i));
		}
		
		System.out.println(li.remove(0));
		System.out.println(li);*/
		
		//li.clear();
		
		//System.out.println(li);
		
		/*Collections.swap(li, 0, 1);
		System.out.println(li);
		
		Collections.shuffle(li);
		System.out.println(li);
		
		li2.addAll(li);
		li2.addAll(li1);
		
		System.out.println(li2);*/

		/*
		 * while (itr.hasNext()) { System.out.println(itr.next()); //
		 * itr.equals("Hello"); }
		 */

	}

}
