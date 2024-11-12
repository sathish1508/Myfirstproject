package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class Screen_shot {


	public static void main(String[] args) throws IOException, Throwable {
		 WebDriver driver = new ChromeDriver(); // Imported WebDriver, ChromeDriver
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.id("user-name")); //Imported WebElement, By.ById
		username.sendKeys("standard_user");
		Thread.sleep(3000);
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Imported TakesScreenshot, FileHandler & OutputType. File from java.io
		String random = RandomString.make(2); // imported Randomstring & imported IOException
		
		File des = new File("C:\\Users\\Lenovo\\Downloads\\FSJD\\Eclipse\\Demo Projects\\SeleniumWebdriver\\Screenshot\\"+random+".jpg");
		FileHandler.copy(scr, des);
				
		// Step 1 till entering username
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Imported TakesScreenshot, FileHandler & OutputType. File from java.io
		String random1 = RandomString.make(2); // imported Randomstring & imported IOException
		
		File des1 = new File("C:\\Users\\Lenovo\\Downloads\\FSJD\\Eclipse\\Demo Projects\\SeleniumWebdriver\\Screenshot\\"+random1+".jpg");
		FileHandler.copy(scr1, des1);
				
		// Step 2 till entering password 
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();
		Thread.sleep(3000);
		
		
		File scr2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Imported TakesScreenshot, FileHandler & OutputType. File from java.io
		String random2 = RandomString.make(2); // imported Randomstring & imported IOException
		
		File des2 = new File("C:\\Users\\Lenovo\\Downloads\\FSJD\\Eclipse\\Demo Projects\\SeleniumWebdriver\\Screenshot\\"+random2+".jpg");
		FileHandler.copy(scr2, des2);
		
		// Step 3 Redirected to homepage after login
				
	}
}
