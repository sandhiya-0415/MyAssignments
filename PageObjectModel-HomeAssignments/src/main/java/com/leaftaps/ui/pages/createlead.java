package com.leaftaps.ui.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ParentClass;

public class createlead extends ParentClass{

	public createlead(RemoteWebDriver receiveddriver,Properties receivedprop)
	{
		this.driver=receiveddriver;
		this.prop=receivedprop;
		
	}
	public createlead clickcreatelead()
	{
		driver.findElement(By.linkText(prop.getProperty("createlead.clickcreatelead.linkText"))).click();
		return this;
	}
	public createlead givecompanyname(String cname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	public createlead givefirstname(String fname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	public createlead givelastname(String lname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	public Viewlead submitbutton1()
	{
		driver.findElement(By.name("submitButton")).click();
		return new Viewlead(driver);
	}
}
