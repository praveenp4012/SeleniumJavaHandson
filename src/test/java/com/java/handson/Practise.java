package com.java.handson;

class Parent {

	public void parent1() {

		System.out.println("Parent1");

	}

	
}

public class Practise extends Parent {

	public static void main(String[] args) {
		Parent p1 = new Practise();
		p1.parent1();
		p1.parent2();
	}

	public void parent1() {

		System.out.println("Child1");

	}
	
	public void parent2() {

		System.out.println("Child2");

	}

}
