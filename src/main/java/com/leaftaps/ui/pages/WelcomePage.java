package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificmethods;

public class WelcomePage extends ProjectSpecificmethods {
	public WelcomePage() {
		
	}
	
	public MyHomepage ClickLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomepage();
		
	}

}
