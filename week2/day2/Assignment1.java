package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.linkText("Create New Account"));
		e1.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e2=driver.findElement(By.xpath("//input[@name='firstname']"));
		e2.sendKeys("Sandhiya");
		
	
		WebElement e3=driver.findElement(By.xpath("//input[@name='lastname']"));
		e3.sendKeys("E");
		
		WebElement e4=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		e4.sendKeys("4433443343");
		
		WebElement e5=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		e5.sendKeys("sandhiya");
		
		WebElement e6=driver.findElement(By.xpath("//select[@id='day']"));
		
		Select Obj1=new Select(e6);
		Obj1.selectByIndex(2);
		
WebElement e7=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select Obj2=new Select(e7);
		Obj2.selectByVisibleText("Apr");
		
WebElement e8=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select Obj3=new Select(e8);
		Obj3.selectByValue("1989");
		
		WebElement e9=driver.findElement(By.xpath("//label[text()='Female']"));
		e9.click();
		
		
		
		
		
		


}}
