package Utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverUtility {
	
	static WebDriver driver;

	public static WebDriver getDriver() {
		if(driver==null)
		{		
			File file = new File("D:/ews/driver/chromedriver.exe");
		    System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");		
		}
		
		return driver;
	}
	
	public static void tearDown() {
		driver.quit();
		driver=null;
		
	}
}
