package com.java.handson;

public class StaticInstance {
	
	int i;
	static int j;

	public static void main(String[] args) {

		StaticInstance vm1 = new StaticInstance();
		StaticInstance vm2 = new StaticInstance();
		StaticInstance vm3 = new StaticInstance();

	}
	
	static {
		//i=10;
		j=20;
		System.out.println("Static Block " + j);
	}

	{
		i=30;
		j=40;
		j++;
		i++;
		System.out.println("Instance Block " + i + j);
		
	}
}
