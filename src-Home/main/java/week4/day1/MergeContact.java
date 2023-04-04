package week4.day1;

//MergeContact-Assignment1

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {
	public static void main(String[] args) throws InterruptedException {

		// * 1. Launch URL "http://leaftaps.com/opentaps/control/login"

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// 2. Enter UserName and Password Using Id Locator

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link

		driver.findElement(By.linkText("CRM/SFA")).click();

		// 5. Click on contacts Button

		driver.findElement(By.linkText("Contacts")).click();

		// 6. Click on Merge Contacts using Xpath Locator

		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		// 7. Click on Widget of From Contact

		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();

		// Moving to new Window
		Set<String> Win = driver.getWindowHandles();
		List<String> newwin = new ArrayList<String>(Win);
		driver.switchTo().window(newwin.get(1));
		driver.manage().window().maximize();
		// * 8. Click on First Resulting Contact
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		// switching the control to the first window
		driver.switchTo().window(newwin.get(0));
		// * 9. Click on Widget of To Contact
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();

		// Moving to new Window

		Set<String> Win1 = driver.getWindowHandles();
		List<String> newwin1 = new ArrayList<String>(Win1);
		driver.switchTo().window(newwin1.get(1));
		driver.manage().window().maximize();

		// * 10. Click on Second Resulting Contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		// switching the control to the first window
		driver.switchTo().window(newwin1.get(0));

		// * 11. Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("(//a[contains(text(),'Merge')])[2]")).click();

		// 12. Accept the Alert

		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		// 13. Verify the title of the page
		String titlepage = driver.getTitle();
		System.out.println("title of page:" + titlepage);

	}

}
