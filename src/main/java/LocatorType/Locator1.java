package LocatorType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		
		driver.findElement(By.id("email")).sendKeys("emi@mail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234567");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logout")).click();
	}
}
