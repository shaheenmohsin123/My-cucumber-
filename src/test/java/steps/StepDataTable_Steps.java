package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class StepDataTable_Steps {

	WebDriver driver;
	public StepDataTable_Steps(Common_Steps common_steps)
	{
		this.driver = common_steps.getDriver();
	}
	@When("I Advanced search  an item")
	public void i_Advanced_search_an_item(DataTable dataTable) throws InterruptedException {
	    driver.findElement(By.cssSelector("#_nkw")).sendKeys(dataTable.cell(1, 0));
	    driver.findElement(By.cssSelector("#_ex_kw")).sendKeys(dataTable.cell(1, 1));
	    driver.findElement(By.cssSelector("input[name='_udlo']")).sendKeys(dataTable.cell(1, 2));
	    driver.findElement(By.cssSelector("input[name='_udhi']")).sendKeys(dataTable.cell(1, 3));
	    driver.findElement(By.cssSelector("#searchBtnLowerLnk")).click();
	    Thread.sleep(3000);
	}


}
