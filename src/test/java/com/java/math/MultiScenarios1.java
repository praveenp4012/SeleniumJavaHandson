package com.java.math;

import java.time.LocalDate;
import java.util.Scanner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiScenarios1 {

	@Test
	public void convertDemo() {

		double d = 500.345;
		int i = (int) d;
		System.out.println(i);
		Double dd = new Double(d);
		int j = dd.intValue();
		System.out.println(j);
		int k = (int) Math.round(d);
		System.out.println(k);

		int p = 10;
		String s1 = String.valueOf(p);
		System.out.println(s1);
		String s2 = Integer.toString(p);
		System.out.println(s2);
		String s3 = "" + p;
		System.out.println(s3);

		/*try {
			String str = "Hello";
			int x = Integer.parseInt(str);
			System.out.println(x);
			throw new Exception("New");
		} catch (Exception e) {
			System.out.println(e);
		}*/
	}
	
	@Test
	public void localDate1() {
		
		String str = "1989-08-01"; 
		LocalDate ld = LocalDate.parse(str);
		
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.getYear());
		System.out.println(ld.getMonth());
		
	}
	
	@Test
	public void localDate2() {
		
		int year = 1989;
		int month = 8;
		int day = 15;
		
		//LocalDate ld = LocalDate.parse(str);
		String ld = LocalDate.of(year, month, day).getDayOfWeek().toString();
		
		System.out.println(ld);
		
	}
	
	@Test(dataProvider="getData")
	public void dataProviderDemo(String user, String pass) {
		System.out.println(user);
		System.out.println(pass);
	}
	
	@DataProvider(name="getData")
	public Object[][] getTestData() {
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "USER1";
		obj[0][1] = "PASS1";
		obj[1][0] = "USER2";
		obj[1][1] = "PASS2";
		
		return obj;
		
	}

}
