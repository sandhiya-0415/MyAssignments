package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectComponents {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Which is your favorite UI Automation tool?

		WebElement favouriteTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select dd = new Select(favouriteTool);
		dd.selectByVisibleText("Selenium");

		// Choose your preferred country.
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();

		// Confirm Cities belongs to Country is loaded
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();

		// Choose the Course
		driver.findElement(By.xpath("//h5[text()='Choose the Course']/following::div[1]//span")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		// Choose language randomly
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();

		// Select 'Two' irrespective of the language chosen
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"ui-icon ui-icon-triangle-1-s ui-c\"])[4]")).click();
		driver.findElement(By.xpath("//li[@id='j_idt87:value_1']")).click();

	}

}
