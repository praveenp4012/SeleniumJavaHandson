package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedChar {

	public static void main(String[] args) {

		String str = "teeth";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char[] ch = str.toCharArray();
		char c;

		for (int i = 0; i < str.length(); i++) {

			c = str.charAt(i);

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if(map.get(c)==1) {
				System.out.println("Non Repeated Char is: " + c);
			}

		}

	}

}