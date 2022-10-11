package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamal\\OneDrive\\Desktop\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		
		//Parent p = new child  (WebDriver is the parent & chromedriver is the child)
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//Above
		By username  = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		driver.findElement(username).sendKeys("standard_user");
		
		//Below
		By password  = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
		driver.findElement(password).sendKeys("secret_sauce");
		
		
		
		//left-of
		
		
		//right-of
		
		
		//near
			}

}
