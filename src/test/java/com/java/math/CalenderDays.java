package com.java.math;

import java.time.LocalDate;
import java.util.Scanner;

import org.testng.annotations.Test;

public class CalenderDays {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String date = "2021-02-03";
		//getDayMonthYear(date);
		//splitDate(date);
		getDayOfWeek(2015,8,5);
	}

	public static void getDayMonthYear(String date) {

		LocalDate localDate = LocalDate.parse(date);

		System.out.println(localDate.getMonth());
		System.out.println(localDate.getYear());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());

	}

	public static void splitDate(String date) {

		String newDate[] = date.split("-");

		String year = newDate[0];
		String month = newDate[1];
		String day = newDate[2];

		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}

	public static void getDayOfWeek(int year, int month, int day) {
		
		String dayOfWeek = LocalDate.of(year, month, day).getDayOfWeek().toString();
		System.out.println(dayOfWeek);
	}
	
	public static void getDay() {
		
	}
}
