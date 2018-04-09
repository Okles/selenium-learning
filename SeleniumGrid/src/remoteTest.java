import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class remoteTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		//DesiredCapabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("chrome");
		
		//Running a remote test - RemoteWD takes 2 arguments - server,capabilities
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.13:4441/wd/hub"),dc);		
		driver.get("http://google.com");
		
	}

}
