package com.Day5;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class formAutomation {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");

		driver.findElement(By.id("firstName")).sendKeys("Deven");
		Thread.sleep(1000);

		driver.findElement(By.id("lastName")).sendKeys("Poddar");
		Thread.sleep(1000);

		driver.findElement(By.id("userEmail")).sendKeys("devenpoddar2002@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("userNumber")).sendKeys("8360823416");
		Thread.sleep(1000);

		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).sendKeys("February");
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).sendKeys("2002");
		driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, February 16th, 2002']")).click();
		Thread.sleep(1000);

		WebElement subject = driver.findElement(By.id("subjectsInput"));
		subject.sendKeys("Maths");
		subject.sendKeys(Keys.DOWN, Keys.ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@id='hobbiesWrapper']//div[@class='col-md-9 col-sm-12']//div[2]")).click();
		Thread.sleep(1000);

		File uploadFile = new File("C:/Users/2002d/Downloads/image.png");
		WebElement fileInput = driver.findElement(By.id("uploadPicture"));
		fileInput.sendKeys(uploadFile.getAbsolutePath());
		Thread.sleep(1000);

		driver.findElement(By.id("currentAddress")).sendKeys("Bangur Park, Rishra");
		Thread.sleep(1000);

		WebElement state = driver.findElement(By.id("react-select-3-input"));
		state.sendKeys("Rajasthan");
		state.sendKeys(Keys.DOWN, Keys.ENTER);
		Thread.sleep(1000);

		WebElement city = driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Jaipur");
		city.sendKeys(Keys.DOWN, Keys.ENTER);
		Thread.sleep(1000);

		driver.findElement(By.id("submit")).click();
		Thread.sleep(5000);

		driver.quit();

	}
}
