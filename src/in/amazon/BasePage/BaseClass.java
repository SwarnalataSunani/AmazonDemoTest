package in.amazon.BasePage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");

	public void browserStart()
			 {
		//WebDriver driver2=driver;
        System.setProperty("webdriver.chrome.driver","D:\\OTA_Folder\\chromedriver.exe");
        log.info("Browser opened");
        driver = new ChromeDriver();
		
        driver.get("https://www.amazon.in/");
        log.info("https://www.amazon.in/ opened");   
			 }
	
	public void quiteBrowser()
	{
		driver.quit();
	}
}
