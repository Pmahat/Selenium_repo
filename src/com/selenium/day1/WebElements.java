package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hamal\\OneDrive\\Desktop\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		// sendkeys()
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("Pravesh");
		
		// clear()
		username.clear();
		
		//getText()
		
		String s1 = driver.findElement(By.tagName("h4")).getText();
		System.out.println(s1);
		
	}

}
