package week7.com.leaftaps.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import week7.com.leaftaps.base.Parent;

public class DuplicateLead extends Parent {
	@Given ("Click on Find Leads and then click on Phone Number for duplicatelead{string}")
	public void ClickFindLead(String pnumber)
	{
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}
	@And("Click on Find Leadsfor duplicatelead")
	public void flead() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
	}
	
	@And("Duplicate the lead")
	public void duplicatelead()
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
	}

}
