package marathon.salesforce;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 extends Parent{
	@BeforeTest
	@DataProvider(name="file")
	public String[][] getdata() throws IOException
	{
		String excel="Sheet1";
		String[][] val=Readexcel.readdata(excel);
		 return val;
	}
		
	@Test
	public void question(String Question,String data) throws InterruptedException {
		
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		String s=driver.getWindowHandle();
		driver.switchTo().window(s);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("content");
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		WebElement chatter= driver.findElement(By.xpath("//span[text()='Chatter']"));
		chatter.click();
		String t=driver.getTitle();
		System.out.println("Page Title" +t);
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		driver.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']")).sendKeys(Question);
		WebElement data1 = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank slds-rich-text-area__content slds-text-color_weak slds-grow']"));
		data1.sendKeys(data);
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		boolean b = driver.findElement(By.xpath("//span[text()=" +Question +"]")).isDisplayed();
		if(b==true)
			System.out.println("Questions appears");
		else
			System.out.println("Questions doesn't appears");
		
		driver.close();
			
		
		
		
	}
	

}
