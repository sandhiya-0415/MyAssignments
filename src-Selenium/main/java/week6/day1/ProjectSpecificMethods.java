package week6.day1;

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
import week6.day2.ReadexcelData;


public class ProjectSpecificMethods {
	public String ExcelFilename;
	RemoteWebDriver driver;
	@Parameters({"url","browsername"})
	@BeforeMethod
	public void bm(String u,String b) {
		
		if(b.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		}
		
		else if	(b.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
	}
		else
			{
			System.out.println("Give the correct browser");
			}
		driver.manage().window().maximize();
		driver.get(u);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			}
	@DataProvider(name="file")
	public String[][] Sendata() throws IOException
	{
		String[][] data1=ReadexcelData.Exceldata(ExcelFilename);
		return data1;
	}
	@AfterMethod()
	public void am(){
		driver.close();
	}

}
