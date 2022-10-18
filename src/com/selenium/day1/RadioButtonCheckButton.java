package com.selenium.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCheckButton {
 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamal\\OneDrive\\Desktop\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		
								
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		///Selecting all radio buttons
		List <WebElement> select = driver.findElements(By.cssSelector("input[name=\"color\"]"));
		
		for(int i=0; i< select.size();i++) {
			System.out.println(i);
			if(!select.get(i).isSelected()) {
				select.get(i).click();
			}
		}
		// Arrangement
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		// Action
//		WebElement checkBoxOne = driver.findElement(By.cssSelector("input[value=\"option-1\"]"));
//		checkBoxOne.click();
//		checkBoxOne.click();
//		// Assertion
//		if(checkBoxOne.isSelected()) {
//			System.out.println("Checkbox is selected");
//		}
//		else {
//			System.out.println("Check box is not selected");
//		}
//		
		
		
		// selecting all the check box
		
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		
		for(int i = 0 ; i < checkboxes.size() ; i++ ) {
			System.out.println(i);
			if(!checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
			
		}
		// Radio buttons
		
		driver.findElement(By.cssSelector("input[value=\"green\"]")).click();
		
		if(driver.findElement(By.cssSelector("input[value=\"green\"]")).isSelected()){
			System.out.println("Radio button selected");
		}
		else {
			System.out.println("Radio button not selected");
		}
		
		//Selecting all radio buttons
				List <WebElement> select1 = driver.findElements(By.cssSelector("input[name=\"color\"]"));
				
				for(int i=0; i< select1.size();i++) {
					System.out.println(i);
					if(!select1.get(i).isSelected()) {
						select1.get(i).click();
					}
				}
				
		
		
	
	
		

	}

}
