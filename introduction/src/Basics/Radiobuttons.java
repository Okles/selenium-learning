package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");
	options.addArguments("disable-infobars");
	WebDriver driver = new ChromeDriver(options);

	driver.get("http://echoecho.com/htmlforms10.htm");
	driver.findElement(By.xpath("//input[@value='Milk']")).click();
	int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
	
	 
	 
	for (int i=0; i<count;i++)
	{
		//driver.findElements(By.xpath("//input[@name='group1']")).get(1).click();;
		String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");

		if (text.equals("Cheese"))
		{
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();	
			
		}
	} 
	
	}
}
