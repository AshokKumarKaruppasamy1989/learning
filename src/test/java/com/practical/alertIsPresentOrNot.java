package com.practical;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertIsPresentOrNot {

	public static WebDriver driver;
	
	public static void main (String[] args) {
		System.out.println(isAlertPresentOrNot());
		driver.quit();
		
	}

	public static boolean isAlertPresentOrNot() {

		// Explict wait

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

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
			wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Alert is present");
			driver.switchTo().alert().accept();
			return true;

		}

		catch (Exception e) {
			System.out.println("No alert is present");
			return false;
		}

	}

	public static boolean isAlertPresentOrNotImplict() {

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
			
			// Implict wait

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			Alert alt = driver.switchTo().alert();
			alt.accept();
			return true;

		} catch (Exception e) {
			System.out.println("No alert is present");
			return false;

		}
	}
}
