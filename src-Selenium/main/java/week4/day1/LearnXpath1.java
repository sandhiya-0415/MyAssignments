package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement froms = driver.findElement(By.xpath("//table[@id='tableTopMenu']//tr[2]//td/input[@id='txtStationFrom']"));
		froms.clear();
		froms.sendKeys("ms");
		froms.sendKeys(Keys.TAB);
		
		WebElement fromt = driver.findElement(By.xpath("//table[@id='tableTopMenu']//tr[2]//td/input[@id='txtStationTo']"));
		fromt.clear();
		fromt.sendKeys("mdu");
		fromt.sendKeys(Keys.TAB);
		
		WebElement fromd = driver.findElement(By.xpath("//table[@id='tableTopMenu']//tr[1]//td[6]/input[@id='chkSelectDateOnly']"));
		fromd.click();
		
		fromd.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		


	}}
