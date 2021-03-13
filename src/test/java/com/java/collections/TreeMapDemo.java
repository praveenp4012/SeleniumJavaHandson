package com.java.collections;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(null, "iam");
		
		tm.put(2, "Hello");
		tm.put(3, "Where");
		tm.put(1, "Hi");
		tm.put(6, "You");
		tm.put(5, "Are");
	//	tm.put(null, "iam");
		
		System.out.println(tm);

		// System.out.println(tm.firstEntry());
		// System.out.println(tm.lastEntry());
		// System.out.println(tm.firstKey());
		// System.out.println(tm.lastKey());

		// System.out.println("===");

		/*
		 * System.out.println(tm.headMap(4)); System.out.println(tm.tailMap(4));
		 * 
		 * System.out.println("===");
		 * 
		 * System.out.println(tm.ceilingEntry(3)); System.out.println(tm.ceilingKey(3));
		 * 
		 * System.out.println("===");
		 * 
		 * System.out.println(tm.floorEntry(4)); System.out.println(tm.floorKey(4));
		 */

		/*
		 * System.out.println("===");
		 * 
		 * System.out.println(tm.higherEntry(3)); System.out.println(tm.higherKey(3));
		 * 
		 * System.out.println("===");
		 * 
		 * System.out.println(tm.lowerEntry(3)); System.out.println(tm.lowerKey(3));
		 */

		/*System.out.println(tm.pollFirstEntry());
		System.out.println(tm);

		System.out.println(tm.pollLastEntry());
		System.out.println(tm);
*/		
		
		SortedMap sm = tm.subMap(2,true,5,true);
		System.out.println(sm);

		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>();

		tm1.put(6, "Red");
		tm1.put(7, "Green");
		tm1.put(8, "Blue");
		tm1.put(9, "White");
		tm1.put(10, "Black");

		// System.out.println(tm);
		// System.out.println(tm1);

	}

}
