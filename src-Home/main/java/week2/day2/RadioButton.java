package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Your most favorite browser
		driver.findElement(
				By.xpath("//h5[text()='Your most favorite browser']/following::tbody[1]//label[text()='Edge']"))
				.click();

		// UnSelectable
		driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::div[1]//label[text()='Chennai']")).click();

		// unselect the button
		driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::div[1]//label[text()='Chennai']")).click();

		if (!(driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::div[1]//span[1]"))).isSelected())
			System.out.println("The radio button is deselcted");
		// Find the default select radio button
		String defaultBrowser = driver.findElement(By.xpath(
				"//h5[text()='Find the default select radio button']/following::div[1]//input[@checked='checked']//following::label[1]"))
				.getText();
		System.out.println("Default Browser :" + defaultBrowser);

		// Select the age group (only if not selected)

		boolean ageGroup = driver
				.findElement(
						By.xpath("//h5[text()='Select the age group (only if not selected)']//following::input[2]"))
				.isSelected();
		if (ageGroup)
			System.out.println("Age group is selected");
		else
			driver.findElement(
					By.xpath("//h5[text()='Select the age group (only if not selected)']//following::span[2]")).click();

	}

}
