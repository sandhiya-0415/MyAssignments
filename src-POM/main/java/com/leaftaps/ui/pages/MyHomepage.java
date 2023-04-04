package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificmethods;

public class MyHomepage extends ProjectSpecificmethods {
	public MyHomepage() {
		
	}
public MyLeadpage clickLeads() {
	driver.findElement(By.linkText(prop.getProperty("MyHomepage.Leads.LinkText"))).click();
	return new MyLeadpage();
}
}
