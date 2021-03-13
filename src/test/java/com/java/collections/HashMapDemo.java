package com.java.collections;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(null, "Start");
		hm.put(1, "Hi");
		hm.put(2, "Hello");
		hm.put(3, "Where");
		hm.put(4, "Are");
		hm.put(5, "Hi");
		hm.put(null, "End");
		
		System.out.println(hm);

		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

		hm1.put(6, "Red");
		hm1.put(7, "Green");
		hm1.put(8, "Blue");
		hm1.put(9, "White");
		hm1.put(10, "Black");

		//System.out.println(hm);

		hm.replace(2, "Helloo");
		//System.out.println(hm);

		hm.replace(2, "Helloo", "Heellooo");
		//System.out.println(hm);

		//System.out.println(hm.size());

		for (Map.Entry me : hm.entrySet()) {
			System.out.println(me.getKey() + " && " + me.getValue());
		}

		// hm1.putAll(hm);
		// System.out.println(hm1);

		// hm1.clear();
		// System.out.println(hm1);

		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

		hm2 = (HashMap) hm1.clone();
		//System.out.println(hm2);

		System.out.println(hm1.containsKey(1));
		//System.out.println(hm1.containsKey(7));
		//System.out.println(hm1.containsValue("Green"));
		//System.out.println(hm1.containsValue("Violet"));

		System.out.println("======");
		
		Set set = hm1.entrySet();
		System.out.println(set);
		
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.println("\n");
		System.out.println("======");
		
		Set set1 = hm1.keySet();
		System.out.println(set1);
		
		Iterator itr1 = set1.iterator();		
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");
		}
		
		System.out.println("\n");
		System.out.println("======");
		
		Collection c = hm1.values();
		System.out.println(c);	
		
		Iterator itr2 = c.iterator();		
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}
		
		//System.out.println(hm1.get(7));

	}

}
