package com.practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverAction {

	public static WebDriver driver;

	public static void main(String[] args) {

		// Locating the Main Menu (Parent element)
		WebElement mainMenu = driver.findElement(By.xpath("<Xpath of the Main menu"));

		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu
		actions.moveToElement(mainMenu);

		// Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("<Xpath of the sub element>"));

		// To mouseover on sub menu
		actions.moveToElement(subMenu);

		// build()- used to compile all the actions into a single step
		actions.click().build().perform();

	}
}
