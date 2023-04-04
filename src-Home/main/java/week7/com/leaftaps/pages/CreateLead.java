package week7.com.leaftaps.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import week7.com.leaftaps.base.Parent;

public class CreateLead extends Parent
 {	
	@Given ("Click on create lead")
		public void clickcreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		
	}
	@And ("Enter the company name {string}")
	public void entercompanyname(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	@And ("Enter the first name {string}")
	public void enterfirstname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@And ("Enter the last name {string}")
public void enterlastname(String lname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@When ("Click on Submit button")
public void submitbutton() {
	driver.findElement(By.name("submitButton")).click();
}
	@Then ("Verify lead should be created")
	public void closebrowser() {
		System.out.println("Verified completed sucessfully page:"+driver.getTitle());
		
	}
	
}
