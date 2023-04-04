package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='attributes-list']//tbody//tr"));
		int rowcount = row.size();
		System.out.println("RowsCount for Table1 :" + rowcount);
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='attributes-list']//tbody//tr[2]//td"));
		int colcount = cols.size();
		System.out.println("Columns Count for Table1:" + colcount);

	}

}
