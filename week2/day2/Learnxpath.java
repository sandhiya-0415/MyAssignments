package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnxpath {
	
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			WebElement elementUsername = driver.findElement(By.xpath("//input[@id='username']"));
			elementUsername.sendKeys("Demosalesmanager");
			WebElement elementpass = driver.findElement(By.xpath("//input[@id='password']"));
			elementpass.sendKeys("crmsfa");
			WebElement elogin = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
			elogin.click();
			WebElement crmsfa1 = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
			crmsfa1.click();

}}
