package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://spicejet.com/");
		
		//static dropdowns
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		Thread.sleep(1000);
		s.selectByValue("2"); 
		s.selectByIndex(6);
		s.selectByVisibleText("4");
		
		//dynamic dropdowns
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
	    driver.findElement(By.cssSelector("a[value='DEL']")).click();
		//driver.findElement(By.xpath("//a[@value='DEL'])[2]")).click(); - in case there are 2 instances
	    

 
	} 
}
