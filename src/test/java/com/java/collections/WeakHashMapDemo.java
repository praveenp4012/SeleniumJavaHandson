package com.java.collections;

import java.util.*;

class Temp {

}

public class WeakHashMapDemo {

	public static void main(String[] args) {

		//HashMap hm = new HashMap(); // HM dominates GC hence GC will not be called
		WeakHashMap hm = new WeakHashMap(); // GC dominates WHM hence it will be called
		Temp t = new Temp();

		hm.put(t, "Java");
		System.out.println(hm);

		t = null;
		System.gc();
		System.out.println(hm);
	}

	public String toString() {
		return "temp";
	}

	public void finalize() {
		System.out.println("Finalize Method");
	}

}
