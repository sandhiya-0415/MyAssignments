package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ParentClass;

public class welcomepage extends ParentClass {

	public welcomepage(RemoteWebDriver receiveddriver)
	{
		this.driver=receiveddriver;
	}
	public Homepage clickcrmsfa()
	{
		driver.findElement(By.xpath("//div[@for='crmsfa']/a")).click();
		return new Homepage(driver);
	}
}
