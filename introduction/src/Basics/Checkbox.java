package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://spicejet.com/");
		
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected()); //true-false
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected()); //true-false
	
	
	}

}
