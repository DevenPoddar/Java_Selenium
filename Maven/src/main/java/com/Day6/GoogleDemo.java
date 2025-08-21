package com.Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class GoogleDemo {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.out.println("Launching Browser...");
		driver = new ChromeDriver();
	}

	@Test
	public void testGoogleTitle() {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Closing Browser....");
		driver.quit();
	}
}
