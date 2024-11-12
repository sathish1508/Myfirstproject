package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ByMousedoubleclick {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
//		WebElement doble = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
//		action.doubleClick(doble).perform();							// doubleclick is for double left click of mouse
		
//		WebElement rghtClk = driver.findElement(By.id("rightClickBtn"));  
//		action.contextClick(rghtClk).perform();    						// contextclick is for right click
		
		WebElement clk = driver.findElement(By.id("lZS8U"));
		action.click(clk).perform();									// click is for general left click
	
	}



}
