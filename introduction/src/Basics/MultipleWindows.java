package Basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://accounts.google.com/signin/v2");
		Actions a= new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());
		Set<String>ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());

	}

}
