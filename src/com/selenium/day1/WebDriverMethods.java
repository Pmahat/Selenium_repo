package com.selenium.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hamal\\OneDrive\\Desktop\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		// get()
		//driver.get("https://www.bbc.com/");
		
		// manage()
		
		//driver.manage().window().maximize();
		
		//driver.manage().window().fullscreen();
		
		// getCurrentUrl()
		
		//String myUrl = driver.getCurrentUrl();
		//System.out.println(myUrl);
		
		// getTitle()
		
		//String myTitle = driver.getTitle();
		//System.out.println(myTitle);
		
		//getPageSource()
		//String pageSource= driver.getPageSource();
		
		//navigate()
		//driver.navigate().to("https://www.foxsports.com/");
		
		//driver.close();
		
		//findElement()
		//WebElement w1= driver.findElement(By.id("user-identifier-input"));
		//WebElement w2 = driver.findElement(By.id("password-input"));
		
		//findElements()
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> item = driver.findElements(By.className("inventory_item"));
		 System.out.println(item.size());
		

		// quit() // closes all browser tabs

		//driver.quit();
		
		// close() //closes current tab
		//driver.close();
		

	}

}
