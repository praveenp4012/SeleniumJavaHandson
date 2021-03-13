package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

class CompartrDemo implements Comparable<CompartrDemo>{
	
	public String name;
	public int year;
	public double rating;
	
	
	public int compareTo(CompartrDemo cm) {
		return this.year - cm.year;
	}
	
	public CompartrDemo(String name, int year, double rating) {
		this.name = name;
		this.year = year;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public double getRating() {
		return rating;
	}
	
}

class RatingCompare implements Comparator<CompartrDemo> {
	
	public int compare(CompartrDemo c1, CompartrDemo c2) {
		if(c1.getRating() < c2.getRating())
			return -1;
		if(c1.getRating() > c2.getRating())
			return -1;
		return 0;
	}
}
