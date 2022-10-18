package com.selenium.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPractice {
 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamal\\OneDrive\\Desktop\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		
								
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		//Selecting all radio buttons
		List <WebElement> select = driver.findElements(By.cssSelector("input[name=\"color\"]"));
		
		for(int i=0; i< select.size();i++) {
		System.out.println(i);
			if(!select.get(i).isSelected()) {
				select.get(i).click();
			}
		}
	
		
		
		
		
	
	
		

	}

}
