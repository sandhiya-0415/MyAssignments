package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
		driver.manage().window().maximize();

		// click and confirm the title
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following::button[1]/span")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();

		// Confirm if the button is disabled.
		WebElement buttonDisabled = driver
				.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following::button[1]"));
		String dis = buttonDisabled.getAttribute("class");
		Boolean disabled = dis.contains("disabled");
		/*
		 * isEnabled() is not working
		 *
		 * Boolean enabled=driver.findElement(By.
		 * xpath("//h5[text()='Confirm if the button is disabled.']/following::button[1]/span"
		 * )).isEnabled();
		 */
		if (disabled)
			System.out.println("The button is disabled");
		else
			System.out.println("The button is enabled");

		// Find the position of the Submit button
		Point location = driver
				.findElement(By.xpath(
						"//h5[text()='Find the position of the Submit button']//following-sibling::button/span[2]"))
				.getLocation();
		System.out.println("Position of Submit Button:" + location);

		// Find the Save button color
		String cssValue = driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following::button[1]"))
				.getCssValue("color");
		System.out.println("Color of the button:" + cssValue);

		// Find the height and width of this button
		Dimension size = driver
				.findElement(By.xpath("//h5[text()='Find the height and width of this button']//following::button[1]"))
				.getSize();
		System.out.println("Size of the button:" + size);

		// Mouse over and confirm the color changed
		String color1 = driver
				.findElement(
						By.xpath("//h5[text()='Mouse over and confirm the color changed']/following::button[1]/span"))
				.getCssValue("background-color");
		System.out.println("Color before mouse hover:" + color1);
		Actions Build = new Actions(driver);
		Build.moveToElement(driver.findElement(
				By.xpath("//h5[text()='Mouse over and confirm the color changed']/following::button[1]/span")))
				.perform();
		Thread.sleep(2000);
		String color2 = driver
				.findElement(
						By.xpath("//h5[text()='Mouse over and confirm the color changed']/following::button[1]/span"))
				.getCssValue("background-color");
		System.out.println("Color after mouse hover:" + color2);
		if (color1 != color2)
			System.out.println("Color changed after mouse hover");
		else
			System.out.println("Color not changed after mouse hover");

		// Click Image Button and Click on any hidden button
		driver.findElement(By
				.xpath("//h5[text()='Click Image Button and Click on any hidden button']/following-sibling::div//span"))
				.click();

		boolean image = driver.findElement(By.xpath("//div[@class='ui-overlaypanel-content']")).isDisplayed();
		if (image)
			System.out.println("Image appears after clicking image button");
		else
			System.out.println("Image doesn't appears after clickingimage button");

		// Click on anywhere to hide the image
		driver.findElement(By.xpath("//h5[text()='Click Image Button and Click on any hidden button']")).click();
		boolean image1 = driver.findElement(By.xpath("//div[@class='ui-overlaypanel-content']")).isDisplayed();
		if (!image1)
			System.out.println("Image disappeared");
		else
			System.out.println("Image is still appearing");

		List<WebElement> roundedButtons = driver.findElements(By.xpath(
				"//h5[text()='How many rounded buttons are there?']/following::button[contains(@class,'rounded-button')]"));
		int size2 = roundedButtons.size();
		System.out.println("Number of rounded buttons:" + size2);
	}

}
