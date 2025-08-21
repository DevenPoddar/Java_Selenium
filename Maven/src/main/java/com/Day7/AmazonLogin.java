package com.Day7;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class AmazonLogin {
	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}

	@Test(priority = 1, groups = { "smoke", "sanity", "regression" })
	public void logIn() {
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email_login")).sendKeys("2002devenpoddar@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("161");
		driver.findElement(By.id("signInSubmit")).click();
	}

	@Test(priority = 2, groups = { "sanity", "regression" })
	public void productSearch() throws InterruptedException {
		List<String> products = new ArrayList<>();
		products.add("laptop");
		products.add("headphones");
		products.add("wireless mouse");

		for (String product : products) {
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.clear();
			searchBox.sendKeys(product);
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(2000);
		}
	}

	@Test(priority = 3, groups = { "regression" })
	public void checkOut() throws InterruptedException {
		driver.findElement(By.id("nav-cart")).click();
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 4, groups = { "regression" })
	public void logOut() throws InterruptedException {
		System.out.println("Logging Out....");

		driver.findElement(By.id("nav-logo-sprites")).click();

		WebElement mainMenu = driver.findElement(By.id("nav-link-accountList"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).perform();
		Thread.sleep(1500);

		driver.findElement(By.xpath("//span[normalize-space()='Sign Out']")).click();
		Thread.sleep(1500);
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Closing Browser....");
		driver.quit();
	}
}
