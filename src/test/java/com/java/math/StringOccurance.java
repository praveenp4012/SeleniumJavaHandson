package com.java.math;

import java.time.LocalDate;
import java.util.Scanner;

import org.testng.annotations.Test;

public class StringOccurance {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		findOccurance(str);
	}

	public static void findOccurance(String str) {

		int MAX_LENGTH = 256;
		int[] count = new int[MAX_LENGTH];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		char ch[] = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			int find = 0;

			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == ch[j]) {
					find++;
				}
			}

			if (find == 1) {
				System.out.println("No.of Occurances of " + str.charAt(i) + " is : " + count[str.charAt(i)]);
			}
		}

	}
}
