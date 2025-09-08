package com.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AmazonDataProvider {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}

	@DataProvider(name = "products")
	public Object[][] getData() {
		return new Object[][] { { "Laptop" }, { "Mobile" }, { "Headphones" } };
	}

	@Test(dataProvider = "products", retryAnalyzer = Retry.class, groups = { "regression" })
	public void searchProduct(String product) throws InterruptedException {
		System.out.println("Searching for: " + product);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000); 
	}

	@Test(groups = { "smoke" })
	public void testTitle() {
		System.out.println("Smoke Test - Checking Title");
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
	}

	@AfterClass
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
}