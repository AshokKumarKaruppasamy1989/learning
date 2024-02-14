package com.practical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class scrollPageUpAndDownUsingJavaScript {

	public static WebDriver driver;

	public static void main(String[] args) {

		try {

			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();
			Thread.sleep(3000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			// 1. To scroll down the web page by pixel

			js.executeScript("window.scrollBy(0,400)");
			// or
			js.executeScript("scroll(0, 400)");

			// 2. To scroll down the web page by the visibility of the element

			WebElement ele = driver.findElement(By.xpath("//p[text()='Employee Distribution by Location']"));
			js.executeScript("arguments[0].scrollIntoView();", ele);

			// 3. To scroll down the web page at the bottom of the page

			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

			// 4. Horizontal scroll on the web page

			WebElement element = driver.findElement(By.xpath("//p[text()='Employee Distribution by Location']"));
			js.executeScript("arguments[0].scrollIntoView();", element);

			System.out.println("Page is scrolled");

			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
