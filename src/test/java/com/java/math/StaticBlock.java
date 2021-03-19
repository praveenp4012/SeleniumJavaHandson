package com.java.math;

import java.time.LocalDate;
import java.util.Scanner;

import org.testng.annotations.Test;

public class StaticBlock {

	static Scanner s = new Scanner(System.in);
	static int b = s.nextInt();
	static int h = s.nextInt();
	static boolean flag = true;

	public static void main(String[] args) {

		if (flag) {
			int area = b * h;
			System.out.println("Area of the Paralellogram is: " + area);
		}
	}

	static {
		try {

			if (b <= 0 || h <= 0) {
				flag = false;
				throw new Exception("Height and/or breadth Should be Non-Zero Positive Numbers");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
