package week8.day2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnProperties {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("src/main/resources/configuration.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		
	
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
		
		WebElement eempl=driver.findElement(By.id("createLeadForm_companyName"));
		eempl.sendKeys("Wipro");
		
		WebElement eempl1=driver.findElement(By.id("createLeadForm_firstName"));
		eempl1.sendKeys("Sandhiya");
		
		WebElement eempl2=driver.findElement(By.id("createLeadForm_lastName"));
		eempl2.sendKeys("E");
		
		WebElement eempl3=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		eempl3.sendKeys("San");
		
		WebElement eempl4=driver.findElement(By.id("createLeadForm_departmentName"));
		eempl4.sendKeys("Implementations");
		
		WebElement eempl5=driver.findElement(By.id("createLeadForm_description"));
		eempl5.sendKeys("client implementations");
		
		WebElement eempl6=driver.findElement(By.id("createLeadForm_primaryEmail"));
		eempl6.sendKeys("test@gmail.com");
		
		WebElement eempl7=driver.findElement(By.name("submitButton"));
		eempl7.click();
		
		
		
		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();
		
		WebElement desc=driver.findElement(By.id("updateLeadForm_description"));
		desc.clear();
		
		WebElement imp=driver.findElement(By.id("updateLeadForm_importantNote"));
		imp.sendKeys("important notice-test");
		
		WebElement update=driver.findElement(By.name("submitButton"));
		update.click();
		
String T=driver.getTitle();
		
		System.out.println("Page Tiltle:"+ T);
	}
}
