package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome1_Steps {
  
	WebDriver driver;
	public EbayHome1_Steps(Common_Steps common_steps)
	{
		this.driver = common_steps.getDriver();
	}
	
	@Given("I am in Ebay Home Page")
	public void i_am_in_Ebay_Home_Page() {
	   driver.get("https://www.ebay.com/");
	}

	@When("Search for {string}")
	public void search_for(String str1) throws InterruptedException {
	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys(str1);
	    driver.findElement(By.cssSelector("input[value = 'Search']")).click();
	    Thread.sleep(1000);
	}

	@Then("validate atleast {int} search items present")
	public void validate_atleast_search_items_present(int count) {
	   String itemCount = driver.findElement(By.xpath("//span[contains(text(),'13,000')]")).getText().trim();
	   String itemCount2 = itemCount.replace(",", "");
	     int  itemCountInt =  Integer.parseInt(itemCount2);
	     if(itemCountInt <= count)
	     {
	    	fail("Less than 1000 results shown");
	     }
	     
	     
	     
	}
}
