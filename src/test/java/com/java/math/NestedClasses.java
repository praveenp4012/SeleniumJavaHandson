package com.java.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NestedClasses {

	public static void main(String[] args) {

		OuterClass oc = new OuterClass();
		oc.outerMethod();

	}

}

class OuterClass {
	public void outerMethod() {
		System.out.println("Method from Outer Class");
		InnerClass ic = new InnerClass();
		ic.innerMethod();
	}

	private class InnerClass {
		public void innerMethod() {
			System.out.println("Method in Inner Class");
		}

	}

}
