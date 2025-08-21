package com.Day6;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class XSocialMedia {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void loginToAccount() throws IOException, InterruptedException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("D:/Github/Java_Selenium/Selenium/src/test/resources/X.txt");
		props.load(fis);

		String email = props.getProperty("X.email");
		String password = props.getProperty("X.password");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://x.com/login");
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		driver.findElement(By.name("text")).sendKeys(email);
		driver.findElement(By.xpath("//span[text()='Next']/..")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]/..")).click();

		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void createNewPost() throws InterruptedException {
		WebElement tweet = driver
				.findElement(By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']"));
		tweet.sendKeys("Hey Everyone...");
		driver.findElement(By.xpath("//span[contains(text(),'Post')]")).click();

		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void commentOnPost() throws InterruptedException {
		WebElement Post = driver.findElement(By.xpath("//button[@aria-label='0 Replies. Reply']"));
		Post.click();
		WebElement comment = driver.findElement(By.xpath(
				"//div[@class='css-175oi2r r-1h8ys4a r-slzeqm r-ly4kne']//div//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']"));
		comment.sendKeys("ABC");
		driver.findElement(By.xpath(
				"//button[@class='css-175oi2r r-sdzlij r-1phboty r-rs99b7 r-lrvibr r-1cwvpvk r-2yi16 r-1qi8awa r-3pj75a r-1loqt21 r-o7ynqc r-6416eg r-1ny4l3l']"))
				.click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//a[@aria-label='Profile']")).click();

		Thread.sleep(10000);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
