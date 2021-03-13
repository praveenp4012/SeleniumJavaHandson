package com.java.collections;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();

		hs.add("Hi");
		hs.add("Hello");
		hs.add("Where");
		hs.add("are");
		hs.add("you");
		System.out.println(hs);

		/*Set<String> ts = new TreeSet<String>(hs);
		List<String> al = new ArrayList<String>(hs);
		String[] strArr = new String[hs.size()];

		System.out.println(ts);
		System.out.println(al);
		hs.toArray(strArr);

		for (String str : strArr) {
			System.out.println(str);
		}*/
		
		Set<String> hs1 = new HashSet<String>();

		hs1.add("Hi");
		hs1.add("Hello");
		hs1.add("Where");
		hs1.add("aree");
		hs1.add("youu");
		System.out.println(hs1);
		
		hs.retainAll(hs1);
		System.out.println(hs);

		Set<String> hs2 = new HashSet<String>();
		
		for(String hss: hs) {
			if(hs1.contains(hss)) {
				System.out.println(hss);
			}
			
		}
		
		hs1.removeAll(hs1);
		System.out.println(hs1);
		
		//System.out.println(hs2);
	}

}
