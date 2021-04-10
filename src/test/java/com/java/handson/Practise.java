package com.java.handson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

class Amount {

	String curr;
	int amount;

	public Amount(String curr, int amount) {

		this.curr = curr;
		this.amount = amount;

	}
}

class AmountAdder {

	public static Amount addAmounts(Amount am1, Amount am2) throws Exception {
		if (!am1.curr.equals(am2.curr)) {
			throw new Exception("Do not match");
		}

		return new Amount(am1.curr, am1.amount + am2.amount);
	}

}

public class Practise {

	public static void main(String[] args) throws Exception {

		// AmountAdder.addAmounts(new Amount("Dllar",50), new Amount("Dollar",70));
		// Amount a = AmountAdder.addAmounts(new Amount("Dollar",50), new
		// Amount("Dollar",70));
		// System.out.println(a);

		int a[] = { 1, 2, 3, 4, 5 };
		// System.out.println(a);
		String s = Arrays.toString(a);
		System.out.println(s);

		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		String t = Arrays.deepToString(b);
		System.out.println(t);

	}
	
	public void enumSwitch() {
		switch(Sides) {
		
		}
	}	

}

enum Sides {
	North,South,East,West;
}
