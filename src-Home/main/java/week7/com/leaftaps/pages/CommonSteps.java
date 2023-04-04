package week7.com.leaftaps.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import week7.com.leaftaps.base.Parent;


public class CommonSteps extends Parent {
	
	
	@Before
		public void browser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	driver.manage().window().maximize();
		
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.findElement(By.id("username")).sendKeys("DemoCSR");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
			driver.findElement(By.className("decorativeSubmit")).click();
			
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
			
	}
	
	@After
	public void closebrowser()
	{
		driver.close();
	}
	

}
