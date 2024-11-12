package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ByMouse {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
// Norway capital Oslo		
		
		WebElement src = driver.findElement(By.id("box1"));
		WebElement des = driver.findElement(By.id("box101"));
		Actions action = new Actions(driver);
		action.clickAndHold(src).perform();
		action.release(des).perform();
		
// Sweden capital Stockholm		
		WebElement stck = driver.findElement(By.id("box2"));
		WebElement swd = driver.findElement(By.id("box102"));
		Actions action1 = new Actions(driver);
		action.clickAndHold(stck).perform();
		action.release(swd).perform();
		Thread.sleep(500);
		
// US capital Washington
		WebElement wshgtn = driver.findElement(By.id("box3"));
		WebElement us = driver.findElement(By.id("box103"));
		Actions action2 = new Actions(driver);
		action.clickAndHold(wshgtn).perform();
		action.release(us).perform();
		
//  Denmark capital Copenhagen
		WebElement cpngn = driver.findElement(By.id("box4"));
		WebElement dnmrk = driver.findElement(By.id("box104"));
		Actions action3 = new Actions(driver);
		action.clickAndHold(cpngn).perform();
		action.release(dnmrk).perform();
		
//  South Korea capital Seoul
		WebElement seol = driver.findElement(By.id("box5"));
		WebElement skore = driver.findElement(By.id("box105"));
		Actions action4 = new Actions(driver);
		action.clickAndHold(seol).perform();
		action.release(skore).perform();
		
// Italy captain Rome
		WebElement rme = driver.findElement(By.id("box6"));
		WebElement itly = driver.findElement(By.id("box106"));
		Actions action5 = new Actions(driver);
		action.clickAndHold(rme).perform();
		action.release(itly).perform();
		
// Spain capital Madrid
		WebElement mdrd = driver.findElement(By.id("box7"));
		WebElement spn = driver.findElement(By.id("box107"));
		Actions action6 = new Actions(driver);
		action.clickAndHold(mdrd).perform();
		action.release(spn).perform();
	}
}
