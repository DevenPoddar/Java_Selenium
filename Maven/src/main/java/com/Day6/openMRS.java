package com.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openMRS {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://o2.openmrs.org/openmrs/login.htm");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.id(
				"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.name("givenName")).sendKeys("Deven");
		driver.findElement(By.name("familyName")).sendKeys("Poddar");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.xpath("//option[@value='M']")).click();
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("birthdateDay-field")).sendKeys("16");
		driver.findElement(By.id("birthdateMonth-field")).sendKeys("February");
		driver.findElement(By.id("birthdateYear-field")).sendKeys("2002");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("address1")).sendKeys("36/14 N.S Road");
	}
}
