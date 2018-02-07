package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerInvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://qaclickacademy.com"); //otwarcie URL
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource()); // pobranie kodu strony
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
