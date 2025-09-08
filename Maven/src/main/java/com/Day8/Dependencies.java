package com.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Dependencies {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void openWebsite() {
		driver.get("https://o2.openmrs.org/openmrs/login.htm");
		System.out.println("Website opened successfully.");
	}

	@Test(dependsOnMethods = { "openWebsite" })
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Login attempted.");
	}

	@Test(dependsOnMethods = { "openWebsite", "login" })
	public void registerPatient() {
		driver.findElement(By.id(
				"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension"))
				.click();
	}

	@AfterClass
	public void tearDown() {
		if (driver != null)
			driver.quit();
	}
}