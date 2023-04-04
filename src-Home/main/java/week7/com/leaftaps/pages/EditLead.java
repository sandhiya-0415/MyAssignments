package week7.com.leaftaps.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import week7.com.leaftaps.base.Parent;

public class EditLead extends Parent{
	
	@Given("Click on Find Leads and then click on Phone Number for editlead{string}")
	public void Findlead(String pnumber)
	{
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		
	}
	@And("Click on Find Leads for editelead")
	public void ClickFindLeads() throws InterruptedException
	{
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@And("Edit the lead and update the company name{string}")
	public void UpdateLead(String cname)
	{
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
	}
	
}
