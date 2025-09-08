package Selenium.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IDXWalletLogin {
	public static void main(String args[]) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();

		options.setBinary("C:/Users/2002d/Downloads/chrome-win64/chrome-win64/chrome.exe");
		options.addArguments("user-data-dir=C:/Users/2002d/AppData/Local/Google/Chrome for Testing/User Data");

		WebDriver driver = new ChromeDriver(options);

		Thread.sleep(2000);

		driver.get("chrome-extension://gincibbmcbgnadapcecbadihomhdhogp/sidepanel.html#/wallet-setup-main");

		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='I already have a wallet']")).click();

		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='Use seed phrase']")).click();
		
		
	}
}