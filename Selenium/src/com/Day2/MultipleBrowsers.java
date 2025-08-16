package com.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {
	public static void main(String args[]) {

		// System.setProperty("webdriver.edge.driver",
		// "D:\\EclipseWorkspace\\WebDrivers\\msedgedriver.exe");

		// WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.youtube.com/");

		System.out.println("Page Title: " + driver.getTitle());

	}
}
