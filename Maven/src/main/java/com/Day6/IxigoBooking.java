package com.Day6;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class IxigoBooking {

	WebDriver driver;

	@BeforeClass
	public void setup() throws IOException {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void IxigoSite() {
		driver.get("https://www.ixigo.com/");

	}

	@Test(priority = 0)
	public void Login() throws InterruptedException {
		String phone = "9163558125";
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Mobile Number')]")).sendKeys(phone);
		driver.findElement(By.xpath(
				"//button[@class='inline-flex justify-center items-center bg-brand-solid text-brand-solid hover:bg-brand-solid-over gap-5px rounded-10 min-h-40 button-md icon-md px-15px w-full mt-20 mb-15 h-12 py-3 px-20']"))
				.click();
		Thread.sleep(20000);

	}

	@Test(priority = 1)
	public void BookFlight() throws InterruptedException {
		// from
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div")).click();
		driver.findElement(
				By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]"))
				.click();
		Thread.sleep(1000);
		// to
		driver.findElement(
				By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[4]/div[1]/div[2]"))
				.click();
		// search
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/button")).click();
		Thread.sleep(1000);
		// Book
		driver.findElement(By
				.xpath("/html/body/div[3]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/div[3]/div[1]/button"))
				.click();
		Thread.sleep(1000);

		// mr
		WebElement title = driver.findElement(By.cssSelector(
				"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)"));
		title.sendKeys("Mr");
		title.sendKeys(Keys.DOWN, Keys.ENTER);
		// Select dropdown = new Select(title);
		// dropdown.selectByVisibleText("Mr");

		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div[3]/div/div[3]/div/div[2]/div/form/div/div[1]/div/div/svg"
		 * )).click();
		 * driver.findElement(By.xpath("/html/body/div[4]/div/div/p[1]")).click();
		 * Thread.sleep(1000);
		 */

		// firstname
		WebElement enter = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div[3]/div/div[3]/div/div[2]/div/form/div/div[2]/div/div/div/div[2]/input"));
		enter.click();
		enter.sendKeys("Shaik");
		Thread.sleep(1000);
		// lastname
		WebElement enter2 = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div[3]/div/div[3]/div/div[2]/div/form/div/div[3]/div/div/div/div[2]/input"));
		enter2.click();
		enter2.sendKeys("Abdul");
		// Thread.sleep(2000);
		// continue
		driver.findElement(By
				.xpath("/html/body/div[3]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/div[3]/div[1]/button"))
				.click();

	}

}