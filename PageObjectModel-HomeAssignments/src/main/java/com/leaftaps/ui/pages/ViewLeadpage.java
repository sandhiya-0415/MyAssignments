package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ParentClass;

public class ViewLeadpage extends ParentClass {
	private String leadID;

	public ViewLeadpage(RemoteWebDriver receiveddriver,String receivedleadID)
	{
		this.driver=receiveddriver;
		this.leadID=receivedleadID;
		
	}
	
	public ViewLeadpage deletelead()
	{
		driver.findElement(By.linkText("Delete")).click();
		return this;
	}
public ViewLeadpage checkfordeletedlead()
{
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}
	return this;
}
public ViewLeadpage editlead(String newcname)
{
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(newcname);
	driver.findElement(By.name("submitButton")).click();
	return this;
}
public ViewLeadpage duplicatelead()
{
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.name("submitButton")).click();
	return this;
}
}
