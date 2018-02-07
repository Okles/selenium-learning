package Basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.path2usa.com/travel-companions");
		Actions a= new Actions(driver); 
		
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		Thread.sleep(2000);
		//select November
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("November"))
				{
					driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
				}
		//22nd 
		
		//getting a list of days
		List<WebElement> dayList = driver.findElements(By.className("day"));

		int count=dayList.size();
		
		for (int i=0;i<count;i++)
		{
			String dayLabel = driver.findElements(By.className("day")).get(i).getText();
			if(dayLabel.equalsIgnoreCase("22"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
