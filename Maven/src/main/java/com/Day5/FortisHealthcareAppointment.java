package com.Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FortisHealthcareAppointment {

	public static void main(String[] args) throws InterruptedException {

		String phone = "9163558125";

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.fortishealthcare.com/doctors?location=all");
		driver.findElement(By.xpath("//li[2]//div[2]//a[2]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[2]"));
		Thread.sleep(1500);

		driver.findElement(By.xpath(
				"//div[@class='slot-booking-footer']//button[@class='btn-lg link'][normalize-space()='Book Appointment']"))
				.click();
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@placeholder='Enter mobile no.']")).sendKeys(phone);
		driver.findElement(By.xpath("//button[normalize-space()='Get OTP']")).click();
		Thread.sleep(20000);

		driver.findElement(By.xpath("//button[normalize-space()='Pay Now']")).click();

	}

}