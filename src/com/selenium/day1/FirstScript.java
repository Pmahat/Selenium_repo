package com.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
 
	public static void main(String[] args) {
		// set the path of Executable browser driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamal\\OneDrive\\Desktop\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		
		//Parent p = new child  (WebDriver is the parent & chromedriver is the child)
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://selenium.dev");
		System.out.println(driver.getTitle());
		
//		// assertion
//		if(driver.getTitle().contains("ToolsQA")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
//		
//		
//		// locate by ID attribute
//		driver.findElement(By.id("firstName")).sendKeys("chinmay");
//		driver.findElement(By.id("lastName")).sendKeys("deshpande");
//		//Thread.sleep(2000);
//		//driver.findElement(By.id("gender-radio-1")).click();
//		
//		
//		// Locate by name attribute
//		driver.findElement(By.name("gender"));
//		
//		// locate the element by className
//		driver.findElement(By.className("practice-form-wrapper"));
		
		driver.quit();

	}

}
