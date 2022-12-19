package com.leaftaps.ui.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ParentClass;

public class MergeLead extends ParentClass{
	public static String leadID;
	public MergeLead(RemoteWebDriver receiveddriver)
	{
		this.driver=receiveddriver;
		
	}
	public MergeLead ClickMergeContacts() {
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		return this;
	}
	public MergeLead getfirstlead(String lname) throws InterruptedException{
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(lname);
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		Thread.sleep(1000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		return this;
	}
	
	public MergeLead getsecondlead(String lname2) throws InterruptedException
	{
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(lname2);
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return this;
	}
	
	public MergeLead verifyMergelead()
	{
		driver.findElement(By.linkText("Find Contacts")).click();
	
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("lead found");
		} else {
			System.out.println("lead not found");
		}
		return this;
	}
	

}
