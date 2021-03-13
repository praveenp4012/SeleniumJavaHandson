package com.java.math;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class MultiScenarios {

	@Test
	public void numberFormat() {

		Scanner sc = new Scanner(System.in);

		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			// Complete this line
			System.out.printf("%-15s%05d%n", s1, x);
		}
		// System.out.printf("%-15s%03d%n", s1, x);
		System.out.println("================================");
	}

	@Test
	public void sum() {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		double sum = 0;
		// double temp=0;
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();

			sum = a + b;
			// temp = sum + Math.pow(2,i);
			// System.out.print(temp);
			System.out.print((int) sum + " ");

			for (int j = 1; j < n; j++) {
				sum = sum + Math.pow(2, j) * b;
				int total = (int) sum;
				System.out.print(total + " ");
			}
		}
	}

	@Test
	public void endOfFile() throws IOException {
		Scanner s = new Scanner(System.in);
		// FileInputStream fis = new
		// FileInputStream("F:\\Selenium\\SeleniumPractise\\sample.txt");
		BufferedReader br = new BufferedReader(new FileReader("F:\\\\Selenium\\\\SeleniumPractise\\\\sample.txt"));
		int i = 0;

		while (br.readLine() != null) {
			i++;
			System.out.println(i + " " + s.nextLine());
		}
	}

	@Test
	public void currencyFormat() {

		double payment = 100.56;

		Locale indiaLocale = new Locale("en", "IN");
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat french = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);

		System.out.println("US : " + us.format(payment));
		System.out.println("CHINA : " + china.format(payment));
		System.out.println("FRENCH : " + french.format(payment));
		System.out.println("INDIA : " + india.format(payment));

	}

	@Test
	public void removeSpaceFromStr() {
		String str = "  Hey How are   you       ";

		String newStr = str.replaceAll("\\s", "");
		System.out.println(newStr);
	}

	@Test
	public void bigInteger1() {

		Scanner sc = new Scanner(System.in);
		BigInteger bi1 = sc.nextBigInteger();
		BigInteger bi2 = sc.nextBigInteger();

		BigInteger bi3 = bi1.add(bi2);
		BigInteger bi4 = bi1.multiply(bi2);

		System.out.println(bi3 + " " + bi4);
	}

	@Test
	public void bigInteger2() {

		Scanner sc = new Scanner(System.in);
		BigInteger bi1 = new BigInteger(sc.next());
		BigInteger bi2 = new BigInteger(sc.next());

		BigInteger bi3 = bi1.add(bi2);
		BigInteger bi4 = bi1.multiply(bi2);

		System.out.println(bi3 + " " + bi4);
	}

	@Test
	public void multiplesOfNum() {

		int n = 12;
		int s = 0;
		int t = 1;
		int f;

		while (t <= n) {
			if (n % t == 0) {
				f = t;
				s = s + f;
			}
			t++;
		}
		System.out.println(s);

	}

	@Test
	public void stringDemo() {

		String a = "howare";
		String b = "hello";
		System.out.println(a.length() + b.length());
		char c = a.charAt(0);
		System.out.println(Character.toString(c).toUpperCase());
		System.out.println(Character.toString(c).toUpperCase() + a.substring(1, a.length()));
		System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase()
				+ b.substring(1));
		if (a.compareTo(b) < 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

		System.out.println(a.substring(0, 1));
		a.substring(1);

	}

	@Test
	public void stringSort() {

		String str = "heappylife";
		int k = 3;
		String smallStr = "";
		String LargeStr = "";
		TreeSet ts = new TreeSet();

		for (int i = 0; i <= str.length() - k; i++) {
			// String newStr = str.substring(i, i + k);
			ts.add(str.substring(i, i + k));
		}

		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());

	}

	@Test
	public void stringSort1() {

		String str = "heappylife";
		int k = 3;
		String smallStr = str.substring(0, k);
		String largeStr = str.substring(0, k);
		// TreeSet ts = new TreeSet();

		for (int i = 0; i <= str.length() - k; i++) {
			String newStr = str.substring(i, i + k);
			// ts.add(str.substring(i, i + k));

			if (newStr.compareTo(smallStr) < 0) {
				smallStr = newStr;
			}
			if (newStr.compareTo(largeStr) > 0) {
				largeStr = newStr;
			}
		}

		System.out.println(smallStr);
		System.out.println(largeStr);
		// System.out.println(ts.last());

	}

	@Test
	public void strPolindrome() {

		String str = "madaam";

		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}

		if (revStr.equalsIgnoreCase(str)) {
			System.out.println("String is Polindrome");
		} else
			System.out.println("String is not a polindrome");

		// System.out.println(revStr);

	}

	@Test
	public void isAnagram() {

		String str1 = "test";
		String str2 = "etpt";

		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();

		// System.out.println(ch2);
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (str1.length() != str2.length()) {
			System.out.println("Not Anagrams");
		}

		for (int i = 0; i < str1.length(); i++) {
			if (ch1[i] != ch2[i]) {
				System.out.println("Not Anagrams");
			}
		}

		System.out.println("Anagrams");

		// boolean x = Arrays.equals(ch1, ch2);
		// System.out.println(x);

		// return Arrays.equals(ch1, ch2);

	}

	@Test
	public void pyramidPattern1() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	@Test
	public void pyramidPattern2() {
		int n = 5;
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	@Test
	public void pyramidPattern3() {

		int n = 5;
		for (int i = 0; i < n; i++) {

			for (int j = n - i; j >= 0; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println(" ");
		}

	}

	@Test
	public void pyramidPattern4() {

		int n = 5;
		for (int i = n; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}

			System.out.println(" ");

			for (int j = n - i; j < i; j++) {
				System.out.print(" ");
			}

		}
	}

	@Test
	public void trianglePattern() {
		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	@Test
	public void revPyramid() {
		int n = 6;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	@Test
	public void mirrorTriangle() {
		int n = 7;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}

	@Test
	public void numberPattern() {
		int n = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}

	@Test
	public void numberPatternNoReassign() {
		int n = 5;
		int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num + 1;
			}
			System.out.println(" ");
		}
	}

	@Test
	public void patternRegex() {

		String regEx = ".*google.*";
		String actualStr = "google www com";

		Pattern p = Pattern.compile(regEx);
		boolean match = p.matcher(actualStr).matches();

		System.out.println("Actual String Contains regEX : " + match);

	}

	@Test
	public void ipAddPattern() {
		String ip = "200.200.020.210";
		String zeroTo255 = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
		String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;

		System.out.println(ip.matches(pattern));
	}

	@Test
	public void patternDemo() {

		String regEx = ".*gogle.*";
		String actualStr = "www google com";

		Pattern p = Pattern.compile(regEx);
		boolean match = p.matcher(actualStr).matches();

		if (match == true) {
			System.out.println("Actual String " + "\"" + actualStr + "\"" + " Contains the given regEX : " + regEx);
		} else {
			System.out.println(
					"Actual String " + "\"" + actualStr + "\"" + " does not contain the given regEX : " + regEx);
		}

	}

	@Test
	public void minMaxArray() {

		int[] a = { 3, 6, 1, 5, 4, 2 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);

		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);

	}
	
	@Test
	public void sampleRun() {
		boolean b1 = Boolean.valueOf(true);
		boolean b2 = Boolean.valueOf(false);
		boolean b3 = Boolean.valueOf("true");
		boolean b4 = Boolean.valueOf("false");
		boolean b5 = Boolean.valueOf("1.0");
		boolean b6 = Boolean.valueOf("1");
		System.out.println(b1 + " " + b2 + " " + b3 + " " + b4 + " " + b5 + " " + b6);
	}
}
