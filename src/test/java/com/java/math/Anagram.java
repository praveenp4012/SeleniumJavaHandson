package com.java.math;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Anagram {

	public static void main(String[] args) {

		if (isAnagram("CAST", "SACC")) {
			System.out.println("Strings are Anagrams");
		} else {
			System.out.println("Strings are not Anagrams");
		}
	}

	public static boolean isAnagram(String a, String b) {

		if (a.length() != b.length()) {
			return false;
		}

		char[] ch1 = a.toCharArray();
		char[] ch2 = b.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (int i = 0; i < a.length(); i++) {
			if (ch1[i] != ch2[i]) {
				return false;
			}
		}

		return true;

	}
}
