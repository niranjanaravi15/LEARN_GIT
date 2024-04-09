package org.openqa.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
	
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		//1.Select By Index
		WebElement dropDown1 = driver.findElement(By.id("fruits"));
		Select select = new Select(dropDown1);
		select.selectByIndex(1);
	}

}
