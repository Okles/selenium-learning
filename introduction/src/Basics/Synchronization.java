package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		// implicit wait:
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys("nyc");
		driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='H-fromDate']")).sendKeys(Keys.ENTER);
		
		//explicit wait:
		WebDriverWait w=new WebDriverWait(driver,10);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"4164\"]/div[2]/div/a")));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sortContainer\"]/div/div[1]/div[2]/div/fieldset/ul/li[2]/button")));
		
		driver.findElement(By.xpath("//*[@id=\"4164\"]/div[2]/div/a")).click();

	

		
		

	}

}
