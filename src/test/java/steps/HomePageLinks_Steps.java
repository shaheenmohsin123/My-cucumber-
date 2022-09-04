package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageLinks_Steps {
    
	WebDriver driver;
	public HomePageLinks_Steps(Common_Steps common_steps)
	{
		this.driver = common_steps.getDriver();
	}
	@When("I click on {string}")
	public void i_click_on(String string) throws InterruptedException {
	    driver.findElement(By.linkText(string)).click();
	    Thread.sleep(1000);
	}

	@Then("I validate that page navigates to {string} and title contains {string}")
	public void i_validate_that_page_navigates_to_and_title_contains(String url, String text) {
	    String actUrl= driver.getCurrentUrl();
	    String actText= driver.getTitle();
	    if(!actUrl.equals(url))
	    {
	    	fail("Page does not navigate to expected url");
	    }
	    if(!actText.contains(text))
	    {
	    	fail("Title mismatch");
	    }
	    	
	}

}
