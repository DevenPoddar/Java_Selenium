package com.Day8;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	private int count = 0;
	private final int maxRetry = 2;

	@Override
	public boolean retry(ITestResult result) {
		if (count < maxRetry) {
			count++;
			System.out.println("Retrying test: " + result.getName() + " | Attempt " + (count + 1));
			return true;
		}
		return false; 
	}
}
