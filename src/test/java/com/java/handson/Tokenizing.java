package com.java.handson;

import java.util.Arrays;

public class Tokenizing {

	public static void main(String[] args) {
		tokenize("PR_A_VEE_N","_");

	}

	public static void tokenize(String str, String regex) {
		String[] s = str.split(regex);
		System.out.println(Arrays.toString(s));
	}

}
