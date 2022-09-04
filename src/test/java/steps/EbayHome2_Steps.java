package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class EbayHome2_Steps {

	WebDriver driver;
	public EbayHome2_Steps(Common_Steps common_steps)
	{
		this.driver = common_steps.getDriver();
	}
	@When("I search for {string} in {string} category")
	public void i_search_for_in_category(String string1, String string2) throws InterruptedException {
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys(string1);
		List<WebElement> cat =driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		for(WebElement x : cat)
		{
			if(x.getText().trim().toLowerCase().equals(string2.toLowerCase()))
			{
				x.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value = 'Search']")).click();
		Thread.sleep(3000);

		
		
	}

	
	
}
