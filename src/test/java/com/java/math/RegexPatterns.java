package com.java.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatterns {

	static String str = "Hello how are you";
	static String subStr = "how";
	//static String actual 
	static String replace = "where";

	public static void main(String[] args) {

		Pattern p = Pattern.compile(subStr);
		Matcher m = p.matcher(str);

		boolean b = m.matches();
		System.out.println(b);
		
		str = m.replaceAll(replace);
		System.out.println(str);

	}

}
