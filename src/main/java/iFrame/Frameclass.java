package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameclass {

	public static void main(String[] args) throws Throwable {
		// 1. Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 2. Entering URL
		driver.get("https://magnus.jalatechnologies.com/");
		
		// 3. Entering Username
		WebElement Username = driver.findElement(By.id("UserName"));
		Username.sendKeys("training@jalaacademy.com");
		
		// 4. Entering Password
		WebElement Password = driver.findElement(By.name("Password"));
		Password.sendKeys("jobprogram");
		
		// 5. Clicking Login btn
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		btnLogin.click();
		Thread.sleep(3000);
		
		// 6. Clicking morebtn
		WebElement morebtn = driver.findElement(By.linkText("More"));
		morebtn.click();
		Thread.sleep(3000);
		
		// 7. clicking on Iframe tab
		WebElement Iframe = driver.findElement(By.linkText("iFrames"));
		Iframe.click();
		Thread.sleep(3000);
		
		// 8. Switching focus from main page to other page
		driver.switchTo().frame("iframe2");
		
		// 9. Clicking on Togglebtn which is present inside other frame
		WebElement toggle = driver.findElement(By.linkText("Toggle navigation"));
		toggle.click();
		
		// 10. Clicking on Employee tab inside the other page
		WebElement Emplytab = driver.findElement(By.linkText("Employee"));
		Emplytab.click();
		
		
	}
}
