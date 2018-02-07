package Basics;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sugestiveDropdownPlusException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://fantasycricket.dream11.com/in/");
		Actions a= new Actions(driver); 
		//explicit wait
		WebDriverWait wd= new WebDriverWait(driver, 5);
		
		try
		{
			//code switch to alert and click on it
			
			driver.findElement(By.xpath("//*[@id=\"m_rtxtEmail1\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"m_rtxtEmail1\"]")).sendKeys("blabla");
			//driver.findElement(By.xpath("//*[@id=\"m_frmRegister\"]/div[1]/ul/li[1]/p")).sendKeys("blabla");

		
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"m_frmRegister\"]/div[1]/ul/li[1]/p")));
			driver.findElement(By.xpath("//*[@id=\"m_frmRegister\"]/div[1]/ul/li[2]/p")).click();
			
			
		}
		
		catch(Exception e)
		{
			//taking screenshot
			
			
		}
		
		
	}

}
