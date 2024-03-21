package com.practical;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findBrokenLinks {

	public static void main(String[] args) throws IOException {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i <links.size(); i++) {
			WebElement element = links.get(i);
			
			String url = element.getAttribute("href");
			
			verifyLink(url);
		}
	}
	
	public static void verifyLink(String urlLink) throws IOException {
		URL link = new URL(urlLink);
		
		HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();
		
		if(httpconn.getResponseCode() != 200) {
			System.out.println("Broken Link: " + urlLink);
		}		
	}

}
