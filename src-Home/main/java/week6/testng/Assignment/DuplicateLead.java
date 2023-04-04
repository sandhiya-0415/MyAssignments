package week6.testng.Assignment;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import org.openqa.selenium.By;

import org.testng.annotations.Test;




public class DuplicateLead extends ProjectSpecificMethods {
	@Test(dataProvider = "file")
     public void runDuplicateLead(String username, String password, String phonenumber) throws InterruptedException {
		
    	 driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
		driver.close();
	}
	@BeforeTest
	public void setdata() {
		ExcelFilename = "duplicatelead";
	}

}
