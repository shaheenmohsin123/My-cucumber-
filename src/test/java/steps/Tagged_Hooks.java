package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Tagged_Hooks {
	private WebDriver driver;
	public Tagged_Hooks(Common_Steps common_steps)
	{
		driver = common_steps.getDriver();
	}
	
	@Before(value= "@setCookies",order= 1)
    public void setCookies()
	{
		System.out.println("Scenario specific Before hook-set cookies executed");
	}
	
	@After(value="@Test",order=1)
    public void Test()
    {
    	System.out.println("scenario specific After hook executed");
    }
	
}
