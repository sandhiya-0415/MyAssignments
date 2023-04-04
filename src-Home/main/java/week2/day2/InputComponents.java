package week2.day2;
//Assignment 3

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputComponents {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// parent to child xpath;Type your name
		driver.findElement(By.xpath("//div[@class='col-12']/input")).sendKeys("Sandhiya E");

		// Sibling of grandparent-->following grandparent's grandchild(following);Append
		// Country to this City.
		driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following-sibling::div//input"))
				.sendKeys("India");
		// Elder cousin to younger cousin;Verify if text box is disabled
		Boolean textbox = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']//following::input")).isEnabled();
		if (!textbox)
			System.out.println("Textbox is disbaled");
		else
			System.out.println("texbox is disabled");

		// Clear the typed text.
		driver.findElement(By.xpath("//h5[text()='Clear the typed text.']/following-sibling::div//input")).clear();
		// Sibling of grandparent-->preceding grandparent's
		// grandchild(preceding).Retrieve the typed text.
		WebElement text = driver.findElement(By.xpath(
				"//h5[text()='Type email and Tab. Confirm control moved to next element.']/preceding-sibling::div[1]//input"));
		System.out.println("Text displayed:" + text.getAttribute("value"));

		// Type email and Tab. Confirm control moved to next element.
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
		email.sendKeys("testmail@alight.com");
		email.sendKeys(Keys.TAB);

		// Type about yourself
		driver.findElement(By.xpath("//h5[text()='Type about yourself']/following::div//textarea"))
				.sendKeys("I am a Software test Engineer");
		// Text Editor;Text should be Italic
		driver.findElement(By.xpath("//h5[text()='Text Editor']/following::div[4]//button[@class='ql-italic']"))
				.click();
		// Text Editor;Text should be of large Size
		driver.findElement(
				By.xpath("(//h5[text()='Text Editor']/following::div[4]//span[@class='ql-picker-label'])[2]")).click();
		// text Editor;Selecting Large from drop down
		driver.findElement(By.xpath("//h5[text()='Text Editor']/following::div[4]//span[@data-value='large']")).click();
		// Text editor;enter the text in text editor
		driver.findElement(By.xpath("//h5[text()='Text Editor']/following::div[5]//p"))
				.sendKeys("I have 10 yearsof experience");
		// Just Press Enter and confirm error message*
		driver.findElement(By.xpath("//h5[text()='Just Press Enter and confirm error message*']/following::div//input"))
				.sendKeys(Keys.ENTER);
		String Error = driver
				.findElement(
						By.xpath("//h5[text()='Just Press Enter and confirm error message*']/following::div//span[2]"))
				.getText();
		if (Error.contains("Age is mandatory"))
			System.out.println("Error text is matching");
		else
			System.out.println("Error text is not matching");
		// Click and Confirm Label Position Changes
		WebElement loc = driver.findElement(
				By.xpath("//h5[text()='Click and Confirm Label Position Changes']/following::span//input"));
		Point location = loc.getLocation();
		loc.click();
		Point location2 = loc.getLocation();
		if (location == location2)
			System.out.println("Location doesn't change");
		else
			System.out.println("Location changed");
		// Type your name and choose the third option
		WebElement Name = driver.findElement(
				By.xpath("//h5[text()='Type your name and choose the third option']/following::div[1]//input"));
		Name.sendKeys("Sandhiya");
		driver.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']//li[3]")).click();
		// Type your DOB (mm/dd/yyyy) and confirm date chosen
		driver.findElement(
				By.xpath("//h5[text()='Type your DOB (mm/dd/yyyy) and confirm date chosen ']/following::span[1]/input"))
				.sendKeys("07/04/1991");

		String date = driver.findElement(By.xpath("//a[@class=' ui-state-default ui-state-active']")).getText();
		System.out.print("DOB:" + date);
		String Month = driver
				.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']"))
				.getText();
		String year = driver
				.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']"))
				.getText();
		System.out.println(" " + Month + year);
		String val1 = "5";
		driver.findElement(
				By.xpath("//h5[text()='Type number and spin to confirm value changed']/following::span/input"))
				.sendKeys(val1);
		driver.findElement(By.xpath("//h5[text()='Type number and spin to confirm value changed']/following::a[1]"))
				.click();
		String val2 = driver
				.findElement(
						By.xpath("//h5[text()='Type number and spin to confirm value changed']/following::span/input"))
				.getText();
		if (!val1.equals(val2))
			System.out.println("Value changed after spinning");
		else
			System.out.println("Value not changed after spinning");

		// Type random number (1-100) and confirm slider moves correctly
		driver.findElement(By.xpath(
				"//h5[text()='Type random number (1-100) and confirm slider moves correctly']//following-sibling::input[1]"))
				.sendKeys("43");

		Thread.sleep(2000);

		String val3 = driver
				.findElement(
						By.xpath("//div[@class='ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min']"))
				.getAttribute("style");
		System.out.println("Slider Value:" + val3);
		// Click and Confirm Keyboard appears
		driver.findElement(By.xpath("//h5[text()='Click and Confirm Keyboard appears']/following::input")).click();
		Boolean Keyboard_dsp = driver.findElement(By.xpath(
				"//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']"))
				.isDisplayed();
		if (Keyboard_dsp)
			System.out.println("Keyboard appears");
		else
			System.out.println("Keyboard doesn't appears");

		// Custom Toolbar;Making the text underlined
		driver.findElement(By.xpath("(//button[@class='ql-underline'])[2]")).click();
		driver.findElement(By.xpath("//h5[text()='Custom Toolbar']/following::div[@class='ql-editor ql-blank']"))
				.sendKeys("Verifying the custom toolbar");
	}

}
