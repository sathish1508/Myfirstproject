package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String titleName = driver.getTitle();
		System.out.println("Title of my current page is: "+titleName);
		
		String getUrl = driver.getCurrentUrl();
		
		System.out.println("Web Page URL: " + getUrl);
		driver.close();
		
		

	
		
	}
}
