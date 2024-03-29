package com.practical;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://www.expedia.com/");
		Thread.sleep(5000);

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Going to']")));

		driver.findElement(By.xpath("//button[@aria-label='Going to']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("destination_form_field")));

//		driver.findElement(By.id("destination_form_field")).sendKeys("Chennai");
		/* using with out input field */
		driver.findElement(By
				.xpath("//div[@class='uitk-field has-no-visible-label has-placeholder']//label//following-sibling::*[1]"))
				.sendKeys("Chennai");

		Thread.sleep(2000);

		List<WebElement> option = driver.findElements(By.xpath("//div[@class='typeahead-custom-truncate']"));
		System.out.println(option.size());

		wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='typeahead-custom-truncate']"))));

		for (WebElement o : option) {
			if (o.getText().equalsIgnoreCase("Chennai (MAA - Chennai Intl.)")) {
				System.out.println(o.getText());
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@aria-label='Chennai (MAA - Chennai Intl.) India']")).click();
//				driver.findElement(By.xpath("//button[@aria-label='" + o.getText() + "']")).click();
				// o.click();
				break;
			}
		}
		
//		((JavascriptExecutor)driver).executeScript("document.getElementById('fromDate').setAttribute('value','10 Apr 2024')")
		
		
		driver.manage().window().getSize().getHeight();
		driver.manage().window().getSize().getWidth();
		
		driver.navigate().forward();
	}

}
