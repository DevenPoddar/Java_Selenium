package Selenium.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

public class IDXWalletAutomation {
	public static void main(String[] args)
			throws InterruptedException, AWTException, HeadlessException, UnsupportedFlavorException, IOException {
		ChromeOptions options = new ChromeOptions();

		options.setBinary("C:/Users/2002d/Downloads/chrome-win64/chrome-win64/chrome.exe");
		options.addArguments("user-data-dir=C:/Users/2002d/AppData/Local/Google/Chrome for Testing/User Data");

		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		Thread.sleep(2000);

		driver.get("chrome-extension://gincibbmcbgnadapcecbadihomhdhogp/sidepanel.html#/wallet-setup-main");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Create a new wallet']")).click();

		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='Get Started']")).click();

		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Deven@123");
		driver.findElement(By.cssSelector("input[placeholder='Confirm Password']")).sendKeys("Deven@123");

		Thread.sleep(1500);
		driver.findElement(
				By.cssSelector("div.w-5.h-5.mr-4.flex-shrink-0.border-2.rounded-lg.border-gray-500.bg-transparent"))
				.click();

		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();

		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='Start']")).click();

		Thread.sleep(1500);
		WebElement copyBtn = driver.findElement(By.xpath("//span[text()='Copy']"));
		copyBtn.click();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		String copiedText = (String) toolkit.getSystemClipboard().getData(DataFlavor.stringFlavor);

		Thread.sleep(1500);
		String filePath = "D:/Github/Java_Selenium/Maven/SeedPhrase.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
		writer.write(copiedText);

		writer.close();

		Thread.sleep(1500);
		driver.findElement(By.id("acknowledge")).click();

		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();

		Thread.sleep(1500);
		WebElement user = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='awesome_username']")));
		user.clear();
		user.sendKeys("DevenPoddar");

		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		Thread.sleep(1500);
		WebElement getStarted = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Get Started Now')]")));
		getStarted.click();

		Thread.sleep(5000);
		driver.quit();
	}
}
