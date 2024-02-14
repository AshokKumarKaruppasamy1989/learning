package com.practical;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class selectValueFromDropDownWithOutUsingSelectClass {

	public static WebDriver driver;

	public static void main(String[] args) {

		try {

			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			// Using action class

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//span[text()='Performance']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(
					"//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
					.sendKeys("Ashok");
			Thread.sleep(1000);

			driver.findElement(By.xpath(
					"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div[2]/div/div[2]/div/div/div[2]/i"))
					.click();

			Actions action = new Actions(driver);

			action.sendKeys(Keys.DOWN).build().perform();
			action.sendKeys(Keys.DOWN).build().perform();
			action.sendKeys(Keys.DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			action.sendKeys(Keys.ESCAPE).build().perform();

			Thread.sleep(2000);

			// using webelement

			driver.get("https://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

			driver.findElement(By.linkText("Dropdown")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("dropdown")).click();
			WebElement sel = driver.findElement(By.xpath("//select/option[contains(text(), 'Option 2')]"));

			sel.click();
			
			// Using List options
			
			driver.get("https://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

			Select s = new Select(driver.findElement(By.id("dropdown")));
			List<WebElement> options = s.getOptions();

			for (int i = 0; i < options.size(); i++) {
				System.out.println(options.get(i).getText());
				if (options.get(i).getText().equals("Option 2")) {
					options.get(i).click();
					break;
				}
			}

			Thread.sleep(2000);

			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
