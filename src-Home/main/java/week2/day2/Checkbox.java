package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Basic Checkbox
		driver.findElement(By.xpath("//h5[text()='Basic Checkbox']/following::span[2]")).click();
		boolean checkBox1 = driver.findElement(By.xpath("//h5[text()='Basic Checkbox']/following::input[1]"))
				.isSelected();
		if (checkBox1)
			System.out.println("Checkbox is selected");
		else
			System.out.println("Checkbox is not selected");

		// Notification

		driver.findElement(By.xpath("//h5[text()='Notification']//following::span[2]")).click();
		boolean notify = driver.findElement(By.xpath("//h5[text()='Notification']//following::span[text()='Checked']"))
				.isDisplayed();
		if (notify)
			System.out.println("Notification appears after checked");
		else
			System.out.println("Notification doesn't appears");

		// Choose your favorite language(s)
		// Choosing Java
		driver.findElement(By.xpath("//h5[text()='Choose your favorite language(s)']//following::label[text()='Java']"))
				.click();
		// Choosing C-Sharp
		driver.findElement(
				By.xpath("//h5[text()='Choose your favorite language(s)']//following::label[text()='C-Sharp']"))
				.click();
		// Choosing others
		driver.findElement(
				By.xpath("//h5[text()='Choose your favorite language(s)']//following::label[text()='Others']")).click();

		// TriState Checkbox
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']//following::div[5]")).click();
		// Verify State=1 appears
		boolean State1 = driver
				.findElement(By.xpath("//h5[text()='Tri State Checkbox']//following::p[text()='State = 1']"))
				.isDisplayed();
		if (State1)
			System.out.println("Notification appeared for State changed to State=1");
		else
			System.out.println("Notification doesn't appears and checkbox is not selected");

		// double click to verify the state changed to State=0
		Actions Buid = new Actions(driver);
		WebElement tristate = driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']//following::div[5]"));
		Buid.doubleClick(tristate).perform();
		// verify notification for state=0 appears
		boolean State2 = driver
				.findElement(By.xpath("//h5[text()='Tri State Checkbox']//following::p[text()='State = 0']"))
				.isDisplayed();
		if (State2)
			System.out.println("Notification appeared for State changed to State=0");
		else
			System.out.println("Notification doesn't appears and checkbox is deselected");

		// Toggle Switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		boolean alert = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		if (alert)
			System.out.println("Notification appeared after clicking toggleSwitch");
		else
			System.out.println("Toggle Switch is not clicked correctly");

		// Verify if check box is disabled
		// boolean enabled =
		// driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled();

		WebElement findElement = driver.findElement(
				By.xpath("//h5[text()='Verify if check box is disabled']/following::div[contains(@class,'disabled')]"));
		String dis = findElement.getAttribute("class");
		Boolean disenabled = dis.contains("disabled");
		if (disenabled)
			System.out.println("The Checkbox is disabled");
		else
			System.out.println("Checkbox is enabled");

		// Select Multiple
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();

	}

}
