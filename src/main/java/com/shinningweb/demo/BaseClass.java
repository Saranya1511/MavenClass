package com.shinningweb.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static WebDriver driver;
	
	static public void lanuch() {
	System.setProperty("webdriver.chrome.driver","/Users/Saranya/Downloads/chromedriver 4");	
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	
	
	static public void setText(WebElement element, String name){
		element.sendKeys(name);
	}
	
	static public void getClick(WebElement element){
		element.click();
	}
}
