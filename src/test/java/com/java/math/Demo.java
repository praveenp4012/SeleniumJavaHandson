package com.java.math;

abstract class Test {

	public Test() {
		// this.testMethod();
		System.out.println("Parent Constructor ");
	}

	public int getNum(int i) {
		return i;
	}

	// public abstract void getVal();
}

public class Demo extends Test {

	public static void main(String[] args) {
		// Test t = new Demo();
		Demo d = new Demo();
		//Test t = new Test();
		Test t1 = new Demo();

	}

	public Demo() {
		// super();
		System.out.println("Child Constructor ");
	}
}