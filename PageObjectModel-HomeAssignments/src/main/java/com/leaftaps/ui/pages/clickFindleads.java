package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ParentClass;

public class clickFindleads extends ParentClass{
	public static String leadID;
	public clickFindleads(RemoteWebDriver receiveddriver)
	{
		this.driver=receiveddriver;
		
	}
public clickFindleads findleads(String pnumber)
{
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnumber);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	return this;
}
public ViewLeadpage getfirstleadid() throws InterruptedException
{
	Thread.sleep(2000);
	leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return new ViewLeadpage(driver,leadID);
}

}
