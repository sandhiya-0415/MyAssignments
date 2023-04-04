package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
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

		WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
		findLeads.click();

		String leadid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		System.out.println(leadid);
		Thread.sleep(3000);
		WebElement e4 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		e4.click();
		Thread.sleep(2000);
		WebElement e3 = driver.findElement(By.xpath("//a[text()='Delete']"));
		e3.click();
		WebElement findLeads1 = driver.findElement(By.linkText("Find Leads"));
		findLeads1.click();
		WebElement e2 = driver.findElement(By.xpath("//input[@name='id']"));
		e2.sendKeys(leadid);

		WebElement e11 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		e11.click();
		Thread.sleep(7000);
		String t = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(t);
		if (t.equals("No records to display"))
			System.out.println("Text Matches");
		else
			System.out.println("Not Matching");

	}
}
