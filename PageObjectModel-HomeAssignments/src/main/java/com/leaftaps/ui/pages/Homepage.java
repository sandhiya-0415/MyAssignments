package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ParentClass;

public class Homepage extends ParentClass {
	public Homepage(RemoteWebDriver receiveddriver)
	{
		this.driver=receiveddriver;
	}
	public createlead clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new createlead(driver,prop);
	}
	

}
