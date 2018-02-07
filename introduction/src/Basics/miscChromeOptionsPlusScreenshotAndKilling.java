package Basics;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;




public class miscChromeOptionsPlusScreenshotAndKilling {

	public static void main(String[] args) throws IOException {
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
		
		driver.manage().window().maximize();
		/** OR BELOW:
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		**/
		driver.manage().deleteAllCookies();
		/**delete particular cookie
		driver.manage().deleteCookieNamed("cookie name");
		**/
		
		driver.get("http://www.google.com");
		
		//screenshots 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String location = "D://screenshot.png";
		FileUtils.copyFile(src,new File(location));
		System.out.println("A file has been saved in a following location: " + location);
		
		//killing a process
		WindowsUtils.killByName("EXCEL.EXE");
		
		 
		

	}

}