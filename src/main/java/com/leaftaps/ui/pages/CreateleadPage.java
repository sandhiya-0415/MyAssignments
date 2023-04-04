package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificmethods;

public class CreateleadPage extends ProjectSpecificmethods {

	public CreateleadPage(){
		
	}
	public CreateleadPage entercompanyname(String companyname) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	return this;
	}
	public CreateleadPage enterfirstname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		return this;
	}
	public CreateleadPage enterlastname() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	return this;
	}
	public ViewLead clicksubmitbutton() {
		
	
	driver.findElement(By.name("submitButton")).click();
	return new ViewLead();
	}
	
}
