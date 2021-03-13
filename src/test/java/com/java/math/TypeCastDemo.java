package com.java.math;

import java.io.IOException;

public class TypeCastDemo extends Child {

	int i = 20;
	String str = "Hiii";

	public static String m1() {
		// System.out.println("Child m2");
		return "Sub Child";
	}

	public static void main(String[] args) throws Exception {
		
		int i = 5;
		String s = Integer.toString(i);
		String s1 = String.valueOf(i);
		System.out.println(s);
		System.out.println(s1);
		
		int j = Integer.parseInt(s);
		System.out.println(j);
		
		

		//String s = new String("JAVA");
		//Object o = (Object) s;

		// System.out.println(o == s);

		TypeCastDemo c = new TypeCastDemo();
		// Parent p = new Parent();
		// c.m1();
		// c.m2();

		/*String prnt = ((Parent) c).m1();
		String chld = ((Child) c).m1();
		String sub = c.m1();

		System.out.println(prnt);
		System.out.println(chld);
		System.out.println(sub);*/
		
		/*double d =5.5;
		int i = (int)d;
		System.out.println(i);*/

	}
}

class Child extends Parent {
	public static String m1() {
		// System.out.println("Parent m1");
		return "Child";
	}
}

class Parent {
	public static String m1() {
		// System.out.println("Parent m1");
		return "Parent";
	}
}
