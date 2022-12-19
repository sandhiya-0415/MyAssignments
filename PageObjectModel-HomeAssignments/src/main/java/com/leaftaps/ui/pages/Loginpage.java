package com.leaftaps.ui.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ParentClass;

public class Loginpage extends ParentClass {
	public Loginpage(RemoteWebDriver receiveddriver,Properties receivedprop)
	{
		this.driver=receiveddriver;
		this.prop=receivedprop;
	}
	
	public Loginpage giveusername()
	{
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		return this;
	}
	public Loginpage givepassword()
	{
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		return this;
	}
	
	public welcomepage submitbutton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new welcomepage(driver);
	}

}
