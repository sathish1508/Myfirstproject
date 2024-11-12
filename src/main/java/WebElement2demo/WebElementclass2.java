package WebElement2demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementclass2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.applitools.com/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("TestDemo");
		Thread.sleep(3000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Lenovo\\Downloads\\FSJD\\Eclipse\\Demo Projects\\SeleniumWebdriver\\Screenshotdemo\\username.png");
		FileHandler.copy(src, des);
	
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("NotSecure");
		Thread.sleep(2000);
		
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\Lenovo\\Downloads\\FSJD\\Eclipse\\Demo Projects\\SeleniumWebdriver\\Screenshotdemo\\password.png");
		FileHandler.copy(src1, des1);

		WebElement login = driver.findElement(By.id("log-in"));
		login.click();
		Thread.sleep(3000);
		
		File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des2 = new File("C:\\Users\\Lenovo\\Downloads\\FSJD\\Eclipse\\Demo Projects\\SeleniumWebdriver\\Screenshotdemo\\homepage.png");
		FileHandler.copy(src2, des2);
		
//		driver.close();
		
		
	}
}
