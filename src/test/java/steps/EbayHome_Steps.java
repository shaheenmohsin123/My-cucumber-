package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {
    WebDriver driver;
	public EbayHome_Steps(Common_Steps common_steps)
	{
		this.driver = common_steps.getDriver();
	}
    @Given("I am on Ebay Home Page")
	public void i_am_on_Ebay_Home_Page() {
	  
      driver.get("https://www.ebay.com/");
	}

	@When("I click on Advanced Link")
	public void i_click_on_Advanced_Link() {
	 driver.findElement(By.linkText("Advanced")).click(); 
	}

	@Then("I navigate to Advanced Search page")
	public void i_navigate_to_Advanced_Search_page() {
		String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
		String actUrl = driver.getCurrentUrl();
		if(!expUrl.equals(actUrl))
		{
			fail("Page does not navigate to expected page");
		}
	
		@When("I click sell Link")
		public void i_click_sell_Link() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("I navigate to the sell page")
		public void i_navigate_to_the_sell_page() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}






	   
	}



}
