package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hamal\\OneDrive\\Desktop\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		// sendkeys()
		//driver.findElement(By.id("email_create")).sendKeys("praveshmahat@gmail.com");
		
		
		
		
		// clear()
		//driver.findElement(By.id("email_create")).clear();
		
		
		
		//click()
		//driver.findElement(By.id("email_create")).sendKeys("praveshmahat@gmail.com");
        //driver.findElement(By.id("SubmitCreate")).click();
//		driver.findElement(By.id("customer_firstname")).sendKeys("Pravesh");
//		driver.findElement(By.id("customer_lastname")).sendKeys("Mahat");
//		driver.findElement(By.id("passwd")).sendKeys("Myname101!");
//		driver.findElement(By.cssSelector("input[name= \"firstname\"]")).sendKeys("Pravesh");
//		driver.findElement(By.cssSelector("input[name=\"lastname\"]")).sendKeys("Mahat");
//		driver.findElement(By.id("address1")).sendKeys("305 Love lane");
//		driver.findElement(By.id("city")).sendKeys("Dallas");
//		driver.findElement(By.id("id_state")).sendKeys("Texas");
//		driver.findElement(By.id("postcode")).sendKeys("76235");
//		driver.findElement(By.id("id_country")).sendKeys("US");
//		driver.findElement(By.id("other")).sendKeys("No comments yet");
//		driver.findElement(By.id("phone_mobile")).sendKeys("2142225252");
//		driver.findElement(By.id("alias")).sendKeys("305 Love lane");
//		driver.findElement(By.id("submitAccount")).click();

		
		//getAttribute()
		//String val = driver.findElement(By.id("email_create")).getAttribute("class");
		//System.out.println(val);
		
		
		//getText()
		//String val1 = driver.findElement(By.tagName("h3")).getText();
		//System.out.println(val1);
		
		//getCssValue
		//String val6 = driver.findElement(By.tagName("h3")).getCssValue("color");
		//System.out.println(val6);
		
		//getTagName()
		//String val2  = driver.findElement(By.id("email_create")).getTagName();
		//System.out.println(val2);
		
		
		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category#/");
		
		//isDisplayed()
		boolean val3 = driver.findElement(By.cssSelector("input[name=\"layered_id_attribute_group_1\"]")).isDisplayed();
		System.out.println(val3);
		
		//isEnabled()
		boolean val4 = driver.findElement(By.cssSelector("input[name=\"layered_id_attribute_group_1\"]")).isEnabled();
		System.out.println(val4);
		
		//isSelected()
		driver.findElement(By.cssSelector("input[name=\"layered_id_attribute_group_1\"]")).click();
		boolean val5 = driver.findElement(By.cssSelector("input[name=\"layered_id_attribute_group_1\"]")).isSelected();
		System.out.println(val5);
		
		//getSize()
		System.out.println(driver.findElement(By.cssSelector(".layered_filter")).getSize());
		
		//getLocation()
		System.out.println(driver.findElement(By.cssSelector(".layered_filter")).getLocation());
		
		//getCssValue
		String val6 = driver.findElement(By.tagName("h1")).getCssValue("color");
		System.out.println(val6);
		
		
		driver.quit();
		
		
		
	}

}
