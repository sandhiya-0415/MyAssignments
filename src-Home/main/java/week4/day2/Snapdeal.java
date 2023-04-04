package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Sports Shoes\"][1]")).click();
		String Shoecount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Show count" + Shoecount);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		// select low to high sort from dropdown
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();

		/*
		 * Select s=new Select(sort); s.selectByIndex(1);
		 */
		WebElement min = driver.findElement(By.xpath("//input[@name='fromVal']"));
		min.clear();
		min.sendKeys("900");
		WebElement max = driver.findElement(By.xpath("//input[@name='toVal']"));
		max.clear();
		max.sendKeys("2000");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		Thread.sleep(2000);
		/*
		 * Not working
		 * driver.findElement(By.xpath("//label[@for='Color_s-Yellow']")).click();
		 */
		String Shoetype = driver.findElement(By.xpath("//h1[@class='category-name']")).getText();
		// verify filter application
		if (Shoetype.contains("Training Shoes")) {
			System.out.println("Shoe type filter applied");
		} else
			System.out.println("Shoe type filter not applied");
		String Price = driver.findElement(By.xpath("//a[@data-key='Price|Price']")).getText();
		System.out.println(Price);
		if (Price.contains("900") && Price.contains("2000")) {
			System.out.println("price Filter applied");
		} else
			System.out.println("Price filter not applied");
		/*
		 * Not working String
		 * color=driver.findElement(By.xpath("//a[@data-key=\"Color_s|Color\"]")).
		 * getText();
		 *
		 * if(color.equalsIgnoreCase("yellow")) {
		 * System.out.println("Color filter applied"); } else
		 * System.out.println("Color filter not applied");
		 */
		// mouse hover
		WebElement img = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(img).perform();
		driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();
		// Moving to new window
		String newwindow = driver.getWindowHandle();
		driver.switchTo().window(newwindow);
		String Priceval = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Price val:" + Priceval);
		// Taking a screenshot
		TakesScreenshot scr = (driver);
		// specifying the output format of the file using .FILE
		File srcfile = scr.getScreenshotAs(OutputType.FILE);
		File dsnfile = new File("C:\\Users\\SANDHIYA\\Desktop\\testcase\\Quick1.png");
		// creating folder inside eclipse and saving the screenshot
		FileUtils.copyFile(srcfile, dsnfile);
		driver.close();
		driver.quit();

	}
}
