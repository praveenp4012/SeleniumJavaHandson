package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CollectionDemo {

	@Test
	public void arrayListTraverse() {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("111");
		ar.add("AAA");
		ar.add("B");
		ar.add("222.222");

		for (String i : ar) {
			System.out.println(i);

		}

		Assert.assertTrue(ar.contains("111"));

		System.out.println(ar);
		ar.add(1, "BBB");
		System.out.println(ar);
		ar.remove(0);
		System.out.println(ar);
		ar.remove("BBB");
		System.out.println(ar);
	}

	@Test
	public void arrayListToArray() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("111");
		arr.add("AAA");
		arr.add("B");
		arr.add("222.222");

		String[] str = new String[arr.size()];

		for (int i = 0; i < arr.size(); i++) {
			str[i] = arr.get(i);
		}

		for (String str1 : str) {
			System.out.println(str1);
		}
	}

	@Test
	public void arrayListToArray1() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("111");
		arr.add("AAA");
		arr.add("B");
		arr.add("222.222");

		// Object[] str = arr.toArray();
		String[] str = arr.toArray(new String[arr.size()]);

		for (Object str1 : str) {
			System.out.println(str1);
		}
	}

	@Test
	public void linkedListToArrayList() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("111");
		list.add("AAA");
		list.add("B");
		list.add("222.222");

		for (String str : list) {
			System.out.print(str + " ");
		}

		System.out.println(" ");

		List<String> arr = new ArrayList<String>(list);

		for (String str : arr) {
			System.out.print(str + " ");
		}
	}

	@Test
	public void hashSetToArray() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("111");
		hashSet.add("AAA");
		hashSet.add("B");
		hashSet.add("222.222");

		for (String str : hashSet) {
			System.out.print(str + " ");
		}

		System.out.println(" ");

		// Object[] obj = hashSet.toArray();
		String[] str = new String[hashSet.size()];
		hashSet.toArray(str);

		for (String str1 : str) {
			System.out.print(str1 + " ");
		}
	}

	@Test
	public void reverseArrayList() {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("111");
		ar.add("AAA");
		ar.add("B");
		ar.add("222.222");

		LinkedList<String> li = new LinkedList<String>();
		li.add("111");
		li.add("AAA");
		li.add("B");
		li.add("222.222");

		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);

		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);

	}

	@Test
	public void treeMapIterator() {
		TreeMap<String, String> tmap = new TreeMap<String, String>();

		tmap.put("1", "AAA");
		tmap.put("2", "BBB");
		tmap.put("3", "CCC");

		Set set = tmap.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry pair = (Map.Entry) itr.next();
			System.out.println(pair.getKey() + "&&" + pair.getValue());

		}

	}

	@Test
	public void hashSetIterator() {

		HashSet<Object> hs = new HashSet<Object>();
		hs.add("Hello");
		hs.add("123");
		hs.add("Where");
		hs.add("456");

		boolean b = hs.contains("124");
		System.out.println(b);

		Iterator<Object> itr = hs.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("=========");

		HashSet<Object> hs1 = new HashSet<Object>();
		hs1.add("Hello");
		hs1.add("123");
		hs1.add("Where");
		hs1.add("456");

		for (Object hs2 : hs1) {
			System.out.println(hs2);
		}
	}

	@Test
	public void hashMapDemo() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "AAA");
		hm.put(2, "BBB");
		hm.put(3, "CCC");
		hm.put(8, "DDD");

		// System.out.println(hm);

		// hm.keySet();
		for (Integer i : hm.keySet()) {
			System.out.print(i + " ");
		}
		System.out.println("");

		for (String str : hm.values()) {
			System.out.print(str + " ");
		}

		System.out.println(" ");

		for (Integer j : hm.keySet()) {
			System.out.println("Key: " + j + " Value: " + hm.get(j) + " ");
		}

		Set<Integer> setHm = hm.keySet();
		Iterator<Integer> itr = setHm.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println("Key: " + i + " Value: " + hm.get(i) + " ");
		}

		Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();

		for (Map.Entry entry : entrySet) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue() + " ");
		}
	}

	@Test
	public void hashMapDemo1() {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		TreeMap treeMap = new TreeMap();

		Set set = hm.entrySet();
		// set.s

	}

	@Test
	public void listCollections() {

		List<String> li = new ArrayList<String>();
		li.add("Hello");
		li.add("123");
		li.add("Where");
		li.add("456");

		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);

	}

	@Test
	public void strArrToList() {

		String[] str = { "Hi", "Hello", "Where" };
		System.out.println(str);

		List li = Arrays.asList(str);
		System.out.println(li);

		li.add("What");

		/*
		 * li.add("Hello"); li.add("123"); li.add("Where"); li.add("456");
		 */

		System.out.println(li);

	}
	
	@Test
	public void arrayTypeSafety() {
		String[] str = new String[4];
		
		//str[0] = new Integer[10];
		System.out.println(str[0]);
	}
	
	@Test
	public void failFastExample() {
		// Concurrent modification Exception
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "AAA");
		hm.put(2, "BBB");
		hm.put(3, "CCC");
		hm.put(8, "DDD");
		
		Iterator itr = hm.keySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(hm.get(itr.next()));
			hm.put(9, "PPP");
		}
		
	}
	
	@Test
	public void failSafeExample() {
		// No Concurrent modification Exception
		ConcurrentHashMap<Integer, String> hm = new ConcurrentHashMap<Integer, String>();
		hm.put(1, "AAA");
		hm.put(2, "BBB");
		hm.put(3, "CCC");
		hm.put(8, "DDD");
		
		Iterator itr = hm.keySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(hm.get(itr.next()));
			hm.put(9, "PPP");
		}
		
	}


}
