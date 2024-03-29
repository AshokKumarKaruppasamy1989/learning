package com.practical;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class captureScreenShot {

	@Test
	public void takeOrangeHRMScreenShot() throws Exception {

		WebDriver driver;

		System.setProperty("webdriver.chrome.exe", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);

		this.takeScreenShot(driver, "C:\\Ashok Resume\\Interview Questions\\Report\\screenshot.png");

	}

	public void takeScreenShot(WebDriver webdriver, String filewithpath) throws Exception {

		TakesScreenshot scrshot = ((TakesScreenshot) (webdriver));

		// Call getScreenshotAs method to create image file
		File srcfile = scrshot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		File destFile = new File(filewithpath);

		// Copy file at destination
		FileUtils.copyFile(srcfile, destFile);

		webdriver.quit();

	}
}
