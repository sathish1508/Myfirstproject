package LocatorType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClass {

	public static void main(String[] args) throws Throwable {
		
//	1. Launch the browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
//	2. Enter URl	
	driver.get("https://www.saucedemo.com/");
		
//	3. Enter Username
	WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]")); // Using xpath.by attributes
	username.sendKeys("standard_user");
	
//	4. Enter password
	WebElement password = driver.findElement(By.xpath("//input[@name='password']")); // Using Xpath.by attributes
	password.sendKeys("secret_sauce");
	

//	5. Click on signin button
	WebElement loginbtn = driver.findElement(By.id("login-button")); // Using locator type ID
	loginbtn.click();
	Thread.sleep(3000);
	
//  6. Open Menu
	WebElement Menubtn = driver.findElement(By.id("react-burger-menu-btn")); // Using locator type ID
	Menubtn.click();
	Thread.sleep(3000);
	
//	7. Click on Logout button
	WebElement logout = driver.findElement(By.partialLinkText("Logout")); // Using locator type Partiallinktext
	logout.click();
	Thread.sleep(1000);
	
//	8. Closing the browser
	driver.close();
	}
	
}
