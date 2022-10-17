package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamal\\OneDrive\\Desktop\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		
								
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.netflix.com/");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("id_userLoginId")).sendKeys("Praveshmahat@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("pravesh");
		driver.findElement(By.className("login-button")).click();
		//driver.quit();
	
	
		

	}

}
