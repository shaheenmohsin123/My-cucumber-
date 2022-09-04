package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdnancedSearch_Steps {
	WebDriver driver;
	public EbayAdnancedSearch_Steps(Common_Steps common_steps)
	{
		this.driver = common_steps.getDriver();
	}
	@Given("Iam on Ebay Advanced Search Page")
	public void iam_on_Ebay_Advanced_Search_Page() {
	   
	    driver.get("https://www.ebay.com/sch/ebayadvsearch");
	   
	}

	@When("I click on Ebay Logo")
	public void i_click_on_Ebay_Logo() {
	   driver.findElement(By.linkText("Home")).click();
	}

	@Then("I am navigated to Ebay Home Page")
	public void i_am_navigated_to_Ebay_Home_Page() {
	  String expUrl = "https://www.ebay.com/";
	  String actUrl = driver.getCurrentUrl();
	  if(!expUrl.equals(actUrl))
	  {
		 fail("Not the Expected page");
	  }
	
	
	  
	  
	}



}
