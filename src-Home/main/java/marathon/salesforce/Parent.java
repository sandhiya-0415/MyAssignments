package marathon.salesforce;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parent {
	public String excel;
	public RemoteWebDriver driver;

	@Parameters("url")
	@BeforeMethod
	public void bm(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@DataProvider(name = "file")
	public String[][] getdata() throws IOException {
		String excel = "Sheet1";
		String[][] val = Readexcel.readdata(excel);
		return val;
	}

}
