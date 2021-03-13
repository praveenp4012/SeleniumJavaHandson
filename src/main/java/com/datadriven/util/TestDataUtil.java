package com.datadriven.util;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestDataUtil {

	public static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();

		try {
			reader = new Xls_Reader(
					"F:\\Selenium\\SeleniumPractise\\src\\main\\java\\com\\datadriven\\testdata\\DataDriven_Testdata.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 2; i <= 5; i++) {

			String firstName = reader.getCellData("Sheet1", 0, i);
			String lastName = reader.getCellData("Sheet1", 1, i);
			String date = reader.getCellData("Sheet1", 2, i);
			String continent = reader.getCellData("Sheet1", 3, i);
			String commands = reader.getCellData("Sheet1", 4, i);

			Object[] ob = { firstName, lastName, date, continent, commands };
			myData.add(ob);

		}

		return myData;

	}

}
