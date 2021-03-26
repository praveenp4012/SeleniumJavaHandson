package com.java.math;

import org.testng.annotations.Test;

public class FibonacciDemo {

	@Test
	public void fibonacci1() {
		
		int n1=0;
		int n2=1;
		int sum1=n1+n2;
		//int sum2=0;
		
		System.out.print(n1 + " ");
		System.out.print(n2 + " ");
		System.out.print(sum1 + " ");
		
		for(int i=1;i<=10;i++) {
			n1 = n2;
			n2 = sum1;
			sum1 = n1+n2;
			System.out.print(sum1 + " ");
		}

	}
	
	@Test
	public void fibonacci2() {
		
		int n1=0;
		int n2=1;
		int sum=n1+n2;
		int count = 0;
		System.out.print(n1 + " " + n2 + " " + sum + " ");
		
		while(count<10) {
			n1 = n2;
			n2 = sum;
			sum = n1+n2;
			System.out.print(sum + " ");
			count++;
		}
	}

}