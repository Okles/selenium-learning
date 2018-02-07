package Basics;

import java.util.Iterator;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sslCertificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		//Desired capabilities
		DesiredCapabilities ch= DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.merge(ch);
		WebDriver driver = new ChromeDriver(options);
		
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		
		
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/17697/aus-vs-eng-5th-odi-england-tour-of-australia-2018/");
		Actions a= new Actions(driver); 
		//explicit wait
		WebDriverWait wd= new WebDriverWait(driver, 5);
		
		
	
		
		
		
		
		
	}

}
