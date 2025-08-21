package com.Day5;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DoctorAppointment {
	public static void main(String[] args) throws InterruptedException {

		Scanner in = new Scanner(System.in);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://katalon-demo-cura.herokuapp.com/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();

		driver.findElement(By.id("txt-username")).sendKeys("John Doe");

		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");

		driver.findElement(By.id("btn-login")).click();

		Thread.sleep(1000);

		WebElement Facility = driver.findElement(By.id("combo_facility"));
		Facility.click();
		Select dropdown = new Select(Facility);
		List<WebElement> Facilities = dropdown.getOptions();
		System.out.println("Available Facilities: ");
		for (int i = 0; i < Facilities.size(); i++) {
			System.out.println(i + ". " + Facilities.get(i).getText());
		}

		System.out.print("Enter the Facility to select: ");
		int FacilityChoice = in.nextInt();
		dropdown.selectByIndex(FacilityChoice);

		Thread.sleep(2500);

		driver.findElement(By.id("txt_visit_date")).sendKeys("18082025");

		driver.findElement(By.id("btn-book-appointment")).click();

		Thread.sleep(2500);

		driver.quit();
		in.close();
	}
}
