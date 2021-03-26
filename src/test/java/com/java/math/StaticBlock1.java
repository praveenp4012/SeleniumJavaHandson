package com.java.math;

import java.time.LocalDate;
import java.util.Scanner;

import org.testng.annotations.Test;

public class StaticBlock1 {
	
	static int a= m1();
	int b;
	
	static {
		System.out.println("Static Block");
		b= a*10;
		m2();
	}
	
	static int m1() {
		System.out.println("m1 method");
		return 20;
		m2();
		//b= a*10;
	}
	
	public void m2() {
		System.out.println("m2 method");
	}
	
	//static int b;
	
	public static void main(String[] args) {
	//	b=45;
		
		System.out.println("Value is " + a);
		System.out.println("Main Method");
		
	}
	
	
}
