package com.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamal\\OneDrive\\Desktop\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		
		//Parent p = new child  (WebDriver is the parent & chromedriver is the child)
		WebDriver driver = new ChromeDriver();
		// https://www.selenium.dev/documentation/webdriver/elements/locators/
		// <h1 id = "one" class = "two" name = "nm">Heading<h1> // webelement
		
		// visiting a page
		
		//driver.get("https://www.saucedemo.com/");
		
		
		// Element
		//<input class="input_error form_input" placeholder="Username" 
		//type="text" data-test="username" id="user-name" name="user-name"
		//autocorrect="off" autocapitalize="none" value="">
		
		
		// id 
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//name
		//driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		// className
		//driver.findElement(By.className("input_error")).sendKeys("standard_user");
		
		//tagName
		//driver.findElement(By.tagName("input")).sendKeys("standard_user");
		
		//Css selector
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
		// Xpath
		// Absoulte and relative
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		//linkText 
		driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
		//driver.findElement(By.linkText("Overview")).click();
		
		//partialLinkText
		//driver.findElement(By.partialLinkText("Getting")).click();

	}

}
