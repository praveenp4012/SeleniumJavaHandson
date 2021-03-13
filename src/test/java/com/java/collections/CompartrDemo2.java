package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CompartrDemo2 {

	public static void main(String[] args) {

		ArrayList<CompartrDemo> al = new ArrayList<CompartrDemo>();
		al.add(new CompartrDemo("Bahubali", 2015, 8.1));
		al.add(new CompartrDemo("Sahoo", 2014, 6.4));
		al.add(new CompartrDemo("Sardar", 2018, 9.5));

		// System.out.println(al);

		RatingCompare rc = new RatingCompare();

		Collections.sort(al, rc);
		Collections.sort(al);

		for (CompartrDemo cd : al) {
			// System.out.println(cd.getName());
			// System.out.println(cd.getYear());
			System.out.println(cd.getRating() + " " + cd.getName() + " " + cd.getYear());
		}

	}
}