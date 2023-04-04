package com.leaftaps.ui.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadexcelData;
public class ProjectSpecificmethods {

		public String ExcelFilename;
		public static RemoteWebDriver driver;
		public FileInputStream fis;
		public static Properties prop;
		@Parameters({"url","browsername","language"})
		@BeforeMethod
		public void bm(String u,String b,String lang) throws IOException {
			if(lang.equals("english"))
			{
			fis=new FileInputStream("src/main/resources/english.properties");
			
			}
			else if(lang.equals("french"))
			{
			fis=new FileInputStream("src/main/resources/french.properties");
			
			}
			
			prop=new Properties();
			prop.load(fis);
			
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



