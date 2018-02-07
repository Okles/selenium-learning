package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//xpath = //tagname[@attribue='value'];
		//css ==tagname[attribute='value];
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("blablabla");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("blablabla");
		driver.findElement(By.cssSelector("input[id='Login']")).submit();
		//driver.findElement(By.cssSelector("#Login")).submit();
		//driver.findElement(By.xpath("//input[@id='Login']")).submit();
		 
		
	}

}
