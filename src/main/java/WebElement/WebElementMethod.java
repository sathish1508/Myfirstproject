package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); // Here we can import both selenium web driver, Chrome Driver, WebElement
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		WebElement username = driver.findElement(By.id("UserName"));
		username.sendKeys("training@jalaacademy.com");
		WebElement Password = driver.findElement(By.id("Password"));
		Password.sendKeys("jobprogram");
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		btnLogin.click();
		
		System.out.println("Program Successfully Executed");
	}
}
