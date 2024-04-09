package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://letcode.in/dropable");
        
        WebElement From = driver.findElement(By.id("draggable"));
        WebElement To = driver.findElement(By.id("droppable"));
        
        Actions actions = new Actions(driver);
        
        //actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
        
        actions.dragAndDrop(From, To).build().perform();

	}

}
