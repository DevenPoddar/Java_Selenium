package com.Day8;

import org.testng.Assert;
import org.testng.annotations.*;

public class dataProvider {

	@DataProvider(name = "numbers")
	public Object[][] getData() {
		return new Object[][] { { 2, 3, 5 }, { 5, 7, 12 }, { 10, 20, 30 } // corrected sum
		};
	}

	@Test(dataProvider = "numbers", retryAnalyzer = Analyzer.class)
	public void addNumbers(int a, int b, int exsum) {
		int sum = a + b;
		System.out.println("Checking: " + a + " + " + b + " = " + sum);
		Assert.assertEquals(sum, exsum, "Sum is not matching!");
	}
}
