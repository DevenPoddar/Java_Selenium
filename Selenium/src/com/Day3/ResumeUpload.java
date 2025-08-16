//package com.Day3;
//
//import java.io.File;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class ResumeUpload {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://login.naukri.com/nLogin/Login.php");
//
//		driver.findElement(By.id("usernameField")).sendKeys("devenpoddar2002@gmail.com");
//		driver.findElement(By.id("passwordField")).sendKeys("12344321");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(5000);
//		driver.get("https://www.naukri.com/mnjuser/profile");
//		Thread.sleep(5000);
//
//		WebElement fileInput = driver.findElement(By.id("attachCV"));
//		File resumeFile = new File("C:/Users/2002d/Downloads/Linux1/Documents/Deven Final Resume.pdf");
//
//		fileInput.sendKeys(resumeFile.getAbsolutePath());
//		Thread.sleep(5000);
//
//		driver.quit();
//	}
//}

package com.Day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeUpload {

	public static void main(String[] args) throws InterruptedException, IOException {

		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("D:/Github/Java_Selenium/Selenium/src/test/resources/config.properties.txt");
		props.load(fis);

		String email = props.getProperty("naukri.email");
		String password = props.getProperty("naukri.password");
		String resumePath = props.getProperty("resume.path");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.naukri.com/nLogin/Login.php");

		driver.findElement(By.id("usernameField")).sendKeys(email);
		driver.findElement(By.id("passwordField")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(5000);
		driver.get("https://www.naukri.com/mnjuser/profile");

		Thread.sleep(5000);

		WebElement fileInput = driver.findElement(By.id("attachCV"));
		File resumeFile = new File(resumePath);
		fileInput.sendKeys(resumeFile.getAbsolutePath());

		Thread.sleep(5000);
		
		driver.quit();
		
		System.out.println("Resume Uploaded successfully.");
	}
}
