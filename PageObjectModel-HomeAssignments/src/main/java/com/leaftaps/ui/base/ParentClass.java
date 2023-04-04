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

import com.leaftaps.ui.utlis.Datafromexcel;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {
	public RemoteWebDriver driver;
	public FileInputStream fis;
	public static Properties prop;
	public String datasource;
	@Parameters({"browsername","url"})
	@BeforeMethod
	public void launch(String b,String l) throws IOException
	{
		if(b.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		if(b.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
						
		}
		driver.manage().window().maximize();
		driver.navigate().to(l);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		fis=new FileInputStream("src/main/resources/config.properties");
		prop=new Properties();
		prop.load(fis);
	}
	
	@DataProvider(name="file")
	public String[][] getdata() throws IOException{
		String[][] values=Datafromexcel.readdata(datasource);
		return values;
	}
	@AfterMethod
	public void finish()
	{
		driver.close();
	}
	

}
