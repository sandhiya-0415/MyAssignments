package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateleadSteps {
	ChromeDriver driver;
	@Given("Open the Chrome Browser,maximize and set the timeout")
	public void setupbrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@And("Load the Application url {string}")
	public void openURL( String u) {
		driver.get(u);
	}
	@And("Enter Username {string}")
	public void enterusername(String userid) {
		driver.findElement(By.id("username")).sendKeys(userid);
	}
	@And("Enter password {string}")
			public void enterpass(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
			}
	@And("Click on DecorativeSubmit")
	public void decorativesubmit() {
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Logged in sucessfully");
		
	}
	
			}
