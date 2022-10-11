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
		driver.quit();

	}

}
