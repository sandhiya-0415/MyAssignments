package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ParentClass;

public class Viewlead extends ParentClass {
	public Viewlead(RemoteWebDriver receiveddriver)
	{
		this.driver=receiveddriver;
		
	}
	public Viewlead lastviewpage()
	{
		String leadid=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println("Created new lead:"+leadid);
		return this;
	}

}
