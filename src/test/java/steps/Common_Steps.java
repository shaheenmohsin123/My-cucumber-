package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Common_Steps {
   private WebDriver driver;
	
    @Before(order= 0)
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
	      driver = new ChromeDriver();	
	    System.out.println("global B hook executed");
	
	}
    
    
	@After(order= 0)
	public void tearDown() throws InterruptedException
	{
		driver.quit();
		Thread.sleep(1000);
		System.out.println("global A hook executed");
	}
	
	
	
	public WebDriver getDriver()
	{
		return driver;
	}
}
