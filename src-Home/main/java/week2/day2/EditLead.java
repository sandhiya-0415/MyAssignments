package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
		Thread.sleep(200);
		WebElement e1 = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		e1.sendKeys("sandhiya");

		WebElement e3 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		e3.click();

		String leadid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		System.out.println(leadid);
		Thread.sleep(3000);
		WebElement e4 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		e4.click();
		Thread.sleep(2000);
		String T = driver.getTitle();

		System.out.println("Page title:" + T);
		String T1 = "View Lead | opentaps CRM";

		if (T.equals(T1)) {
			System.out.println("Page Title matches");
		} else
			System.out.println("Page Title not matches");
		WebElement E1 = driver.findElement(By.linkText("Edit"));
		E1.click();

		WebElement e5 = driver.findElement(By.id("updateLeadForm_companyName"));
		e5.clear();
		e5.sendKeys("Wipro");

		WebElement e6 = driver.findElement(By.xpath("(//input[@name='submitButton'])[1]"));

		e6.click();

		String e7 = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		if (e7.contains("Wipro")) {
			System.out.println("matches");
		} else
			System.out.println("not matching");
		driver.close();
	}
}
