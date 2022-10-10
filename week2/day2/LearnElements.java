package week2.day2;


	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class LearnElements {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			WebElement elementUsername = driver.findElement(By.id("username"));
			elementUsername.sendKeys("Demosalesmanager");
			WebElement elementpass = driver.findElement(By.id("password"));
			elementpass.sendKeys("crmsfa");
			WebElement elogin = driver.findElement(By.className("decorativeSubmit"));
			elogin.click();
			WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
			crmsfa.click();
			WebElement Leads = driver.findElement(By.linkText("Leads"));
			Leads.click();
			WebElement CLeads = driver.findElement(By.linkText("Create Lead"));
			CLeads.click();
			
			
			WebElement eempl=driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select dd=new Select(eempl);
			dd.selectByVisibleText("LEAD_DIRECTMAIL");
			
			WebElement eempl1=driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select dd1=new Select(eempl1);
			dd1.selectByValue("IND_DISTRIBUTION");
			
			WebElement eemp2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select dd2=new Select(eemp2);
			dd2.selectByIndex(2);
			
			
			
		}
	}



