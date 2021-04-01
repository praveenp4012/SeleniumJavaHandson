package com.java.handson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResources {

	public static void main(String[] args) throws Exception {

		try (BufferedReader br = new BufferedReader(new FileReader("F:\\Selenium\\Sample.txt"))) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
