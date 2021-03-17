package com.java.handson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class GarbageCDemo {

	// to store object name
	String obj_name;

	public GarbageCDemo(String obj_name) {
		this.obj_name = obj_name;
	}

	static void show() {
		// object t1 inside method becomes unreachable when show() removed

		// display();

	}

	static void display() {
		// object t2 inside method becomes unreachable when display() removed
		GarbageCDemo t2 = new GarbageCDemo("t2");
		t2 = null;
	}

	public static void main(String args[]) {

		GarbageCDemo t1 = new GarbageCDemo("t1");
		GarbageCDemo t2 = new GarbageCDemo("t2");
		
		new GarbageCDemo("t3");
		//t1 = t2;
		//t1 = null;
		// calling show()
		// show();

		// calling garbage collector
		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.obj_name + " is successfully garbage collected");
	}

}
