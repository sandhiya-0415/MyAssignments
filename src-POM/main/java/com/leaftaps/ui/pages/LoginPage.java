package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificmethods;

public class LoginPage extends ProjectSpecificmethods {
	public LoginPage()  {
		
		
	}
	public LoginPage enterusername() {
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		return this;
	}
	public LoginPage enterpassword() {
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		return this;
	}
	public WelcomePage clickLoginbutton_Positive() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
	public LoginPage clickLoginbutton_Negative() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}

}
