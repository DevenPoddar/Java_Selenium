package com.Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

public class IDXWalletAutomation {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions options = new ChromeOptions();

		options.setBinary("C:/Users/2002d/Downloads/chrome-win64/chrome-win64/chrome.exe");
		options.addArguments("user-data-dir=C:/Users/2002d/AppData/Local/Google/Chrome for Testing/User Data");
		options.addExtensions(new File("IDXWallet.crx"));

		WebDriver driver = new ChromeDriver(options);

		Thread.sleep(2000);

		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_E);
		 * robot.keyRelease(KeyEvent.VK_E); robot.keyRelease(KeyEvent.VK_SHIFT);
		 * robot.keyRelease(KeyEvent.VK_CONTROL);
		 */

		driver.get("chrome-extension://gincibbmcbgnadapcecbadihomhdhogp/popup.html");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Create a new wallet']")).click();

		driver.findElement(By.xpath("//button[@aria-label='Continue to next step']")).click();

		// driver.findElement(By.xpath("//button[@aria-label='Continue to next

		WebElement nextBtn = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(
						By.xpath("//button[@aria-label='Continue to next step' and .//span[text()='Next']]")));
		nextBtn.click();

		// driver.findElement(By.xpath("//button[@aria-label='Continue to next
		// step']")).click();

		WebElement getStartedBtn = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(
						By.xpath("//button[@aria-label='Continue to next step' and .//span[text()='Get Started']]")));

		getStartedBtn.click();

		driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']"))
				.sendKeys("Abc@1234567890");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='password' and @placeholder='Confirm Password']"))
				.sendKeys("Abc@1234567890");
		Thread.sleep(2000);

		WebElement checkbox = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.w-5.h-5.mr-4.border-2.rounded-lg")));
		checkbox.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@aria-label='Continue to next step' and .//span[text()='Continue']]"))
				.click();

		driver.findElement(By.xpath("//button[@aria-label='Continue to next step' and .//span[text()='Start']]"))
				.click();

		driver.quit();
	}
}
