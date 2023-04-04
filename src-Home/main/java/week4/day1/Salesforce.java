package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> Newwindow = driver.getWindowHandles();
		List<String> indliswt = new ArrayList(Newwindow);
		driver.switchTo().window(indliswt.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("Title of the page:" + title);
		driver.close();
		driver.switchTo().window(indliswt.get(0));
		String parentwindow = driver.getTitle();
		System.out.println("parent window Title:" + parentwindow);
		driver.quit();

	}

}
