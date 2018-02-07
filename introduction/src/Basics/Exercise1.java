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


public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.ebay.com");
		Actions a= new Actions(driver);
		
		//number of links on a webpage
		int linksNumber = driver.findElements(By.tagName("a")).size();
		System.out.println("There are " + linksNumber + " links present on a page");
		
		//number of links in a footer
		WebElement footer = driver.findElement(By.xpath("//*[@id=\"hlGlobalFooter\"]"));
		int footerLinksNumber = footer.findElements(By.tagName("a")).size();
		System.out.println("There are " + footerLinksNumber + " links present in a footer");

		//number of links in second footer column
		WebElement column = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul"));
		int columnLinksNumber = column.findElements(By.tagName("a")).size();
		System.out.println("There are " + columnLinksNumber + " links present in a second footer column");
		
		//printing link names from this section
		System.out.println("***********");
		String beforeClicking = null;
		String afterClicking;

		for(int i=0;i<columnLinksNumber; i++)
			{
			
				//System.out.println(column.findElements(By.tagName("a")).get(i).getText());
				if (column.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
				{
					beforeClicking = driver.getTitle();
					System.out.println(beforeClicking);
					column.findElements(By.tagName("a")).get(i).click();
					System.out.println("Site Map page has been opened");
					break;
				}
			}
			
				afterClicking = driver.getTitle();
				System.out.println(afterClicking);
				if(beforeClicking != afterClicking)
				{
					//boolean abc = driver.findElement(By.xpath("/html/body/div[2]/div[1]/h1")).isDisplayed();
					if (driver.getPageSource().contains("sitemap"))
					{
						System.out.println("PASS");
					}
				
				}
				else
				{
					System.out.println("FAIL");
				}
				
			}
		
		
		
}
			
	

