package com.java.handson;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class JvmDemo {

	public static void main(String[] args) {

		Student s1 = new Student();
		Class c1 = s1.getClass();
		System.out.println(c1.getName());

		Method[] m = c1.getDeclaredMethods();

		for (Method m1 : m) {
			System.out.println(m1.getName());
		}
		
		Field[] f = c1.getDeclaredFields();
		
		for(Field f1: f) {
			System.out.println(f1.getName());
		}

	}
}

class Student {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}
