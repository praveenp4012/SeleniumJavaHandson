package com.java.math;

import java.io.IOException;

class ParentClass {
	
	int i=10;
	String str = "Hello";

	public  int m1() throws Exception {
		// System.out.println("Parent m1");
		return 10;
	}

	public void m1(int i) {
		System.out.println("Parent m1 with arg");
	}

}

public class PolymorphDemo extends ParentClass {
	
	int i=20;
	String str = "Hiii";

	public  void m2(float i) {
		System.out.println("Child m2 with float arg");
		//return 20;
	}
	
	public  void m2(String s) {
		System.out.println("Child m2 with string arg");
		//return 20;
	}

	public static void main(String[] args) throws Exception {
		PolymorphDemo c1 = new PolymorphDemo();
		c1.m2(10L);

		//ParentClass p1 = new ParentClass();
		//System.out.println(p1.m1());

		//ParentClass c2 = new PolymorphDemo();
		//c2.m1(5);
		//System.out.println(c2.i);
		//System.out.println(c2.str);
	}
}