package com.java.collections;

import java.util.*;

public class IdentityHashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		hm.put(i1, "AAA");
		hm.put(i2, "BBB");

		System.out.println(hm);
		System.out.println("===========");

		IdentityHashMap<Integer, String> ihm = new IdentityHashMap<Integer, String>();

		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);

		ihm.put(i3, "AAA");
		ihm.put(i4, "BBB");

		System.out.println(ihm);

	}

}
