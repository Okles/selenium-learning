package Basics;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tablesGrids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/17697/aus-vs-eng-5th-odi-england-tour-of-australia-2018/");
		Actions a= new Actions(driver); 
		//explicit wait
		WebDriverWait wd= new WebDriverWait(driver, 5);
		
		WebElement tableEngland = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowCont = tableEngland.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = tableEngland.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int sum = 0;
		
		
		for (int i=0;i<count-2;i++)
			{
			
			String value = tableEngland.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueInt = Integer.parseInt(value);
			sum = sum + valueInt;
			
			}
		System.out.println("A sum without Extras is: " + sum);
		
		System.out.println("Extras: " + driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue = Integer.parseInt(Extras);
		int TotalSumValue = sum+extrasValue;
		System.out.println("***");
		System.out.println("A total value is: " + TotalSumValue);

		String actualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int actualTotalValue = Integer.parseInt(actualTotal);
		
		if(actualTotalValue==TotalSumValue)
		{
			System.out.println("A count matches! :)");
		}
		else
		{
			System.out.println("A count does not match :( ");
		}
			
	}

}
