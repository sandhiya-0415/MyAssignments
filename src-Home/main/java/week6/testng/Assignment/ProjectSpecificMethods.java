package week6.testng.Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	public String ExcelFilename;
	 RemoteWebDriver driver;
	@Parameters({"url","browser"})
	@BeforeMethod
		public void bm(String link,String typeb)
	{
		if(typeb.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
		if(typeb.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	
		driver.manage().window().maximize();
		driver.get(link);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
}
	@DataProvider(name="file")
	public String[][] getdata() throws IOException{
		String data1[][]=Testinfo.read(ExcelFilename);
		return data1;
	}
	@AfterMethod
	public void am()
	{
		driver.close();
	}
}