package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamal\\OneDrive\\Desktop\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//Above
		
		  
	      By username =RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		  driver.findElement(username).sendKeys("standard_user");
		  
		 // Below 
		 //By password = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
		 // driver.findElement(password).sendKeys("secret_sauce");
		  
		  //new one below
		  driver.get("https://www.saucedemo.com/");
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 WebElement login = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("password")));
		 login.click();
		 
		 //left - of
		 WebElement e1 = driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("app_logo")));
		 System.out.println(e1.getText());
		 
		 //right- of
		 WebElement e2 = driver.findElement(RelativeLocator.with(By.tagName("div")).toRightOf(By.className("inventory_item_name")));
		  System.out.println(e2.getText());
		  
		  //near
		  WebElement e3 = driver.findElement(RelativeLocator.with(By.tagName("a")).near(By.id("react-burger-menu-btn")));
		  System.out.println(e3.getText());
		  
	}
}
		 
		
	
		
		