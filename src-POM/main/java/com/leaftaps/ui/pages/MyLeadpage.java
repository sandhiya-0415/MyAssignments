package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificmethods;

public class MyLeadpage extends ProjectSpecificmethods {
	public MyLeadpage() {
		
	}
	public CreateleadPage Clickcreatelead()
	{
		driver.findElement(By.linkText(prop.getProperty("MyLeadpage.Clickcreatelead.linkText"))).click();
		return new CreateleadPage();
	}

}
