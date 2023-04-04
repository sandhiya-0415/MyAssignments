package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// MOuse hover Lorel paris
		WebElement Brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions b1 = new Actions(driver);
		b1.moveToElement(Brand).perform();
		WebElement search = driver.findElement(By.linkText("L'Oreal Paris"));
		search.click();
		String t = driver.getTitle();
		System.out.println(t);
		if (t.contains("L'Oreal Paris")) {
			System.out.println("Title contains L'Oreal Paris");
		} else
			System.out.println("Title doesn't contains L'Oreal Paris");

		// Sort and select customer rated high
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		/*
		 * String s=driver.findElement(By.
		 * xpath("(//span[text()='Filters Applied']/following::div/span[text()='Shampoo'])[1]"
		 * )).getText(); if(s.contains("Shampoo")) {
		 * System.out.println("Filter Appilied"); } else
		 * System.out.println("Not Applied"); WebElement
		 * LPshampoo=driver.findElement(By.
		 * xpath("//div[text()=\"L'Oreal Paris Colour Protect Shampoo\"]"));
		 * LPshampoo.click(); String NewLP=driver.getWindowHandle();
		 * driver.switchTo().window(NewLP);
		 */

	}

}
