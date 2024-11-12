package WebElementDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();  // here we can import WebDriver & ChromeDriver
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.id("user-name")); // here we can import WebElement & Selenium.By
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();
		
		System.out.println("Tried with new demo page");
	}
}
