package com.practical;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class test {

	public static WebDriver driver;

	public static void main(String[] args) {

		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).perform();

	}

}
