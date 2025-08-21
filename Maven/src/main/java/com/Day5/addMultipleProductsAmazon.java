package com.Day5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addMultipleProductsAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:/Github/Java_Selenium/Selenium/src/test/resources/AmazonLogin.txt");
		props.load(fis);

		String email = props.getProperty("amazon.email");
		String password = props.getProperty("amazon.password");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email_login")).sendKeys(email);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
		List<String> products = new ArrayList<>();
		products.add("laptop");
		products.add("headphones");
		products.add("wireless mouse");
		for (String product : products) {

			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.clear();
			searchBox.sendKeys(product);
			driver.findElement(By.id("nav-search-submit-button")).click();
			driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();
			Thread.sleep(3000);
		}
		driver.findElement(By.id("nav-cart")).click();
		driver.findElement(By.name("proceedToRetailCheckout")).click();

		Thread.sleep(5000);

		driver.quit();
	}
}