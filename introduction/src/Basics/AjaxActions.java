package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.com/");
		Actions a= new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		//a.moveToElement(move).build().perform();
		//search for HITLER and double click it 
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("HITLER").doubleClick().build().perform();;
		
		//right click
		a.moveToElement(move).contextClick().build().perform();
		//drag and drop
		//a.moveToElement(move).dragAndDrop(source, target);
	
	}
}
