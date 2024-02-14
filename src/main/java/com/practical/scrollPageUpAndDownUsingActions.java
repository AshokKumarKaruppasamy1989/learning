package com.practical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class scrollPageUpAndDownUsingActions {

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

			// Scroll down

			WebElement ele = driver.findElement(By.xpath("//p[text()='Employee Distribution by Location']"));
			WheelInput.ScrollOrigin scrolldown = WheelInput.ScrollOrigin.fromElement(ele);
			new Actions(driver).scrollFromOrigin(scrolldown, 0, 100).perform();
			
			
			// alternate
			
			
			Actions action = new Actions(driver);
			action.sendKeys(Keys.PAGE_DOWN).perform();
			action.sendKeys(Keys.PAGE_DOWN).perform();
			action.sendKeys(Keys.PAGE_DOWN).build().perform();			

			System.out.println("Page is scrolled");
			
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
