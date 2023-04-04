package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChittorgarhWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[contains(text(),'STOCK MARKET')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'NSE Bulk Deals')])[1]")).click();
		// storing all the rows in the list
		List<WebElement> rows = driver
				.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr"));
		List<String> colval1 = new ArrayList<String>();
		Set<String> cols = new HashSet<String>();
		// String[] colvals = null;
		// calculating the number of rows
		int rowcount = rows.size();
		System.out.println("RowCount:" + rowcount);
		for (int i = 1; i < rowcount; i++) {
			colval1.add(driver.findElement(By.xpath(
					"//table[@class='table table-bordered table-condensed table-striped']//tr[" + i + "]//td[3]"))
					.getText());
		}
		for (String eachval : colval1) {
			if (!cols.add(eachval)) {
				System.out.println("Duplicates:" + eachval);
			}

		}
	}
}
