package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FormMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://makemytrip.com");
		
		System.out.println("Before choosing MultiCity option");
		boolean isVisible = driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed();
		System.out.println(isVisible);
		
		//choosing multicity
		System.out.println("After choosing MultiCity option");
		driver.findElement(By.xpath("//*[@id=\"multicity\"]/label")).click();
		System.out.println(isVisible);
		
		String hotText = driver.findElement(By.xpath("//*[@id=\"fd-wrap\"]/div[2]/h2")).getText();
		System.out.println(hotText);
		
		//calendar
		driver.findElement(By.xpath("//*[@id=\"hp-widget__depart\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"dp1512590544092\"]/div/div[1]/table/tbody/tr[3]/td[4]")).click();
					
		
		int count=driver.findElements(By.xpath("//input[@id='hp-widget__return']")).size();
		
		if (count!=0)
		{
			System.out.println("Verified, there are " + count + " occuriences present");
		}
		else
		{
			System.out.println("There are " + count+ " occurencies present");
		}
		
		
 
	}
 
}
